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
	 //Rect에 2개의 메소드를 추가설계해달라.
	 //getMaxY()하면 ==>double ..y 최대값
	 //contains(int,int)==> boolean..
	 //자기영역에 포함이된 점인지 아닌지
	 System.out.println(re.contains(90, 131));
	 System.out.println(re.getMaxY());
	
	 Rect z=new Rect();
	 System.out.println(z.x);
	 //new JFrame();
	 Rect zz=new Rect();
	 System.out.println(zz.x);
	}

}
