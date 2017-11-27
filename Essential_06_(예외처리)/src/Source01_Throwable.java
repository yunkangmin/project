/*
 * About Throwable ?
 * 
 * Throwable Handle ?
 * 
 * 자바는 Throwable 클래스로부터 만들어진
 * 두계열의 클래스들이 존재함 
 * Exception :소프트웨어적인 결함.
 * Error:하드웨어적인 결함
 * 
 * 특수 객체들임 ==> JVM의 비정상 종료를 유발시키는 특수객체
 */
public class Source01_Throwable {
	public static void main(String[] args) {
		Throwable t1=new RuntimeException();
		Throwable t2=new InterruptedException();
		Throwable t3=new OutOfMemoryError();
		System.out.println("=============================");
		/*Integer i=Integer.valueOf(544);
		throw i; throwable을 상속안해서 안된다.*/
		if(Math.random()>0.5) { // 90%
			RuntimeException re= new RuntimeException();
			
			  throw re;//throwable을 상속하는 객체만 가능 에러 강제 발생
			  //exception애들이 가능 
		}
		//위에 설정해둔 코드와 같이 특정 기능 혹은 연산작업에 throw를 설정해둔것들이 존재함.
		//배열에서 어레이인덱스오브바운드에러
		//그래서 프로그램이 실행도중에 중간에 JVM이 멈추는 현상이 일어나는 거임.
		System.out.println("여기까지 진행");
		
		int n=Integer.parseInt("100d");//기본이 10진수이기때문에 10진문자가 없어서 터진다.
		System.out.println(n);
		
		
		int[] ar=new int[3];
		if(ar[3]==0) {//프로그램을 종료시키는 객체들이 있다.
			
			
		}
		System.out.println("여기까지도 진행");}
}
