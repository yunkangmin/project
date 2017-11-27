
public class Rect {
	//data
	int x;
	int y;
	int height;
	int width;
	//메소드명은 항상 소문자로 시작 의미있게
	//procedure
	double getMaxX() {
		return x+width;
	}
	double getMaxY() {
		return y+height;
	}
	/*boolean contains(int x, int y) {
		if(this.x<=x&&getMaxX()>=x&&this.y<=y&&getMaxY()>=y)
			return true;
		else
			return false;
	}*/
	boolean contains(int x, int y) {
		return this.x<=x&&getMaxX()>=x&&this.y<=y&&getMaxY()>=y;
	}
	//constructor 생성자 :객체가 생성될때 작동되는 메소드
	//일반 메소드랑 형태는 비슷한데, 리턴부가 없고, 만들고 있는 객체명(=class명)으로 설계해야됨
	//이건 메소드가 아니기 때문에 객체 생성이후에는 따로 부를 수 있는 방법이 없고,new할때 작동함.
	Rect(){
		System.out.println("call..");
		x=y=width=height=-1;
	}
	//객체를 만들어내는 방법을 여러가지로 추가 설계해도 된다.(오버로딩에 어긋나지 않으면)
	Rect(int init){
		x=y=width=height=init;
	}
	//보통 일반적으로 생성자는 , 객체 초기화에 필요한 작업을 하는것이고,
	//매개변수 있는 형태의 생성자는 객체 생성에 필요한 데이터를 전달받아서
	//필드 초기화에 이용된다.
	//생성자를 여러개를 보통 구현해두는건, 객체사용의 편의를 위해서
	
}
