
public class Source15_String_TEST {

	public static void main(String[] args) {
		//String
		String s1="java";
		System.out.println(s1);//s1�� �˰� �ִ� ������
		//String ��ü�� �ʹ� ���� ���Ǵ� ���ϱ� �⺻ ��ü �������� �ٸ�.
		//s1=null;//null�� ������ �Ǵ°� ��ü���� ���� �������� �� �� ����
		
		//String s2= new String(new char[] {'j','a','v','a'});//�迭
		String s2= new String("java");//�迭
		//������ ���ڸ� ������ ���İ����� ������ �Ѵ�.
		System.out.println(s2);//��½ÿ��� s2�� �˰� �ִ� String��ü�� ���ڵ��� �Ѳ����� ���
		System.out.println(s1==s2);
		
		String s3="java";//new �������� ""���·� ������Ų ��ü���� �� ������ ��.
		//���ڿ� ���Ǯ��(���ڿ������)
		System.out.println(s1==s3);//�̷��� ������Ų ������ true�� �߻���.
		
		String s4="ja";
		s4+="va";//���� ��ü���� ������ �ȵ����� ���ڿ��� �� 
		//������ ��ü�� ���� �����ǹǷ� �ּҰ� �ٸ���.
		System.out.println(s4==s1);
		System.out.println(System.identityHashCode("java"));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		//��� ��ü�� ������ 4����Ʈ��.
		//�ٸ� �ű⿡ ������ִ� �����ʹ� ��Ŭ�����ִ�.
		
		String o1=Integer.toString(5,2);
		System.out.println(o1);
		String o2=Integer.toString(257,16);
		System.out.println(o2);
		System.out.println(o1==o2);//�������� ���� �����ؼ� ���������� ����
		//��ü�ּҰ���
	}

}
