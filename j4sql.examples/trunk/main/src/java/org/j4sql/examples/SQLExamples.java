package org.j4sql.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import org.apache.bsf.BSFException;
import org.apache.bsf.BSFManager;

/**
 * @author Laszlo Hornyak
 */
public class SQLExamples {

	/**
	 * Run an evaluation script on each row of a resultset.
	 * 
	 * @param Sql
	 *            an SQL script to execute
	 * @param somelogic
	 *            a BSF script to execute on each row
	 * @param lang
	 *            the language of the script
	 * @return		the primary key of the column that has the largest evaluation.
	 * @throws SQLException
	 * 
	 * @j4sql.function name="get_best_id" sqlAccess="reads"
	 *                 deterministic="false"
	 */
	public static int getBestId(String Sql, String somelogic, String lang)
			throws SQLException, BSFException {

		BSFManager manager = new BSFManager();
		Connection conn = null;
		Statement sta = null;
		ResultSet res = null;

		try {
			conn = DriverManager.getConnection("jdbc:default:connection");
			sta = conn.createStatement();
			res = sta.executeQuery(Sql);

			manager.declareBean("conn", conn, Connection.class);

			while (res.next()) {
				Map dataMap = new HashMap();
				ResultSetMetaData metaData = res.getMetaData();
				int colcount = metaData.getColumnCount();
				for (int i = 1; i < colcount; i++) {
					String colName = metaData.getColumnName(i);
					int type = metaData.getColumnType(i);
					Object o = null;
					switch (type) {
					case Types.VARCHAR:
						o = res.getString(i);
						break;
					case Types.BIGINT:
						o = res.getBigDecimal(i);
						break;
					case Types.BOOLEAN:
						o = new Boolean(res.getBoolean(i));
						break;
					case Types.DATE:
						o = res.getDate(i);
						break;
					case Types.DECIMAL:
						o = new Long(res.getLong(i));
						break;
					case Types.DOUBLE:
						o = new Double(res.getDouble(i));
						break;
					case Types.FLOAT:
						o = res.getBigDecimal(i);
						break;
					case Types.INTEGER:
						o = new Integer(res.getInt(i));
						break;
					case Types.SMALLINT:
						o = new Short(res.getShort(i));
						break;
					default:
						throw new SQLException("not supported data type");
					}
				}
				manager.registerBean("data", dataMap);
				Object ret = manager.eval(lang, somelogic, 0, 0, null);

			}
		} finally {
			if (res != null)
				res.close();
			if (sta != null)
				sta.close();
			if (conn != null)
				conn.close();
		}
		return 1;
	}

}
