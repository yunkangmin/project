
public class Source14_Integer_TEST {

	public static void main(String[] args) {
	//Integer��� class�� ����
		//int �� �����͸� ��ü���·� ó�� �ؾߵɶ� �� �־ �����а���
		int n1=4;
		int n2=4;
		System.out.println(n1==n2);
		Integer i1=new Integer(4);
		Integer i2=new Integer(4);
		Integer i3=Integer.valueOf(2);
		Integer i4=i1;
		System.out.println(i4=i1);
		//��ü��(�ּ�)�� ����� ��µɼ��� ����
		System.out.println(i1+" vs "+i2+" vs "+i3);
		
		
		//������ ��ü������ ������ �ִ� �������� ���� �ܼ�������� Ȯ�� �Ұ�
		//�ٸ� ���⼭�� �׷��� ��µǰ� �Ѱ���
		//�׳��� ����� ȿ���� �ִ°� System.identifyHashCode();�� �̿��ؾ�����
		//Ȯ���� �� �ִ�.
		
		System.out.println(i1==i2);//�ּҸ� ��
		System.out.println(i1==i3);
		
		double d=i1.doubleValue();
		System.out.println(d);
		//===========================
		String s1=Integer.toString(5,2);//���ڸ� 2�������ڿ���
		System.out.println(s1);
		//�Ѳ����� �����ߴ�.���� ���� ���ŷο��� static �޼ҵ带
		
		int v1=Integer.parseInt("100",2);//���ڷε� ���ڿ��� 2������
		int v2=Integer.parseInt("100",10);//10����
		//���ĺ� 10+26 36���������� ����
		int v3=Integer.parseInt("100",16);//16����"100"�� 16������� �����ϰ� 10������ ���
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		//�����ε��� ������ 10������ ���ؼ� ó���ϰ� �ʹٸ�
		//�ڽ��� �������� ���� �����͸� ������ �޼ҵ� �̿��� �����ϴ�.
		//static�޼ҵ尡 �ξ� ����.
		String s=Integer.toString(54235);//""+54235;
		System.out.println(s);
		int v=Integer.parseInt("23432");//10�����ڷ�
		//int v=(int)"21342";
		System.out.println(v);
		//Ŭ���� �̸����� �Լ��� ȣ��Ǹ� �׸޼ҵ�� ����ƽ�̱��� ����
		
	}

}
