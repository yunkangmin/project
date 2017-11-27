
public class Source14_Integer_TEST {

	public static void main(String[] args) {
	//Integer라는 class가 있음
		//int 형 데이터를 객체형태로 처리 해야될때 가 있어서 만들어둔거임
		int n1=4;
		int n2=4;
		System.out.println(n1==n2);
		Integer i1=new Integer(4);
		Integer i2=new Integer(4);
		Integer i3=Integer.valueOf(2);
		Integer i4=i1;
		System.out.println(i4=i1);
		//객체값(주소)은 절대로 출력될수가 없다
		System.out.println(i1+" vs "+i2+" vs "+i3);
		
		
		//원래는 객체변수가 가지고 있는 실질적인 값은 단순출력으로 확인 불가
		//다만 여기서는 그렇게 출력되게 한거임
		//그나마 비슷한 효과를 주는게 System.identifyHashCode();를 이용해야지만
		//확인할 수 있다.
		
		System.out.println(i1==i2);//주소를 비교
		System.out.println(i1==i3);
		
		double d=i1.doubleValue();
		System.out.println(d);
		//===========================
		String s1=Integer.toString(5,2);//숫자를 2진수문자열로
		System.out.println(s1);
		//한꺼번에 설계했다.따로 빼기 번거로워서 static 메소드를
		
		int v1=Integer.parseInt("100",2);//숫자로된 문자열을 2진수로
		int v2=Integer.parseInt("100",10);//10진수
		//알파벳 10+26 36진법까지는 존재
		int v3=Integer.parseInt("100",16);//16진수"100"을 16진수라고 생각하고 10진수로 출력
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		//오버로딩이 되있음 10진법에 의해서 처리하고 싶다면
		//자신이 가지있지 않은 데이터를 가지고도 메소드 이용이 가능하다.
		//static메소드가 훨씬 많다.
		String s=Integer.toString(54235);//""+54235;
		System.out.println(s);
		int v=Integer.parseInt("23432");//10진문자로
		//int v=(int)"21342";
		System.out.println(v);
		//클래스 이름으로 함수가 호출되면 그메소드는 스테틱이구나 생각
		
	}

}
