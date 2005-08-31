package org.j4sql.impl;

import java.io.PrintWriter;

import org.j4sql.common.Entity;
import org.j4sql.common.NotSupportedException;

/**
 * DB2 RDNMS platform adapter implementation.
 * 
 * @author Laszlo Hornyak
 */
public class DB2Platform extends StandardSQLPlatform {

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeEntity(org.j4sql.common.Entity, java.io.PrintWriter)
	 */
	public void writeEntity(Entity entity, PrintWriter out)
			throws NotSupportedException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeDeployJar(java.lang.String, java.lang.String, java.io.PrintWriter)
	 */
	public void writeDeployJar(String jar, String jarname, PrintWriter out)
			throws NotSupportedException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeUndeployJar(java.lang.String, java.io.PrintWriter)
	 */
	public void writeUndeployJar(String jarname, PrintWriter out)
			throws NotSupportedException {
		// TODO Auto-generated method stub

	}

}
