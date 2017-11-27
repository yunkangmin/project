/*
 * ��κ��� �����ڵ��� ���� �ð��� ���� �۾��� �ϱ⸦ ���ϰ�,
     �ѹ� ������ ���α׷��� ���� ����,�����Ҽ� �ְ� �Ǳ⸦ ���� -ȿ���� ����

 * ���߷� �̷��̶�⺸�ٴ� ����� �뼼�� ��ü����
 * -���� ����(��������)(procedure �߽��� ���) procedural programming
 * -�ڰ�ü ����(�뼼)(Object �߽��� ���)Object oriented programming
 * ���������� �Ѱ踦 �غ��ϱ� ���� ź��
 * �ٷ� �����ϱ� ���� �κе� �ִ�.
 * -���� ����(��Ư�� ���)(Aspect �߽��� ���)Aspect oriented programming
 * 
 * ���� ���̰� �ִ� ���α׷��� ������, �� 3�� �߿� �ϳ�
 * �ڹٴ� ��ü ����� ���α׷��� ���
 * 
 * ��ü�������α׷��� ����� ��������, �����������α׷��� ����� ���� ���� ���캸�°� ����.
 * �����������α׷�(procedural programming)
 * ���ν��� �߽� ������ �ǹ̰� �ƴϴ�.
 * procedure=����) ����, ���α׷���) �����۾�=�Լ�,�����ƾ
 * ���α׷� ��� �з����� ������ �ƴ϶� �������� �̾߱�
 * 
 * 
 * 
 * 
 */
public class Source01 {
	public static void main(String[] args) {
		//for loop �̿��ؼ�, ������ ���ؼ� ó���غ�����
		//Math.pow ��°� ��뵵 �غ�����.

		double p=Math.pow(2, 10);//Math.pow�̷� ���� procedure��� �Ѵ�.
		//�ʿ��Ҷ����� ȣ���ؼ� ����.�Լ����� �����ƾ�̶�� �θ��⵵ �Ѵ�.�Լ� �޼ҵ�
		//�θ��� �� ���� �ٸ���
		//�Լ��� ���� �Ҷ����� �ð��� ���.�۾��� �غ�
		//���������� �Լ��� ��ġ�� �ȴ�.
		//�̰� ������Ų���� ��ü ���� ����̴�.
		//procedure���� ���� �Ȱ� Object��� ����.
		//procedure���踦 �Ҽ� �־�߸�, 
		//��ü��°� �����ؼ� ��ü ���� ���α׷����̶�� �� �� �� ����
		System.out.println(Math.pow(3, -1));
		System.out.println(p);
		
		int n1=(int)(Math.random()*10);
		int n2=(int)(Math.random()*10);
		
		System.out.println(n1+".."+n2);
		
		int m=n1>n2?n1:n2;
		System.out.println(m);
		int mm=Math.max(n1, n2);//������ ū���� ������ִ� �޼���(=���ν���)
		System.out.println(mm);
		
		int num=257;
		String s1=Integer.toString(num,2);
		String s2=Integer.toString(num,8);
		String s3=Integer.toString(num,16);
		
		//double s4=Integer.toString(num,16);//��ȯ���� String���̴�.
		//String s5=Integer.toString(num,2.0);
		//������ �����־�� �Ѵ�.
		System.out.println("binary(2��)\t"+s1);
		System.out.println("octal(8��)\t"+s2);
		System.out.println("hex(16��)\t"+s3);
		
		//���η�ƾ���� �����ƾ���� �����͸� ����(�Ķ����)
		//�����ƾ���� �����ѵ� output�� ����
		
		
		
		
		
	}
}
