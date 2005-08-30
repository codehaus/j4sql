package org.j4sql.doclet.tests;

import org.apache.tools.ant.Main;

import junit.framework.TestCase;

/**
 * @author laszlo_hornyak
 */
public class AntTest extends TestCase {
	public void testAntRun(){
		Main.main(new String[]{"-f","test/java/org/j4sql/doclet/tests/build1.xml"});
	}
}
