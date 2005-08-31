package org.j4sql.impl;

import java.io.PrintWriter;

import org.j4sql.common.Entity;
import org.j4sql.common.NotSupportedException;

/**
 * @author laszlo_hornyak
 * 
 * // TODO: Edit documentation for OraclePlatform
 */
public class OraclePlatform extends StandardSQLPlatform {

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
		return "Oracle Database 10g";
	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeDeployJar(java.lang.String, java.lang.String, java.io.PrintWriter)
	 */
	public void writeDeployJar(String jar, String jarname, PrintWriter out)
			throws NotSupportedException {
		out.write("\n\nCALL sqlj.install_jar ( \'"
				+ jar.replaceAll("\'", "\\\'") + "\' , \'"
				+ jarname.replaceAll("\'", "\\\'") + "\' , 1 )");

	}

	/* (non-Javadoc)
	 * @see org.j4sql.common.DbPlatform#writeUndeployJar(java.lang.String, java.io.PrintWriter)
	 */
	public void writeUndeployJar(String jarname, PrintWriter out)
			throws NotSupportedException {
		// TODO Auto-generated method stub

	}

}
