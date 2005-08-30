/*
 * Created on Aug 30, 2005
 * Copyright(C) 2005 Epam
 */
package org.j4sql.doclet.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author laszlo_hornyak
 * 
 * // TODO: Edit documentation for AllTests
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.j4sql.doclet.tests");
		//$JUnit-BEGIN$
		suite.addTestSuite(AntTest.class);
		//$JUnit-END$
		return suite;
	}
}
