package org.j4sql.impl;

import java.io.PrintWriter;

import org.j4sql.common.Entity;
import org.j4sql.common.Function;
import org.j4sql.common.NotSupportedException;

/**
 * Oracle 10g Platform implementation. See 
 * 
 * @author Laszlo Hornyak
 */
public class OraclePlatform extends StandardSQLPlatform {

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeEntity(org.j4sql.common.Entity, java.io.PrintWriter)
	 */
	public void writeEntity(Entity entity, PrintWriter out)
			throws NotSupportedException {
		if(entity instanceof Function){
			writeFunction((Function)entity, out);
		} else {
			throw new NotSupportedException("Not supported.");
		}
	}

	/**
	 * Write deployment code of function to output.
	 * see http://download-uk.oracle.com/docs/cd/B19306_01/server.102/b14200/statements_5009.htm#sthref5063
	 * 
	 * @param function
	 * @param out
	 * @throws NotSupportedException
	 */
	protected void writeFunction(Function function, PrintWriter out) throws NotSupportedException {
		out.print("CREATE OR REPLACE FUNCTION ");
		if(function.getSchema() != null){
			out.print(function.getSchema());
			out.print(".");
		}
		out.print(function.getName());
		
	}
	
	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#getName()
	 */
	public String getName() {
		return "Oracle Database 10g";
	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeDeployJar(java.lang.String, java.lang.String, java.io.PrintWriter)
	 */
	public void writeDeployJar(String jar, String jarname, PrintWriter out)
			throws NotSupportedException {
		out.write("\n\nCALL sqlj.install_jar ( \'"
				+ jar.replaceAll("\'", "\\\'") + "\' , \'"
				+ jarname.replaceAll("\'", "\\\'") + "\' , 1 )");

	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeUndeployJar(java.lang.String, java.io.PrintWriter)
	 */
	public void writeUndeployJar(String jarname, PrintWriter out)
			throws NotSupportedException {
		// TODO Auto-generated method stub

	}

}
