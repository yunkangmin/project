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
		System.out.println(name+"�� �θ��ϴ�.");
	}
	void hello() {
		System.out.println(name+"�� �λ��մϴ�.");
	}
	
	void info() {
		System.out.println("name: "+name+" song: "+song+" gender: "+gender+" age: "+age);
	}
	void ageDis() {
		if(this.age<40)
			System.out.println(name+"�� ���̰� �׸� ���� �ʽ��ϴ�.");
		else
			System.out.println(name+"�� ���̰� �����ϴ�.");
	}
	public static void main(String[] args) {
		
		Singer s1=new Singer("�����","����ʹ�", "����" ,37 );
		Singer s2=new Singer("������","Tears","����",43 );
		Singer s3=new Singer( "��Ǹ�", "�߸��� ����", "����" , 50 );
		
		s1.setSong("�����");
		s2.setAge(45);
		
		s3.ageDis();
		
		s1.info();
		s2.info();
		s3.info();
		
		if(s3.getAge()>=45)
			System.out.println("��Ǹ� ������");
		else if(s3.getAge()<40)
			System.out.println("��Ǹ� ����");
		
		}
	}
