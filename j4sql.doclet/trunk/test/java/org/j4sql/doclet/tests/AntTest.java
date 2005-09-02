package org.j4sql.doclet.tests;

import junit.framework.TestCase;

import org.apache.tools.ant.launch.Launcher;

/**
 * @author laszlo_hornyak
 */
public class AntTest extends TestCase {
	public void testAntRun(){
		Launcher.main(new String[]{"-f","test/java/org/j4sql/doclet/tests/build1.xml"});
	}
}
