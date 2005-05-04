/*
 * Created on May 4, 2005
 */
package org.j4sql.common;


/**
 * @author Laszlo Hornyak
 */
public class Function extends Callable {
	String javaReturnType = null;
	String returnType = null;
	public String getJavaReturnType() {
		return javaReturnType;
	}
	public void setJavaReturnType(String javaReturnType) {
		this.javaReturnType = javaReturnType;
	}
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
}
