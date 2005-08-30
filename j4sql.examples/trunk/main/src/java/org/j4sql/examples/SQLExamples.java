package org.j4sql.examples;

import java.sql.SQLException;

/**
 * @author Laszlo Hornyak
 */
public class SQLExamples {

	/**
	 * Run an evaluation script on each row of a resultset.
	 * 
	 * @param Sql				an SQL script to execute 
	 * @param somelogic			a BSF script to execute on each row 
	 * @param lang				the language of the script
	 * @return
	 * @throws SQLException
	 * 
	 * @j4sql.function name="get_best_id" sqlAccess="reads" deterministic="false"
	 */
	public static int getBestId(String Sql, String somelogic, String lang) throws SQLException {
		
		return 1;
	}
	
}
