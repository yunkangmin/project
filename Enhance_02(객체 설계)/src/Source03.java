import javax.swing.JFrame;

public class Source03 {

	public static void main(String[] args) {
		//new Rect(20,40,50,60);
	 Rect re= new Rect();
	 re.x=40;
	 re.y=70;
	 re.width=50;
	 re.height=60;
	 
	 double mx=re.getMaxX();
	 System.out.println(mx);
	 //Rect�� 2���� �޼ҵ带 �߰������ش޶�.
	 //getMaxY()�ϸ� ==>double ..y �ִ밪
	 //contains(int,int)==> boolean..
	 //�ڱ⿵���� �����̵� ������ �ƴ���
	 System.out.println(re.contains(90, 131));
	 System.out.println(re.getMaxY());
	
	 Rect z=new Rect();
	 System.out.println(z.x);
	 //new JFrame();
	 Rect zz=new Rect();
	 System.out.println(zz.x);
	}

}
