
public class Source10_RegEx {

	public static void main(String[] args) {
		// \\w :a-zA-Z0-9_
		//Quantifiers(��������)
		
		//x?,x??,x?+ �ٰ��� �ǹ� �ְų� ���ų� 0 or 1
		 
		boolean b="9s".matches("\\d[a-z]?"); //"9","9s" ?�ٷξտ����� �ǹ� s�� �ְų� ���ų�
		System.out.println(b);
		
		//x*, x*?,x*+ : zero or more �������� �ְ� ���������ִµ� �������� �������� �ִ�.
		
		boolean b2="a12323".matches("[aA]*\\d*");//���ڰ� ���ų� �������ų� 0�̻�
		System.out.println(b2);//�ش� ���ڿ��� ���ԽĿ� ��ġ�� �Ǵ��� �ȵǴ���
		
		//x+,x+?,x++ : 1�̻� �ݵ�� 1��  �̻��� �־�� �Ѵ�.
		boolean b3="10".matches("\\d*[a-z]+");
		System.out.println(b3);
		
		//x{n} ,x{n}? ,x{n}+ :exactly n times
		
		boolean b4="21��7945".matches("\\d{2}[��-�R]\\d{4}");
		//�������� �ݵ�� 2���� �־�� �Ѵ�. �ݵ�� 4���� �־�� �Ѵ�.
		System.out.println(b4);
		
		//��� ������ ���Խ��� �����Ѵ�.�ణ�� ���°� �ٸ���.
		//�ֹε�Ϲ�ȣüũ
		//x{n,} ,x{n,}?,x{n,}+ :at least n times �ּ��� ����̻�
		//x{n,m}, x{n,m},x{n,m}+ :at least n but more than m �ּ� n�̻�m����
		String r="01[016789]-\\d{3,4}-\\d{4}";//�ڵ��� ��ȣ
		boolean b5="010-2114-8225".matches(r);
		System.out.println(b5);
		
		boolean b6="[abc]".matches("\\[\\w+\\]");
		System.out.println(b6);//���ڿ� [�ִ��� �˰�ʹٸ� \\[ \\�� �տ� �ٿ����Ѵ�.
		//�̹� �ǹ� �ִ� ����(.,*,?,+�� ã������ \\����)
		
		//�׷� 
		boolean b7="aa3bb2et1ze5".matches("([a-z]{2}\\d)+");//()�� ���� �Ǹ� �׷��̶� �Ҹ���.
		//Ư�������� ��������ؾߵȴ�...��ü����
		System.out.println(b7);
	
		
		
		//�׷�ó��

	}

}
