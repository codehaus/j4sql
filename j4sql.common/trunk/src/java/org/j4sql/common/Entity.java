/*
 * Created on May 4, 2005
 */
package org.j4sql.common;


/**
 * @author Laszlo Hornyak
 */
public abstract class Entity {
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name = null;
	String comment = null;
}
