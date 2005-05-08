/*
 * Copyright (c) 2005 The J4SQL Developers
 * Distributed under the terms shown in the file COPYRIGHT
 * found in the root directory of this distribution or at
 * http://j4sql.codehaus.org/COPYRIGHT.html
 */

package org.j4sql.common;

import java.util.List;


/**
 * @author Laszlo Hornyak
 */
public abstract class Callable extends Entity {

	/** Security: run as definer. */
	public static final int SECURITY_DEFINER = 1;
	/** Security: run as invoker. */
	public static final int SECURITY_INVOKER = 0;

	/** SQL access: none */
	public static final short SQLACCESS_NO = 0;
	/** SQL access: contains */
	public static final short SQLACCESS_CONTAINS = 1;
	/** SQL access: only reads */
	public static final short SQLACCESS_READS = 2;
	/** SQL access: modifies data */
	public static final short SQLACCESS_MODIFIES = 3;

	private int m_security = SECURITY_INVOKER;
	private int m_sqlAccess = SQLACCESS_MODIFIES;
	private List m_parameters = null;
	private boolean m_deterministic = false;
	private boolean m_calledOnNullInput = false;
	private String m_javaMethodName;

	/**
	 * Get call parameter list.
	 * @return call parameter list.
	 */
	public List getParameters() {
		return m_parameters;
	}

	/**
	 * Set parameter list.
	 * @param parameters	the parameter list
	 */
	public void setParameters(List parameters) {
		m_parameters = parameters;
	}

	/**
	 * Get security mode (SECURITY_INVOKER or SECURITY_DEFINER).
	 * @return security mode.
	 */
	public int getSecurity() {
		return m_security;
	}

	/**
	 * Set security.
	 * @param security the security mode (SECURITY_INVOKER or SECURITY_DEFINER)
	 */
	public void setSecurity(int security) {
		m_security = security;
	}

	/**
	 * Is called on null input? If yes, it will be called, if no, it wont and return a NULL.
	 * @return	true if called on null.
	 */
	public boolean isCalledOnNullInput() {
		return m_calledOnNullInput;
	}

	/**
	 * Set called on NULL input.
	 * @param calledOnNullInput	called on NULL input
	 */
	public void setCalledOnNullInput(boolean calledOnNullInput) {
		m_calledOnNullInput = calledOnNullInput;
	}

	/**
	 * Is the function deterministic?
	 * @return true if the function is deterministic.
	 */
	public boolean isDeterministic() {
		return m_deterministic;
	}

	/**
	 * Sets the value of deterministic.
	 * @param deterministic	deterministic
	 */
	public void setDeterministic(boolean deterministic) {
		m_deterministic = deterministic;
	}

	/**
	 * Get the value of SQL access mode.
	 * @return <code>SQLACCESS_NO</code>,<code>SQLACCESS_CONTAINS</code>,<code>SQLACCESS_READS</code>,<code>SQLACCESS_MODIFIES</code>
	 */
	public int getSqlAccess() {
		return m_sqlAccess;
	}

	/**
	 * Set the value of sqlaccess mode.
	 * @param sqlAccess	new value
	 */
	public void setSqlAccess(int sqlAccess) {
		m_sqlAccess = sqlAccess;
	}

	/**
	 * Get the fully qualified name of the Java method, i.e. <code>&lt;className&gt;.&lt;methodName&gt;.</code>
	 * @return The fully qualified name of the Java method.
	 */
	public final String getJavaMethodName() {
		return m_javaMethodName;
	}

	/**
	 * Set the fully qualified name of the Java method, i.e. <code>&lt;className&gt;.&lt;methodName&gt;.</code>
	 * @param javaMethodName The fully qualified method name.
	 */
	public final void setJavaMethodName(String javaMethodName) {
		m_javaMethodName = javaMethodName;
	}
}