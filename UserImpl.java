public class UserImpl implements User {
	
	private String userName;
	private int libID;
	private Library library;
	
	public UserImpl(String userName) {
		this.userName = userName;
	}
	
	public int getID() {
		return this.libID;
	}
	
	public String getName() {
		return this.userName;
	}
	
	public void setID(int libID) {
		this.libID = libID;
	}
	
	public int register(Library library) {
		this.library = library;
		this.libID = library.getID();
		return libID;
	}
	
	public Library getLibrary() {
		return this.library;
	}
	
}