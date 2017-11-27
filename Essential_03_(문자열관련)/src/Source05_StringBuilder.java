/*
 * StringBuilder class도 String class랑 비슷하긴함.
 * 다른점이 있다면, 수정이 가능하다.
 * 유동적인 길이를 가질수있다.
 * 
 * 
 */
public class Source05_StringBuilder {
public static void main(String[] args) {
	StringBuilder sb=null;
	//sb=new StringBuilder();//초기 16칸 char[]이 설정
	sb=new StringBuilder("java");//+ 16칸 char[]이 잡힘
	int n=sb.capacity();
	System.out.println(n);
	//배열이 계속변경된다.=>final이 아니다.
	//StringBuilder operations..
	sb.append("Program");
	System.out.println(sb.toString());
	//가지고 있는 문자열에 계속연결시켜나감.
	//String으로 더하면 객체가 계속적으로 생긴다
	//하지만 StringBuilder는 하나의 객체로 계속더한다.
	//=========================================
	String sid="as";
	for(int i=1;i<=4;i++) {
		System.out.println(System.identityHashCode(sid));
		sid+="*";
	}
	System.out.println(System.identityHashCode(sid));
	System.out.println(sid);
	System.out.println("==============================");
	StringBuilder sbb=new StringBuilder("as");
	System.out.println(sbb.length()+sbb.capacity());
	//실제로 가진 문자열수와 용량
	//기존에 가진 char[]배열에 계속더해나가는데 용량이 부족하면 한번 크게 키워서 
	//기존에 있던걸 카피해서 그뒤에 계속 붙여나간다.
	//상위 abstractstringbuilder이다.
	for(int i=1;i<=4;i++) {
		System.out.println(System.identityHashCode(sid));
		sbb.append("*");
	}
	System.out.println(System.identityHashCode(sid));
	System.out.println(sbb);
	String s=sbb.toString();
	//String에 변화를 줄때는 StringBuilder로 하는게 좋다.

	//웬만한String이 가지고 있는 메소드는 다 있다.
	//고유기능
	//가변배열을 가지고 있다.
}
}
