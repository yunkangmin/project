/*
 * ��ü���� ���α׷���?
 * ��������� �ٸ���..?
 * ��������  ������ �� �ٽ� �����͵��� ���α׷��Ӱ� �� ������ �ؾ��ϴ� ���ŷο��� ����.
 * 
 * */
public class Source06 {

	public static void main(String[] args) {
		int n1=(int)(Math.random()*20);
		int n2=(int)(Math.random()*20);
		int n3=(int)(Math.random()*20);

		//n1�� n2�� ū���� ����ؾ� �ȴٸ�, ���������İ��� ��쿣
		//�����͵��� �׻� �Ѱ��־�� �� .
		int val1=Math.max(n1, n2);
		int val2=Math.min(n1, n2);
		System.out.println(val1+"..."+val2);

		//��ü�����Ŀ����� (��ü=�����ͺ����� �����ϰ� �ִ� �����͸� ������� �� �۾��� �Ҽ� �ִ� 
		//����ü)
		//��ü�� new��� Ű����� �����.
		//����������ɷ��� �ִ� �ν��Ͻ��� ����(new)���Ѽ�,
		//���ν����� ��Ű�� �ϸ� �� �� �ִ�.
		//�����͸� ��� �־���ϴ� ���ŷο��� �ִ�
		//��ü������ �ν��Ͻ��� �����ؼ� ���
		int ih0=System.identityHashCode(34);//�� ��ȣ�ȿ� �����ص� �������� jvm���� ��ġ
		System.out.println(ih0);//�����޸𸮿� �ö��� �ʴ´�.
		//c�� �߰���ü�� ���� �ٷ�cpu�޸𸮻� �ö󰣴�.
		//�ڹٴ� jvm�� �÷��ߵȴٰ� �����ϸ� �ø��� �����Ѵ�.
		
		System.out.println(System.identityHashCode(34));
		//34������ ���ͷ� ���� �Ȱ���.
		
		int ihc=System.identityHashCode(new StringBuilder("JAVA"));//��ü����
		//System.identityHashCode()
		//"JAVA"��� �޽����� �����ϰ� �ִ� ��ü�̴�.
		
		System.out.println(ihc);

		int ihc2=System.identityHashCode(new StringBuilder("JAVA"));
		//��Ʈ��������ü�� ��ġ��
		System.out.println(ihc2);
		
		//new��� Ű����� ��ü�� ����..(�̶� ��������� ����ü���� �ν��Ͻ���� �θ���)
		//��ü(�ν��Ͻ�) ��� �Ϸ���,new�ؼ� ��������� ��ġ���� ���ؼ� ��� �ؾߵǴµ�,
		//�� ���� ������ �Ϸ���, ������� ��ü�� ������ �����Ͻð� �޾��ֽø� ��.
		StringBuilder sb=new StringBuilder("JAVA");
		//sb���� ��ġ���� ���ִ�.�� ��ġ���� ���ؼ� ��� �Ѵ�.
		StringBuilder sb1=new StringBuilder("JAVA");
		
		System.out.println("==>"+System.identityHashCode(sb));
		System.out.println("==>"+System.identityHashCode(sb1));
		//���� �ٸ� �ּ��̴�.
		String s1=sb.toString();//��ü�� ������ �ִ� ���ڿ��� ���´�.
		String s2=sb1.toString();
		System.out.println(s1+"..."+s2);
		
		sb.insert(2, "!!!");//�ε���1���ڿ� �߰�
		sb1.append("!!!!");//�ǵڿ� �߰�
		
		String s3=sb.toString();
		String s4=sb1.toString();
		System.out.println(s3+"..."+s4);
		//����������� �̷��� �Ұ���
		//�ѱ�� �ް� �ѱ��ް�
		//���ο��� �۾��� ��Ű�� ���ο��� ó���Ѵ�.
		//��ü���⿡���� ������ �⺻�����͸� �ȳѰ��൵ �ȴ�
		//��ü���⿡���� �ѹ��ѱ�� �ű⿡�ٰ� ������� �۾��� �����ϴ�.
		//ex)sb1.append() sb1.insert()
		//�Լ� ���� ��ü.�Լ��̸� �������� ���
		//��� �� max min �̷��͵��� ���Ҷ� ��ü�� ����� �ΰ� ����ϸ� ���ϴ�.
		//�������� ���鿡�� �ξ� ���ϴ�.�ʿ��� �����͸� �Ѱ��ָ� �ȴ�.
		//���ο��� �ʹ� �����ϴ�.
		


	}

}
