package org.j4sql.examples;

/**
 * Trigger example procedures.
 * 
 * @author Laszlo Hornyak
 */
public class TriggerExamples {
	
	/**
	 * Trigger example.
	 * @param old
	 * @param _new
	 * @return
	 * 
	 * @j4sql.trigger name=""
	 */
	public static Object doTrigger(Object old, Object _new) {
		return _new;
	}
	
}
