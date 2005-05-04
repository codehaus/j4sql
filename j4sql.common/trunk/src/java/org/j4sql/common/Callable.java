/*
 * Created on May 4, 2005
 */
package org.j4sql.common;

import java.util.List;


/**
 * @author Laszlo Hornyak
 */
public abstract class Callable extends Entity {
	public static final int SECURITY_DEFINER = 1;
	public static final int SECURITY_INVOKER = 0;
	
	public static final short SQLACCESS_NO = 0;
	public static final short SQLACCESS_CONTAINS = 1;
	public static final short SQLACCESS_READS = 2;
	public static final short SQLACCESS_MODIFIES = 3;
	
	int security = SECURITY_INVOKER;
	int sqlAccess = SQLACCESS_MODIFIES;
	List parameters = null;
	boolean deterministic = false;
	boolean calledOnNullInput = false;
	
	
	public List getParameters() {
		return parameters;
	}
	public void setParameters(List parameters) {
		this.parameters = parameters;
	}
	public int getSecurity() {
		return security;
	}
	public void setSecurity(int security) {
		this.security = security;
	}
	public boolean isCalledOnNullInput() {
		return calledOnNullInput;
	}
	public void setCalledOnNullInput(boolean calledOnNullInput) {
		this.calledOnNullInput = calledOnNullInput;
	}
	public boolean isDeterministic() {
		return deterministic;
	}
	public void setDeterministic(boolean deterministic) {
		this.deterministic = deterministic;
	}
	public int getSqlAccess() {
		return sqlAccess;
	}
	public void setSqlAccess(int sqlAccess) {
		this.sqlAccess = sqlAccess;
	}
}
