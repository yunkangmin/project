/*
 * 객체지향 기법에 대해 간단히 살펴보았고,
 * 객체를 어떻게 설계하는지에 대해서 살펴보자.
 * (객체 : 데이터 보관 + 보관하고 있는 데이터로 일정작업을 할 수 있는 가상 물체)
 * Point 객체나,StringBuilder 객체같은 걸 머리속에 떠올려보자.
 * 
 * 앞서 살펴본 Point객체를 
 * 직접 설계해보고 사용해보면서 기본 설계법에 대해서 살펴보자
 * 
 * 객체 설계를 할때 쓰이는 건 class(객체 설계 =클래스 설계)
 * */
public class Source01 {

	public static void main(String[] args) {
		Point p=new Point();//아까 우리가 사용한 Point 객체가 아님.덮어씌워졌음
		//p.translate(32,2);//우리가 만든게 먼저 적용이 되고 있는 상황임.
		System.out.println(new Point());//new할때마다, 설계가 되어있는 걸 토대로 객체 생성이 일어남
		//(new를 통해 생성된 객체를 인스터스라고 부름)
		//new하는 걸 인스턴스화(instantiate)라고 부름.
		Point p2=new Point();//객체 제어를 하기 위해서 변수가 필요한거고,
		//new java.util.List();안되는 애도 있다 인터페이스이기 때문이다.
		System.out.println(System.identityHashCode(p2));
		//객체를 생성하게 되면 ,jvm상 메모리 어딘가에 영역을 잡고 차지하게 됨.
		//더 이상 사용되지 않는 객체들은 , JVM메모리 관리자 (가비지컬렉터)에 의해 소멸됨
		p.x=10;//해당 객체가 가지고 있는 필드는
		p.y=30;//객체값을 가지고 있는 변수명으로 접근
		
		p2.x=3;
		p2.y=5;
		//해당 객체가 가지고 있는 메서드도,
		//변수명 .으로 접근
		System.out.println(p.makeString());
		System.out.println(p2.makeString());
		//객체값 역시 복제가 되는데,
		Point p3=p;//같은 객체를 접근할수 있게 된다.
		//p3=new Point();
		System.out.println(p3.x);
		p3.translate(10, 10);//복제받은 값으로 객체 제어를 하면
		System.out.println(p.makeString());//원래 객체도 영향이 있다.
		
		int z=10;
		int zz=z;
		zz++;
		System.out.println(z);
		Point p4=new Point();
		System.out.println(p4.makeString());
	
	
	}

}
