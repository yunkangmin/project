/*
 * ��ü���� ����� ���� ������ ���캸�Ұ�,
 * ��ü�� ��� �����ϴ����� ���ؼ� ���캸��.
 * (��ü : ������ ���� + �����ϰ� �ִ� �����ͷ� �����۾��� �� �� �ִ� ���� ��ü)
 * Point ��ü��,StringBuilder ��ü���� �� �Ӹ��ӿ� ���÷�����.
 * 
 * �ռ� ���캻 Point��ü�� 
 * ���� �����غ��� ����غ��鼭 �⺻ ������� ���ؼ� ���캸��
 * 
 * ��ü ���踦 �Ҷ� ���̴� �� class(��ü ���� =Ŭ���� ����)
 * */
public class Source01 {

	public static void main(String[] args) {
		Point p=new Point();//�Ʊ� �츮�� ����� Point ��ü�� �ƴ�.���������
		//p.translate(32,2);//�츮�� ����� ���� ������ �ǰ� �ִ� ��Ȳ��.
		System.out.println(new Point());//new�Ҷ�����, ���谡 �Ǿ��ִ� �� ���� ��ü ������ �Ͼ
		//(new�� ���� ������ ��ü�� �ν��ͽ���� �θ�)
		//new�ϴ� �� �ν��Ͻ�ȭ(instantiate)��� �θ�.
		Point p2=new Point();//��ü ��� �ϱ� ���ؼ� ������ �ʿ��ѰŰ�,
		//new java.util.List();�ȵǴ� �ֵ� �ִ� �������̽��̱� �����̴�.
		System.out.println(System.identityHashCode(p2));
		//��ü�� �����ϰ� �Ǹ� ,jvm�� �޸� ��򰡿� ������ ��� �����ϰ� ��.
		//�� �̻� ������ �ʴ� ��ü���� , JVM�޸� ������ (�������÷���)�� ���� �Ҹ��
		p.x=10;//�ش� ��ü�� ������ �ִ� �ʵ��
		p.y=30;//��ü���� ������ �ִ� ���������� ����
		
		p2.x=3;
		p2.y=5;
		//�ش� ��ü�� ������ �ִ� �޼��嵵,
		//������ .���� ����
		System.out.println(p.makeString());
		System.out.println(p2.makeString());
		//��ü�� ���� ������ �Ǵµ�,
		Point p3=p;//���� ��ü�� �����Ҽ� �ְ� �ȴ�.
		//p3=new Point();
		System.out.println(p3.x);
		p3.translate(10, 10);//�������� ������ ��ü ��� �ϸ�
		System.out.println(p.makeString());//���� ��ü�� ������ �ִ�.
		
		int z=10;
		int zz=z;
		zz++;
		System.out.println(z);
		Point p4=new Point();
		System.out.println(p4.makeString());
	
	
	}

}
