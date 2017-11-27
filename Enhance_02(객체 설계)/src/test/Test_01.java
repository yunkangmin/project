package test;

public class Test_01 {
	String name;
	int age;
	double ki;
	
	Test_01(){
		
	}
	Test_01(String name){
		this(name,0,0);//반드시 첫줄에 적어야한다.
		//생성자가 호출되기 전에 다른 코드가 먼저 실행될수없다.
		//데이터가 없는데 값을 셋팅하는게 말이 안된다.
		//this()가 반드시 첫 줄에 오는 이유는 먼저 다른 코드가오면
		//객체 생성이전 이기때문에 그다음 this()를 호출한다고 해도 
		//무의미해지기 때문이다.
		//만약 두번째에 오게 되면 생성자가 호출되고 객체가 생성되기 
		//때문에 JVM이 어느 객체를 생성해야 될지 모르는 상황이온다.
		//원래 생성자도 객체를 생성하는 생성자이도 this()객체를 생성하는 
		//생성자인데 this()가 첫줄이 아닌줄에 오면JVM이 어느 객체를 호출해야
		//객체는 하나만 생성된다.
		//할지 모르는 상황이온다.
		//상속에서 super()는 자식클래스의 객체가 먼저생성될수 있는 가능성을 방지하는것이며
		//부모클래스의 멤버가 초기화되기 전에 자식클래스에서 부모클래스의 멤버를 사용하는 수가 
		// 것이다.있어서 이를 방지하는 
	
		//어떻게 객체생성이전에  어떤 작업을 할 수있겠나
		
		this.age=11;
	}
	Test_01(String name,int age,double ki){
		this.name=name;
		this.setAge(age);
		this.setKi(ki);
	}
	
	//setter와 getter
	//메소드명에서 멤버 변수명의 첫글자는 대문자로 작성한다.
	
	//setter
	//일반적으로 멤버 변수의 하나의 값을 세팅하기 위한 메소드
	//매개변수명은 보통 멤버변수명과 동일하게 한다..
	//멤버변수의 제약사항이 있으면 setter에서 처리한다.
	
	
	//형식
	//void set멤버변수명(매개변수){}
	//노란색줄(불필요한데 왜썼냐)위험성이 있는 코드
	
	//getter
	//멤버 변수 하나의 값을 반환받기위한 메소드
	
	//형식
	// 반환자료형 get멤버변수명(){return 멤버변수명;}
	String getName() {
		return name;
	}
	
	//멤버변수별로 setter가 있다.
	//이런 식으로도 이용이 된다.이걸 setter로 볼 수 도 있다.
	//코드가 간결해진다.
	void setData(String name,int age,double ki) {
		this.name=name;
		this.setAge(age);
		this.setKi(ki);
	}
	void setName(String name) {
		System.out.println("setName에서의 객체"+this);
		this.name=name;
	}
	void setAge(int age) {
		if(age<1) {
			System.out.println("나이가 잘못입력되었습니다.");
			age=20;
		}
		this.age=age;
	}
	void setKi(double ki) {
		if(ki<50) {
			ki=50;
		}
		this.ki=ki;
	}
	//통장계좌번호 이런경우 setter를 안만든다 계좌는 안바껴야 하므로
	//절대적인 경우 ex)주민등록번호 getter를 안만든다.클래스내부에 쓸때는 만들수
	//도 있다.getter setter는 상황에 따라서 만든다.
	void disp() {
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+ this.age);
		System.out.println("키 : "+ this.ki);
	}
}
