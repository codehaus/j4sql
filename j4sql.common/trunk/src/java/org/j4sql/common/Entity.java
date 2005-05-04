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
	public String getComment() {
		return m_comment;
	}
	public void setComment(String comment) {
		this.m_comment = comment;
	}
	public String getName() {
		return m_name;
	}
	public void setName(String name) {
		this.m_name = name;
	}
	private String m_name = null;
	private String m_comment = null;
}
