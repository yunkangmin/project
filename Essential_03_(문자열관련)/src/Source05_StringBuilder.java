/*
 * StringBuilder class�� String class�� ����ϱ���.
 * �ٸ����� �ִٸ�, ������ �����ϴ�.
 * �������� ���̸� �������ִ�.
 * 
 * 
 */
public class Source05_StringBuilder {
public static void main(String[] args) {
	StringBuilder sb=null;
	//sb=new StringBuilder();//�ʱ� 16ĭ char[]�� ����
	sb=new StringBuilder("java");//+ 16ĭ char[]�� ����
	int n=sb.capacity();
	System.out.println(n);
	//�迭�� ��Ӻ���ȴ�.=>final�� �ƴϴ�.
	//StringBuilder operations..
	sb.append("Program");
	System.out.println(sb.toString());
	//������ �ִ� ���ڿ��� ��ӿ�����ѳ���.
	//String���� ���ϸ� ��ü�� ��������� �����
	//������ StringBuilder�� �ϳ��� ��ü�� ��Ӵ��Ѵ�.
	//=========================================
	String sid="as";
	for(int i=1;i<=4;i++) {
		System.out.println(System.identityHashCode(sid));
		sid+="*";
	}
	System.out.println(System.identityHashCode(sid));
	System.out.println(sid);
	System.out.println("==============================");
	StringBuilder sbb=new StringBuilder("as");
	System.out.println(sbb.length()+sbb.capacity());
	//������ ���� ���ڿ����� �뷮
	//������ ���� char[]�迭�� ��Ӵ��س����µ� �뷮�� �����ϸ� �ѹ� ũ�� Ű���� 
	//������ �ִ��� ī���ؼ� �׵ڿ� ��� �ٿ�������.
	//���� abstractstringbuilder�̴�.
	for(int i=1;i<=4;i++) {
		System.out.println(System.identityHashCode(sid));
		sbb.append("*");
	}
	System.out.println(System.identityHashCode(sid));
	System.out.println(sbb);
	String s=sbb.toString();
	//String�� ��ȭ�� �ٶ��� StringBuilder�� �ϴ°� ����.

	//������String�� ������ �ִ� �޼ҵ�� �� �ִ�.
	//�������
	//�����迭�� ������ �ִ�.
}
}
