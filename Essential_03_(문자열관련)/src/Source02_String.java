
public class Source02_String {
	public static void main(String[] args) {
		//System.out.println("pop");
		char[]arr=new char[] {'p','o','p','p','o','p'};
		
		//char[], int offset, int count
		String s1=new String(arr,0,3);
		System.out.println(s1);
		String s2=new String(arr,3,3);
		System.out.println(s2);
		
		System.out.println(s1==s2);
		//String ==�� ������ �񱳸� �Ҽ� �ִٰ�
		//�����ϴ°�.. ���ƴ�.
		boolean b=s1.equals(s2);
		System.out.println(b);
		String z=s1.intern();//���ڿ� pool���� �ش� ���ڿ���ü���� ã�ƿ��� ����.������ ��Ͻ�Ŵ
		String z1=s2.intern();
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(z1));
		System.out.println(System.identityHashCode("pop"));
	}
}
