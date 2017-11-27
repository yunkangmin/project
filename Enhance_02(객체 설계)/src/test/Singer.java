package test;

public class Singer {
	String name;
	String song;
	String gender;
	int age;
	Singer(String name){
		this(name,null,null,0);
		
	}
	Singer(String name,String song,String gender,int age){
		this.name=name;
		this.song=song;
		this.gender=gender;
		setAge(age);
	}
	void setName(String name) {
		this.name=name;
	}
	void setGender(String gender) {
		this.gender=gender;
	}
	void setSong(String song) {
		this.song=song;
	}
	void setAge(int age) {
		if(age<1)
			age=1;
		
		this.age=age;
	}
	int getAge() {
		return this.age;
	}
	String getName() {
		return name;
	}
	String getSong() {
		return song;
	}
	String getGender() {
		return gender;
	}
	void sing() {
		System.out.println(name+"이 부릅니다.");
	}
	void hello() {
		System.out.println(name+"가 인사합니다.");
	}
	
	void info() {
		System.out.println("name: "+name+" song: "+song+" gender: "+gender+" age: "+age);
	}
	void ageDis() {
		if(this.age<40)
			System.out.println(name+"의 나이가 그리 많지 않습니다.");
		else
			System.out.println(name+"의 나이가 많습니다.");
	}
	public static void main(String[] args) {
		
		Singer s1=new Singer("김범수","보고싶다", "남자" ,37 );
		Singer s2=new Singer("소찬휘","Tears","여자",43 );
		Singer s3=new Singer( "김건모", "잘못된 만남", "남자" , 50 );
		
		s1.setSong("끝사랑");
		s2.setAge(45);
		
		s3.ageDis();
		
		s1.info();
		s2.info();
		s3.info();
		
		if(s3.getAge()>=45)
			System.out.println("김건모 아저씨");
		else if(s3.getAge()<40)
			System.out.println("김건모 오빠");
		
		}
	}
