package test;

public class Main {

	public static void main(String[] args) {
		Test_01 t1=new Test_01("À±°­¹Î");
		t1.disp();
		Test_01 t=new Test_01();
		System.out.println("main¿¡¼­ÀÇ °´Ã¼ "+t);
		//t.name="À±°­¹Î";
		t.setName("À±°­¹Î");
		
		t.setAge(-358);
		
		System.out.println("ÀÌ¸§ : "+t.getName());
		System.out.println("³ªÀÌ : "+ t.age);
		/*String name="ÀÌ¸§ ¾øÀ½";
		t.name="À±°­¹Î";
		t.age=20;
		t.ki=177.4;*/

	}

}
