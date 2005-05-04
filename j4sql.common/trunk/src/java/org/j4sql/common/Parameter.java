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

	public static final int PARAM_TYPE_IN = 0;
	public static final int PARAM_TYPE_OUT = 1;
	public static final int PARAM_TYPE_INOUT = 2;

	public String getJavaType() {
		return javaType;
	}

	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParamType() {
		return paramType;
	}

	public void setParamType(int paramType) {
		this.paramType = paramType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	String name;
	String javaType;
	String type;
	int paramType = PARAM_TYPE_IN;
}