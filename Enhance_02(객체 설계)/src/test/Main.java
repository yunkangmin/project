package test;

public class Main {

	public static void main(String[] args) {
		Test_01 t1=new Test_01("������");
		t1.disp();
		Test_01 t=new Test_01();
		System.out.println("main������ ��ü "+t);
		//t.name="������";
		t.setName("������");
		
		t.setAge(-358);
		
		System.out.println("�̸� : "+t.getName());
		System.out.println("���� : "+ t.age);
		/*String name="�̸� ����";
		t.name="������";
		t.age=20;
		t.ki=177.4;*/

	}

}
