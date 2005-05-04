/*
 * Created on May 4, 2005
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
	 */
	public void writeEntity(Entity entity, PrintWriter out);
}