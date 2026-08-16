package singleton;

public class Client {
	
	public static void doQuery1() {
		ConnectionPool pool = ConnectionPool.getConnectionPool();
		Connection connection = pool.getConnection();
		
		if(connection != null) {
			connection.query("Select * from Object");
			connection.setInUse(Boolean.FALSE);
		}
	}
	public static void doQuery2() {
		ConnectionPool pool = ConnectionPool.getConnectionPool();
		Connection connection = pool.getConnection();
		
		if(connection != null) {
			connection.query("Select * from Object");
			
		}
	}
	public static void doQuery3() {
		ConnectionPool pool = ConnectionPool.getConnectionPool();
		Connection connection = pool.getConnection();
		
		if(connection != null) {
			connection.query("Select * from Object");
		}
	}

	public static void main(String[] args) {
		System.out.println("pool Size: "+ConnectionPool.POOL_SIZE);
		doQuery1();
		doQuery2();
		doQuery3();

	}

}
