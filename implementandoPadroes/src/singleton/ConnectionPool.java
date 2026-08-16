package singleton;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static ConnectionPool singleton = new ConnectionPool();
	
	public static final int POOL_SIZE = 2;
	private List<Connection> conexoes = new ArrayList<>();
	
	public static ConnectionPool getConnectionPool() {
		return singleton;
	}
	
	private ConnectionPool() {
		System.out.println("criando pool de conexões");
		
		for(int i=0; i< POOL_SIZE; i++) {
			conexoes.add(new Connection());
		}
	}
	
	public Connection getConnection() {
		Connection avaliable = null;
		for (Connection connection : conexoes) {
			if( !connection.getInUse()) {
				avaliable = connection;
				break;
			}
			if(avaliable == null) {
				System.out.println("No Connections avaiable");
				return null;
			}
			
		}
		avaliable.setInUse(true);
		return avaliable;
	}
	
	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}

}
