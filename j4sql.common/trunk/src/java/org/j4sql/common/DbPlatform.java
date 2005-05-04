/*
 * Copyright (c) 2005 The J4SQL Developers
 * Distributed under the terms shown in the file COPYRIGHT
 * found in the root directory of this distribution or at
 * http://j4sql.codehaus.org/COPYRIGHT.html
 */

package org.j4sql.common;


import java.io.PrintWriter;


/**
 * Adapter interface for various databse platforms.
 * 
 * @author Laszlo Hornyak
 */
public interface DbPlatform {
	/**
	 * Writre the DDL of the given entity to the output.
	 * @param entity	the entity to write out
	 * @param out		the output
	 * @throws NotSupportedException	if the entity type is not supported
	 */
	public void writeEntity(Entity entity, PrintWriter out) throws NotSupportedException;

	/**
	 * Get the name of the DB platform.
	 * 
	 * @return the name of the DB platform.
	 */
	public String getName();
	
	/**
	 * Write sql comments.
	 * 
	 * @param comment	the string to be written to output as comment
	 * @param out		the output
	 */
	public void writeComment(String comment, PrintWriter out);
}