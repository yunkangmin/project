import java.awt.Rectangle;
public class Source04 {
	public static void main(String[] args) {
		//java에서 만들어둔 Rectangle는 다양한 형태로 instantiate(객체생성)가능
		//얻는 편의성에 대해 살펴보자
		Rectangle r=new Rectangle();//기본 생성자(=매개변수 없는 형태의 생성자)
		System.out.println(r.toString());
		Rectangle r2=new Rectangle(10,50,100,200);//int4개짜리는 전달시킨 데이터로 필드초기화;
		//필요한 데이터로 세팅시킨 객체를 확보가 가능함.
		System.out.println(r2.toString());
		
		//좌표는 0,0에 width, height만 특정값으로 설정해서 객체를 만들려면
		new Rectangle(0,0,300,300);
		Rectangle r3=new Rectangle(300,300);//int 2개짜리는 width, height만 설정
		System.out.println(r3.toString());
		
		//r2의 데이터와 똑같은 데이터를 가진 객체가 필요함.
		new Rectangle(r2.x,r2.y,r2.width,r2.height);
		
		Rectangle r4=new Rectangle(r2);
		System.out.println(r4.toString());
		System.out.println(r2==r4);
		
		//만약, Rectangle 객체 설계자가 설계시 단 한가지형태로 instantiate 방버을 설계해두었다면?
		
	}
}
