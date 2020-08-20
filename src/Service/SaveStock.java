package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Constant.ConstantClassField;

public class SaveStock {

	Connection conn = null;
	PreparedStatement ps = null;

	/**
	 * 执行数据库插入操作
	 *
	 * @param datas     插入数据表中key为列名和value为列对应的值的Map对象的List集合
	 * @param tableName 要插入的数据库的表名
	 * @return 影响的行数
	 * @throws SQLException SQL异常
	 */
	public int insertAll(String tableName, List<Map<String, Object>> datas)
			throws SQLException, ClassNotFoundException {
		/** 影响的行数 **/
		int affectRowCount = -1;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			/** 从数据库连接池中获取数据库连接 **/
			Class.forName(ConstantClassField.JDBC_DRIVER);
			connection = DriverManager.getConnection(ConstantClassField.DB_URL, ConstantClassField.USER,
					ConstantClassField.PASS);
			Map<String, Object> valueMap = datas.get(0);
			/** 获取数据库插入的Map的键值对的值 **/
			Set<String> keySet = valueMap.keySet();
			Iterator<String> iterator = keySet.iterator();
			/** 要插入的字段sql，其实就是用key拼起来的 **/
			StringBuilder columnSql = new StringBuilder();
			/** 要插入的字段值，其实就是？ **/
			StringBuilder unknownMarkSql = new StringBuilder();
			Object[] keys = new Object[valueMap.size()];
			int i = 0;
			while (iterator.hasNext()) {
				String key = iterator.next();
				keys[i] = key;
				columnSql.append(i == 0 ? "" : ",");
				columnSql.append(key);
				unknownMarkSql.append(i == 0 ? "" : ",");
				unknownMarkSql.append("?");
				i++;
			}
			/** 开始拼插入的sql语句 **/
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO ");
			sql.append(tableName);
			sql.append(" (");
			sql.append(columnSql);
			sql.append(" )  VALUES (");
			sql.append(unknownMarkSql);
			sql.append(" )");

			/** 执行SQL预编译 **/
			preparedStatement = connection.prepareStatement(sql.toString());
			/** 设置不自动提交，以便于在出现异常的时候数据库回滚 **/
			connection.setAutoCommit(false);
			System.out.println(sql.toString());
			for (int j = 0; j < datas.size(); j++) {
				for (int k = 0; k < keys.length; k++) {
					preparedStatement.setObject(k + 1, datas.get(j).get(keys[k]));
				}
				preparedStatement.addBatch();
			}
			int[] arr = preparedStatement.executeBatch();
			connection.commit();
			affectRowCount = arr.length;
			System.out.println("成功了插入了" + affectRowCount + "行");
			System.out.println();
		} catch (Exception e) {
			if (connection != null) {
				connection.rollback();
			}
			e.printStackTrace();
			throw e;
		} finally {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		return affectRowCount;
	}

	/**
	 * 清空货位库存数据
	 */
	public int DeleteHwkcData() throws SQLException {
		int count = 0;
		conn = DriverManager.getConnection(ConstantClassField.DB_URL, ConstantClassField.USER, ConstantClassField.PASS); 
		String sql = "DELETE FROM hwkc"; // sql语句
		try {
			ps = conn.prepareStatement(sql);
			count = ps.executeUpdate(); // 执行sql语句
			System.out.println("删除成功(*￣︶￣");
		} catch (SQLException e) {
			System.out.println("操作失败o(╥﹏╥");
			e.printStackTrace();
		} finally {
			ps.close();
			conn.close();
		}
		return count;
	}
}
