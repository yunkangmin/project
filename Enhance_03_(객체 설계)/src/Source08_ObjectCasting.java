class Human{}
class Asian extends Human{}
class European extends Human{}
class Korean extends Asian{}
class Japanese extends Asian{}
class French extends European{}
/*
 * 캐스팅이 되는 경우를 일단 살펴보자.
 * 
 * 
 * 
 */
public class Source08_ObjectCasting {
public static void main(String[] args) {
	Korean k=new Korean();
	boolean b=k instanceof Korean;
	System.out.println(k instanceof Korean);
	//상속하는지 확인하는 연산자
	//Japanese j=(Japanese)k;//컴파일 실패
	//System.out.println(k instanceof Japanese);//컴파일 실패
	Human h=(Human)k;//(Human)생략할 수 있음.
	//h=new French();
	//French f=(French)h;//(French)생략불가.자식객체로 캐스팅하는것이라서
	//다운캐스팅은 원래 형태가 아니면은 문제가 발생할 수도 있다.
	Asian a=(Asian)h;
	System.out.println(System.identityHashCode(k));
	System.out.println(System.identityHashCode(h));
	System.out.println(k==h);
	System.out.println(a==h);
	System.out.println("============================");
	System.out.println(k instanceof Asian);
	//해당객체가 Asian포함(하위객체)객체값이 맞는지.
	System.out.println(h instanceof Asian);
	//원래들어 있는 값이 중요하다.
	European e=new European();
	Human hh=e;
	System.out.println(e instanceof French);
	//French ff=(French)hh;//어느 단계까지 다운캐스팅이 가능한지를 알아두자
	
	//이걸 다형성이라고 부르는데.
	//1.특정객체를 제어하기 위해, 반드시 그 형태의 변수가 필요한건 아님.(상위타입으로도
	//제어가능)
	//2.특정객체형태의 변수에 해당 객체만 저장되는건 아님(하위객체도 저장가능)
	
	Asian a1=new Korean();
	Asian a2=new Japanese();
	//Asian a3=new French();
	//Korean객체를 만들때 그 상위 클래스가 다섞여들어가 있다.
	
	//

}
}
