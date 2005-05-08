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
	
	private short m_when = FIRED_BEFORE;
	private Callable m_callable = null;
	private int m_scope = SCOPE_ROW;
	
	private boolean m_firedOnInsert = false;
	private boolean m_firedOnDelete = false;
	private boolean m_firedOnUpdate = false;
	
	public Callable getCallable() {
		return this.m_callable;
	}
	public void setCallable(Callable callable) {
		m_callable = callable;
	}
	public short getWhen() {
		return m_when;
	}
	public void setWhen(short fired) {
		m_when = fired;
	}
	public boolean isFiredOnDelete() {
		return m_firedOnDelete;
	}
	public void setFiredOnDelete(boolean firedOnDelete) {
		m_firedOnDelete = firedOnDelete;
	}
	public boolean isFiredOnInsert() {
		return m_firedOnInsert;
	}
	public void setFiredOnInsert(boolean firedOnInsert) {
		m_firedOnInsert = firedOnInsert;
	}
	public boolean isFiredOnUpdate() {
		return m_firedOnUpdate;
	}
	public void setFiredOnUpdate(boolean firedOnUpdate) {
		m_firedOnUpdate = firedOnUpdate;
	}
	public int getScope() {
		return m_scope;
	}
	public void setScope(int scope) {
		m_scope = scope;
	}
}
