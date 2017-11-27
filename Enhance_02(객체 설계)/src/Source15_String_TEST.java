
public class Source15_String_TEST {

	public static void main(String[] args) {
		//String
		String s1="java";
		System.out.println(s1);//s1이 알고 있는 데이터
		//String 객체가 너무 자주 사용되다 보니까 기본 객체 생성과는 다름.
		//s1=null;//null이 설정이 되는건 객체값을 갖는 변수에만 할 수 있음
		
		//String s2= new String(new char[] {'j','a','v','a'});//배열
		String s2= new String("java");//배열
		//원래는 문자를 여러개 뭉쳐가지고 만들어야 한다.
		System.out.println(s2);//출력시에는 s2가 알고 있는 String객체의 문자들을 한꺼번에 출력
		System.out.println(s1==s2);
		
		String s3="java";//new 과정없이 ""형태로 생성시킨 객체들은 다 보관이 됨.
		//문자열 상수풀에(문자열저장소)
		System.out.println(s1==s3);//이렇게 생성시킨 값들은 true가 발생함.
		
		String s4="ja";
		s4+="va";//원래 객체들은 덧셈이 안되지만 문자열은 됨 
		//합쳐진 객체가 새로 생성되므로 주소가 다르다.
		System.out.println(s4==s1);
		System.out.println(System.identityHashCode("java"));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		//모든 객체형 변수는 4바이트다.
		//다만 거기에 연결되있는 데이터는 더클수도있다.
		
		String o1=Integer.toString(5,2);
		System.out.println(o1);
		String o2=Integer.toString(257,16);
		System.out.println(o2);
		System.out.println(o1==o2);//직접적인 값을 대입해서 비교했을때만 같다
		//객체주소값비교
	}

}
