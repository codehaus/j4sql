/*
 * Created on Aug 28, 2005
 */
package org.j4sql.examples;


/**
 * Some very evident method.
 * 
 * @author Laszlo Hornyak
 */
public class MathematicalExamples {

	/**
	 * Sum two integers.
	 * @param a left argument of addition
	 * @param b right argument of addition
	 * @return a + b
	 * 
	 * @j4sql.function name="sum"
	 * @j4sql.returns long
	 */
	public static int sum(int a, int b){
		return a+b;
	}
	
}
