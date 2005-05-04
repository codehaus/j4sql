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
public abstract class Entity {
	
	/**
	 * Get the entity comment. Possibly a good candidate to push to the database with a 'COMMENT ON ...' statement, or simple sql comments if not supported.
	 * @return	the entity comment.
	 */
	public String getComment() {
		return this.m_comment;
	}
	
	/**
	 * Set comment.
	 * @param comment the new comment
	 */
	public void setComment(String comment) {
		this.m_comment = comment;
	}
	
	/**
	 * Get the name of the entity.
	 * @return the name
	 */
	public String getName() {
		return this.m_name;
	}
	
	/**
	 * Set the name of the entity.
	 * @param name the name
	 */
	public void setName(String name) {
		this.m_name = name;
	}
	private String m_name = null;
	private String m_comment = null;
}
