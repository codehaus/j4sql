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
	
	public static final short FIRED_BEFORE = 0;
	public static final short FIRED_AFTER = 1;
	
	public static final short SCOPE_ROW = 0;
	public static final short SCOPE_STATEMENT = 1;
	
	short fired = FIRED_BEFORE;
	Callable callable = null;
	int scope = SCOPE_ROW;
	
	boolean firedOnInsert = false;
	boolean firedOnDelete = false;
	boolean firedOnUpdate = false;
	
	public Callable getCallable() {
		return callable;
	}
	public void setCallable(Callable callable) {
		this.callable = callable;
	}
	public short getFired() {
		return fired;
	}
	public void setFired(short fired) {
		this.fired = fired;
	}
	public boolean isFiredOnDelete() {
		return firedOnDelete;
	}
	public void setFiredOnDelete(boolean firedOnDelete) {
		this.firedOnDelete = firedOnDelete;
	}
	public boolean isFiredOnInsert() {
		return firedOnInsert;
	}
	public void setFiredOnInsert(boolean firedOnInsert) {
		this.firedOnInsert = firedOnInsert;
	}
	public boolean isFiredOnUpdate() {
		return firedOnUpdate;
	}
	public void setFiredOnUpdate(boolean firedOnUpdate) {
		this.firedOnUpdate = firedOnUpdate;
	}
	public int getScope() {
		return scope;
	}
	public void setScope(int scope) {
		this.scope = scope;
	}
}
