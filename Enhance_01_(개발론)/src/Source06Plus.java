
public class Source06Plus {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("자바");
		StringBuilder sb2=new StringBuilder("자바");
		
		System.out.println("sb1 = "+sb1.toString());
		System.out.println("sb2 = "+sb2.toString());
		System.out.println(sb1==sb2);
		sb1.insert(1,"바를 자" );
		sb2.insert(2, "??");
		System.out.println("sb1 = "+sb1.toString());
		System.out.println("sb2 = "+sb2.toString());
		sb1.insert(3, "!!");
		sb2.insert(3, "!!");
		System.out.println("sb1 = "+sb1.toString());
		System.out.println("sb2 = "+sb2.toString());
	}

}
