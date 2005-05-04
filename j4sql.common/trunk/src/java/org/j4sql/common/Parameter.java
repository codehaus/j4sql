/*
 * Copyright (c) 2005 The J4SQL Developers
 * Distributed under the terms shown in the file COPYRIGHT
 * found in the root directory of this distribution or at
 * http://j4sql.codehaus.org/COPYRIGHT.html
 */


package org.j4sql.common;


/**
 * @author Laszlo Hornyak
 */
public class Parameter {

	/** Parameter type: in */
	public static final int PARAM_TYPE_IN = 0;
	/** Parameter type: out */
	public static final int PARAM_TYPE_OUT = 1;
	/** Parameter type: in and out */
	public static final int PARAM_TYPE_INOUT = 2;

	public String getJavaType() {
		return m_javaType;
	}

	public void setJavaType(String javaType) {
		this.m_javaType = javaType;
	}

	public String getName() {
		return m_name;
	}

	public void setName(String name) {
		this.m_name = name;
	}

	public int getParamType() {
		return m_paramType;
	}

	public void setParamType(int paramType) {
		this.m_paramType = paramType;
	}

	public String getType() {
		return m_type;
	}

	public void setType(String type) {
		this.m_type = type;
	}
	private String m_name;
	private String m_javaType;
	private String m_type;
	private int m_paramType = PARAM_TYPE_IN;
}