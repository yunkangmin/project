
public class Source03_String {

	public static void main(String[] args) {
		//���ڿ��� ���� ��������
		//�����س� ĳ���͹迭�� ���� ������ ã���ش�.
		//String class's method
		//String�� char[]�� ���ڵ��� ������.
		String sample="�ڹ��� String";
		//char[]�迭�� ���ڵ��� ������.

		//int length()
		int len=sample.length();//�迭����: ���ڿ�����
		System.out.println(len);

		//char charAt(int)
		char c= sample.charAt(1);
		System.out.println(c);
		//����..String==>char parsing�� ����.
		char t="��".charAt(0);

		//����� ���� String.length()�ʿ�
		//Ư����ġ�� �ִ� ����
		//String.substring(int) / String.substring(int,int)
		String sub1=sample.substring(2);//�Ϻκ��� ���� ������ �ȹٲ��.2���� ������ ����
		System.out.println(sub1);//0 1 2 ������� �迭�̹Ƿ�
		String sub2=sample.substring(3, 7);//begin<=   <end
		//�Ųٷδ� �ȵȴ�.7-3���ؼ� ���
		System.out.println(sub2+".."+sub2.length());

		String id="oracle";
		String hid=id.substring(0, 2)+"*****";
		//0���� � ����
		System.out.println(hid);

		String phone="084-001-04-104-527";
		//�߰��� ���ڸ� ����
		char[] ar=phone.toCharArray();//clone���� �����ؼ� ����
		//ar.equals(ar);ĳ���ʹ� equals�� ���� Object�� equals��.
		String m2=new String(ar,4,4);
		System.out.println(m2);
		String m2_2=phone.substring(4,8);
		System.out.println(m2_2);
		System.out.println(m2==m2_2);

		//String[] split(String), String[] split(String,int)
		System.out.println("===========================");
		String[] arr=phone.split("-",4);//Ư�����ڿ��������� �ɰ��� �ش絥���ʹ� �������.����4���̻���ʹ� �׳� ��ģ��.
		System.out.println(arr.length);
		for(int idx=0;idx<arr.length;idx++) {
			System.out.println(idx+"=>"+arr[idx]);
		}
		//Search ���
		String test="pop!pop!!pop";//Ư�������� ��ġ
		//int indexOf(char), int indexOf(String)
		//int indexOf(char, int) , int indexOf(String, int)
		//���ڰ� ���� ���� Ž����ġ ����Ʈ�� 0
		//int lastIndexOf(char), int lastIndexOf(String)
		//int lastIndexOf(char, int), int lastIndexOf(String, int)
		//=>ó�� �߰��� ��ġ���̸� , ���� ��츸 -1
		//boolean contains(String)
		//�̰� ������ tochatArray�ؼ� �����ȴ�.
		System.out.println(test.indexOf('o'));
		System.out.println(test.indexOf('p'));
		System.out.println(test.indexOf("p!!"));
		System.out.println(test.indexOf("p!",4));
		System.out.println(test.lastIndexOf("p!"));
		System.out.println(test.lastIndexOf("p!",5));
		//5��°����0��°�ΰ��鼭 ã�� �ε����� �ڳ� ���̳� ó������ ����.
		//�Ųٷ� ã�´�.�׳� �ڿ��� ���� ã�°�
		System.out.println(test.contains("p!pp"));//���ڿ��� �ִ��� ������üũ

		//replace ���
		String tag="<h2>H e l l o!</h2>";
		//String toUpperCase()==>���� �빮�ڷ� ����
		//String toLowerCase()==>���� �ҹ��ڷ� ����
		//String replace(char, char), String replace(String, String)
		String u= tag.toUpperCase();
		System.out.println(u);//�ڽ��� ������ �ִ� �����ʹ� �ȹٲ��.
		
		String r=tag.replace("<", "&lt");//���ڹٲٱ�
		System.out.println(r);

		//������ ���͸�
	}
}


