package manager;

public class Contact {
	String name;
	String phone;
	
	public Contact(String n, String p) {
		name=n;
		phone=p;
	}
	public String toString() {
		return name+"("+phone+")";
		
	}
}
