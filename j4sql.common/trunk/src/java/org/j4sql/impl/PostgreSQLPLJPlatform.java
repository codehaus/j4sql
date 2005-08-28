/*
 * Created on Aug 28, 2005
 */
package org.j4sql.impl;

import org.j4sql.common.Function;


/**
 * @author Laszlo Hornyak
 */
//TODO: edit comments for PostgreSQLPLJPlatform
public class PostgreSQLPLJPlatform extends PostgreSQLPlatform {

	/* (non-Javadoc)
	 * @see org.j4sql.impl.PostgreSQLPlatform#langName()
	 */
	protected String langName() {
		return "plj";
	}

	/* (non-Javadoc)
	 * @see org.j4sql.impl.PostgreSQLPlatform#getCallDefinition(org.j4sql.common.Function)
	 */
	protected String getCallDefinition(Function function) {
		return "\tclass="+function.getJavaClassName()+"\n\tmethod="+function.getJavaMethodName()+"\n";
	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#getName()
	 */
	public String getName() {
		return "PostgreSQL + PLJ";
	}


}
