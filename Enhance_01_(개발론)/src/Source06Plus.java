
public class Source06Plus {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("�ڹ�");
		StringBuilder sb2=new StringBuilder("�ڹ�");
		
		System.out.println("sb1 = "+sb1.toString());
		System.out.println("sb2 = "+sb2.toString());
		System.out.println(sb1==sb2);
		sb1.insert(1,"�ٸ� ��" );
		sb2.insert(2, "??");
		System.out.println("sb1 = "+sb1.toString());
		System.out.println("sb2 = "+sb2.toString());
		sb1.insert(3, "!!");
		sb2.insert(3, "!!");
		System.out.println("sb1 = "+sb1.toString());
		System.out.println("sb2 = "+sb2.toString());
	}

}
