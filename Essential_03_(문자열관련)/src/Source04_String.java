
public class Source04_String {
	public static void main(String[] args) {
		//Comparing �� (�ٸ� ���ڿ��� ��)
		//���
		String[] datas=new String [] {
				"/my/info","/account/create","/message/send",
				"/message/list","/account/list"
		};
		
		//boolean startsWith(String), boolean endsWith(String)
		//�ش� ���ڿ��� �����ϴ³� �ƴϸ� �������� true or false
		for(int i=0;i<datas.length;i++) {
			System.out.println("=>"+datas[i]);
			boolean s=datas[i].startsWith("/message");
			boolean e=datas[i].endsWith("/list");
			System.out.println(s+".."+e);
		}
		//int compareTp(String)  / a.compareTo(b)==>a-b==>int
		int c="����".compareTo("�������");
		//���̸� ���纸�� �����Ͱ� ����� ���ڰ� ������� �������� ����
		//���쿡�� ���찡2����. ����� ��. ��� ���� �ٸ��Ƿ� �ƽ�Ű�ڵ尪�� ����
		//���� ����� �������� ��������� �����Ƿ� �������� ����.
		
		System.out.println('��'-'��');
		System.out.println(c);
		System.out.println("20123412".compareTo("2"));
		
		//boolean equals(String another):��ġ üũ
		String s1=datas[3].substring(datas[3].lastIndexOf("/")+1);
		System.out.println(s1);//s1.intern()�ϸ� true�� ���´�.
		System.out.println(s1=="list");
		System.out.println(s1.equals("list"));
		//���δ� ���� �迭���� Ȯ�� �������̶�� �ű⼭ �� �ϳ��� �ٸ��� ���� false
		
		String[] rep=new String[] {"a321","b111","c4312","a1111"};
		//boolean matches(String)
		boolean f1=rep[0].matches("[ab]\\d{3}");
		System.out.println("==>"+f1);
		for(int i=0;i<rep.length;i++) {
			System.out.println(rep[i]+"==> "+rep[i].matches("[ab]\\d{3}"));
		}
		//���Խ����Ͽ� �´���
		//datas[3].
		
		
	}
}
