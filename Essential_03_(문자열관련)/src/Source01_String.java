
public class Source01_String {

	public static void main(String[] args) {
		//문자열 처리해주는 객체 String
		String s1="java";//내부적으로는 char[]배열로 처리됨.
			//""로 묶어서 표기하면 자동으로 String객체로 생성
		//이렇게 만들어진 String객체들은 따로 문자열상수풀에 등록되고 관리됨.
		char[] c1=new char[] {'j','a','v','a'};
		System.out.println(c1);
		//캐릭터배열만 String같이 찍힌다.
		//원래는 반복문을 돌려서 해야되지만...

		String s2=new String(c1);
		
		String s3=new String("java");
		String s4=new String(s2);
		System.out.println((s3==s4)+"!!");
		//new가 들어간 것들은 전부다 다른객체
		
		//캐릭터배열을 가지고 문자열로 바꿔서 저장하는게 정석일수도있다.
		System.out.println(s1+"/"+s2);
		System.out.println(s1==s2);
		System.out.println(s1=="java");
		System.out.println(s2=="java");
		System.out.println(s2.intern());
		//해당String객체하고 같은 char[]상태인 애를 String pool에서 뽑아내는
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode("java"));
		System.out.println(System.identityHashCode(s1));
		//별표는 활용빈도가 높은것
		String zz=s2.intern();
		//String을 찾아다준다.
		System.out.println(System.identityHashCode(zz));
		System.out.println(s2.intern()=="java");
		//따로관리됨.
		//Integer랑 똑같은 개념

	}

}
