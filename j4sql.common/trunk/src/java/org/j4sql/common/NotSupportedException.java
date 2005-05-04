/*
 * Copyright (c) 2005 The J4SQL Developers
 * Distributed under the terms shown in the file COPYRIGHT
 * found in the root directory of this distribution or at
 * http://j4sql.codehaus.org/COPYRIGHT.html
 */

package org.j4sql.common;


/**
 * Thrown if a requested feature is not implemented by the targeted DB platform.
 * 
 * @author Laszlo Hornyak
 */
public class NotSupportedException extends Exception {

	/**
	 * 
	 */
	public NotSupportedException() {
		super();
	}
	/**
	 * @param message
	 */
	public NotSupportedException(String message) {
		super(message);
	}
	/**
	 * @param message
	 * @param cause
	 */
	public NotSupportedException(String message, Throwable cause) {
		super(message, cause);
	}
	/**
	 * @param cause
	 */
	public NotSupportedException(Throwable cause) {
		super(cause);
	}
}
