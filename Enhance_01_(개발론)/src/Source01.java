/*
 * 대부분의 개발자들은 같은 시간에 많은 작업을 하기를 원하고,
     한번 만들어둔 프로그램을 쉽게 유지,보수할수 있게 되기를 원함 -효율을 따짐

 * 개발론 이론이라기보다는 방법론 대세는 객체지향
 * -절차 지향(지나갔고)(procedure 중심의 언어) procedural programming
 * -★객체 지향(대세)(Object 중심의 언어)Object oriented programming
 * 절차지향의 한계를 극복하기 위해 탄생
 * 바로 접근하기 힘든 부분도 있다.
 * -관점 지향(독특한 언어)(Aspect 중심의 언어)Aspect oriented programming
 * 
 * 현재 쓰이고 있는 프로그래밍 언어들은, 다 3개 중에 하나
 * 자바는 객체 기반의 프로그래밍 언어
 * 
 * 객체지향프로그래밍 기법을 익힐려면, 절차지향프로그래밍 기법에 대해 먼저 살펴보는게 좋다.
 * 절차지향프로그램(procedural programming)
 * 프로시저 중심 순서의 의미가 아니다.
 * procedure=직역) 순서, 프로그래밍) 단위작업=함수,서브루틴
 * 프로그램 기법 패러다임 문법이 아니라 개념적이 이야기
 * 
 * 
 * 
 * 
 */
public class Source01 {
	public static void main(String[] args) {
		//for loop 이용해서, 제곱값 구해서 처리해보았음
		//Math.pow 라는걸 사용도 해보았음.

		double p=Math.pow(2, 10);//Math.pow이런 것을 procedure라고 한다.
		//필요할때마다 호출해서 쓴다.함수단위 서브루틴이라고 부르기도 한다.함수 메소드
		//부르는 건 언어마다 다르다
		//함수를 구현 할때마다 시간이 든다.작업량 극복
		//로직수정시 함수만 고치면 된다.
		//이걸 발전시킨것이 객체 지향 기법이다.
		//procedure에서 발전 된게 Object라는 개념.
		//procedure설계를 할수 있어야만, 
		//객체라는걸 설계해서 객체 지향 프로그래밍이라는 걸 할 수 있음
		System.out.println(Math.pow(3, -1));
		System.out.println(p);
		
		int n1=(int)(Math.random()*10);
		int n2=(int)(Math.random()*10);
		
		System.out.println(n1+".."+n2);
		
		int m=n1>n2?n1:n2;
		System.out.println(m);
		int mm=Math.max(n1, n2);//둘중의 큰값을 계산해주는 메서드(=프로시져)
		System.out.println(mm);
		
		int num=257;
		String s1=Integer.toString(num,2);
		String s2=Integer.toString(num,8);
		String s3=Integer.toString(num,16);
		
		//double s4=Integer.toString(num,16);//반환형은 String형이다.
		//String s5=Integer.toString(num,2.0);
		//형식을 맞춰주어야 한다.
		System.out.println("binary(2진)\t"+s1);
		System.out.println("octal(8진)\t"+s2);
		System.out.println("hex(16진)\t"+s3);
		
		//메인루틴에서 서브루틴으로 데이터를 전달(파라미터)
		//서브루틴에서 가공한뒤 output을 만들어냄
		
		
		
		
		
	}
}
