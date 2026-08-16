package singleton;

public class Connection {
	private boolean inUse;
	
	public Connection() {
		inUse = Boolean.FALSE;
	}
	
	public Object query(String sql) {
		System.out.println("Running "+sql+" in connection "+ this);
		return null;
	}

	public Boolean getInUse() {
		return inUse;
	}

	public void setInUse(Boolean inUse) {
		this.inUse = inUse;
	}
	
	

}
