/*
 * Copyright (c) 2005 The J4SQL Developers
 * Distributed under the terms shown in the file COPYRIGHT
 * found in the root directory of this distribution or at
 * http://j4sql.codehaus.org/COPYRIGHT.html
 */

package org.j4sql.common;


/**
 * Represents an SQL User Defined Function.
 * 
 * @author Laszlo Hornyak
 */
public class Function extends Callable {
	private String m_javaReturnType = null;
	private String m_sqlReturnType = null;
	
	/**
	 * Get the java return type of the function.
	 * @return the FQN of the class
	 */
	public String getJavaReturnType() {
		return m_javaReturnType;
	}
	/**
	 * Set java return type.
	 * @param javaReturnType	the fqn of the class
	 */
	public void setJavaReturnType(String javaReturnType) {
		m_javaReturnType = javaReturnType;
	}
	
	/**
	 * Get RDBMS function return type.
	 * @return RDBMS function return type
	 */
	public String getSqlReturnType() {
		return m_sqlReturnType;
	}
	
	/**
	 * Set return type.
	 * @param returnType return type
	 */
	public void setSqlReturnType(String returnType) {
		m_sqlReturnType = returnType;
	}
}
