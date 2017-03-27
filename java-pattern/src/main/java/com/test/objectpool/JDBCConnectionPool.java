package com.test.objectpool;

public class JDBCConnectionPool extends ObjectPool {
	private String dsn;
	private String usr;
	private String pwd;

	public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
		try {
			Class.forName(driver).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.dsn = dsn;
		this.usr = usr;
		this.pwd = pwd;
	}

	public Connection borrowConnection() {
		return ((Connection) super.checkOut());
	}

	public void returnConnection(Connection c) {
		super.checkIn(c);
	}

	@Override
	Object create() {
		try {
			return (DriverManager.getConnection(dsn, usr, pwd));
		} catch (SQLException e) {
			e.printStackTrace();
			return (null);
		}
	}

	@Override
	boolean validate(Object o) {
		try {
			return (!((Connection) o).isClosed());
		} catch (SQLException e) {
			e.printStackTrace();
			return (false);
		}
	}

	@Override
	void expire(Object o) {
		try {
			((Connection) o).close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}