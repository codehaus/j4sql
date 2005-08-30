/*
 * Created on Aug 27, 2005
 */
package org.j4sql.impl;

import java.io.PrintWriter;
import java.util.Iterator;

import org.j4sql.common.Callable;
import org.j4sql.common.DbPlatform;
import org.j4sql.common.Entity;
import org.j4sql.common.Function;
import org.j4sql.common.NotSupportedException;
import org.j4sql.common.Parameter;
import org.j4sql.common.Procedure;
import org.j4sql.common.Trigger;


/**
 * Abstract baseclass for PostgreSQL Java language implementations.
 * 
 * @author Laszlo Hornyak
 */
public abstract class PostgreSQLPlatform extends StandardSQLPplatform {

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeEntity(org.j4sql.common.Entity, java.io.PrintWriter)
	 */
	public void writeEntity(Entity entity, PrintWriter out)
			throws NotSupportedException {
		if(entity instanceof Trigger) {
			writeTrigger((Trigger)entity, out);
		} else if(entity instanceof Callable) {
			if(entity instanceof Function) {
				writeFunction((Function)entity, out);
			} else if(entity instanceof Procedure){
				throw new NotSupportedException("PostgreSQL does not support procedures.");
			} else
				throw new NotSupportedException("Entity class not supported:"+entity.getClass());
		} else {
			throw new NotSupportedException("Entity class not supported:"+entity.getClass());
		}
	}
	
	private void writeTrigger(Trigger trigger, PrintWriter out) throws NotSupportedException {
		Callable triggerFn = trigger.getCallable();
		writeEntity(triggerFn, out);
		out.write(" CREATE OR REPLACE TRIGGER ");
		out.write(trigger.getSchema());
		out.write(".");
		out.println(trigger.getName());
		if(trigger.getWhen()==Trigger.FIRED_AFTER)
			out.write(" AFTER ");
		else
			out.write(" BEFORE ");
		
		if(trigger.isFiredOnDelete())
			out.write(" DELETE ");
		if(trigger.isFiredOnUpdate())
			out.write(" UPDATE ");
		if(trigger.isFiredOnInsert())
			out.write(" INSERT ");
		
		out.print(" ON ");
		out.print(trigger.getTable());
		out.print(" FOR EACH ");
		if(trigger.getScope() == Trigger.SCOPE_ROW)
			out.print("ROW");
		else
			out.print("STATEMENT");
		out.print(" EXECUTE PROCEDURE "+triggerFn.getSchema()+"."+triggerFn.getName());
	}
	
	private void writeFunction(Function function, PrintWriter out) throws NotSupportedException {
		out.print("CREATE OR REPLACE FUNCTION ");
		out.print(function.getSchema());
		out.print(".");
		out.println(function.getName());
		out.print("(");
		Iterator i = function.getParameters().iterator();
		while(i.hasNext()){
			Parameter p = (Parameter) i.next();
			
			if(p.getName() != null)
				out.print(p.getName());
			
			switch(p.getParamType()){
				case Parameter.PARAM_TYPE_IN: out.println(" in "); break;
				case Parameter.PARAM_TYPE_INOUT:
				case Parameter.PARAM_TYPE_OUT: throw new NotSupportedException("IN and INOUT parameters are not supported by PostgreSQL");
			}

			if(p.getSqlType() == null)
				out.print(getDefaultRDBMSType(p.getJavaType()));

			if(i.hasNext())
				out.print(", ");
		}
		out.println(")");
		out.print(" RETURNS ");
		if(function.getSqlReturnType() != null)
			out.print(function.getSqlReturnType());
		else
			out.print( getDefaultRDBMSType(function.getJavaReturnType()));
		
		out.print(" LANGUAGE \'"+langName()+"\' ");
		if(function.getSqlAccess() == Function.SQLACCESS_NO && function.isDeterministic())
			out.println(" IMMUTABLE ");
		else if( function.isDeterministic() )
			out.println(" STABLE ");
		else
			out.println(" VOLATILE ");
		
		if(function.getSecurity() == Function.SECURITY_DEFINER)
			out.println(" SECURITY DEFINER ");
		
		out.println("AS $$");
		out.print(getCallDefinition(function));
		out.println("$$ ;");
	}

	protected abstract String langName();

	protected abstract String getCallDefinition(Function function);
	
	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeComment(java.lang.String, java.io.PrintWriter)
	 */
	public void writeComment(String comment, PrintWriter out) {
		String str = "-- "+comment.replaceAll("\n","\n--");
		out.print(str);
	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#getDefaultRDBMSType(java.lang.String)
	 */
	public String getDefaultRDBMSType(String classname)
			throws NotSupportedException {
		//TODO: add extra classmappings
		return super.getDefaultRDBMSType(classname);
	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeDeployJar(java.lang.String, java.lang.String, java.io.PrintWriter)
	 */
	public void writeDeployJar(String jar, String jarname, PrintWriter out)
			throws NotSupportedException {
		out.write("select sqlj.install_jar ( \'"+jar.replaceAll("\'","\\\'")+"\' , \'"+jarname.replaceAll("\'","\\\'")+"\' , 1 )");
	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeUndeployJar(java.lang.String, java.io.PrintWriter)
	 */
	public void writeUndeployJar(String jarname, PrintWriter out)
			throws NotSupportedException {
		out.write("select sqlj.remove_jar ( \'"+jarname.replaceAll("\'","\\\'")+"\',1 )");
	}

	
	
}
