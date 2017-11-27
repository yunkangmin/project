package manager;

import java.util.LinkedHashSet;
import java.util.Set;

public class ContactTest {
public static void main(String[] args) {
	Set<Contact> filter=new LinkedHashSet<>();
	String in="add À±ÇüÈ£ 01012312323 °¡Á·";
	String[]ar=in.split("\\s+");
	Contact c1=new Contact(ar[1], ar[2]);
	boolean b=filter.add(c1);
	System.out.println(b);
	boolean b2=filter.add(c1);
	System.out.println(b2);
	
	Contact c2=new Contact(ar[1],ar[2]);
	boolean b3=filter.add(c2);
	System.out.println(b3);
	System.out.println(filter.toString());
}
}
