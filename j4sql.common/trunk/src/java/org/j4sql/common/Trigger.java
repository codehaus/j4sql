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
public class Trigger extends Entity {
	
	/** Trigger fired before the action. */
	public static final short FIRED_BEFORE = 0;
	/** Trigger fired after the action. */
	public static final short FIRED_AFTER = 1;
	
	/** Trigger fired for each row. */
	public static final short SCOPE_ROW = 0;
	/** Trigger fired for statement. */
	public static final short SCOPE_STATEMENT = 1;
	
	private short m_fired = FIRED_BEFORE;
	private Callable m_callable = null;
	private int m_scope = SCOPE_ROW;
	
	private boolean firedOnInsert = false;
	private boolean firedOnDelete = false;
	private boolean firedOnUpdate = false;
	
	public Callable getCallable() {
		return this.m_callable;
	}
	public void setCallable(Callable callable) {
		this.m_callable = callable;
	}
	public short getFired() {
		return this.m_fired;
	}
	public void setFired(short fired) {
		this.m_fired = fired;
	}
	public boolean isFiredOnDelete() {
		return this.firedOnDelete;
	}
	public void setFiredOnDelete(boolean firedOnDelete) {
		this.firedOnDelete = firedOnDelete;
	}
	public boolean isFiredOnInsert() {
		return this.firedOnInsert;
	}
	public void setFiredOnInsert(boolean firedOnInsert) {
		this.firedOnInsert = firedOnInsert;
	}
	public boolean isFiredOnUpdate() {
		return this.firedOnUpdate;
	}
	public void setFiredOnUpdate(boolean firedOnUpdate) {
		this.firedOnUpdate = firedOnUpdate;
	}
	public int getScope() {
		return this.m_scope;
	}
	public void setScope(int scope) {
		this.m_scope = scope;
	}
}
