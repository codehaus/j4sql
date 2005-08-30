/*
 * Created on Aug 28, 2005
 */

package org.j4sql.impl;

import java.util.HashMap;
import java.util.Map;

import org.j4sql.common.DbPlatform;
import org.j4sql.common.NotSupportedException;


/**
 * Standard SQL platform to help default typemapping support.
 * 
 * @author Laszlo Hornyak
 */
public abstract class StandardSQLPlatform implements DbPlatform {

	private final static Map m_defaultTypeMap = new HashMap();

	static {
		//uncomplete, unchecked
		m_defaultTypeMap.put(String.class.getName(), "varchar");
		m_defaultTypeMap.put(Integer.class.getName(), "int");
		m_defaultTypeMap.put(Short.class.getName(), "short");
	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#getDefaultRDBMSType(java.lang.String)
	 */
	public String getDefaultRDBMSType(String classname)
			throws NotSupportedException {
		return (String) m_defaultTypeMap.get(classname);
	}

}