
public class Source01_String {

	public static void main(String[] args) {
		//���ڿ� ó�����ִ� ��ü String
		String s1="java";//���������δ� char[]�迭�� ó����.
			//""�� ��� ǥ���ϸ� �ڵ����� String��ü�� ����
		//�̷��� ������� String��ü���� ���� ���ڿ����Ǯ�� ��ϵǰ� ������.
		char[] c1=new char[] {'j','a','v','a'};
		System.out.println(c1);
		//ĳ���͹迭�� String���� ������.
		//������ �ݺ����� ������ �ؾߵ�����...

		String s2=new String(c1);
		
		String s3=new String("java");
		String s4=new String(s2);
		System.out.println((s3==s4)+"!!");
		//new�� �� �͵��� ���δ� �ٸ���ü
		
		//ĳ���͹迭�� ������ ���ڿ��� �ٲ㼭 �����ϴ°� �����ϼ����ִ�.
		System.out.println(s1+"/"+s2);
		System.out.println(s1==s2);
		System.out.println(s1=="java");
		System.out.println(s2=="java");
		System.out.println(s2.intern());
		//�ش�String��ü�ϰ� ���� char[]������ �ָ� String pool���� �̾Ƴ���
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode("java"));
		System.out.println(System.identityHashCode(s1));
		//��ǥ�� Ȱ��󵵰� ������
		String zz=s2.intern();
		//String�� ã�ƴ��ش�.
		System.out.println(System.identityHashCode(zz));
		System.out.println(s2.intern()=="java");
		//���ΰ�����.
		//Integer�� �Ȱ��� ����

	}

}
