
public class Source09_RegEx {
	public static void main(String[] args) {
		String[] regex=new String[] {
				"[abc]",//a or b or c
				"[^abc]",//except a or b or c //a b c 가아니고
				"[a-zA-Z]",// a through z or A trough Z 영문자아무거나
				"[a-d[m-p]]", // a through d, m through d : a-dm-p
				"[a-z&&[def]]",//d,e ,or f
				"[a-z&&[^bc]]",//a through z and except b,c : ad-z
				"[a-z&&[^m-r]]"//a through z and except m thought r
		};
		
		boolean b="cat".matches("[abc]a[tp]");
		//문자열하나를 체크하는것 String이 가진 matches는 true or false반환
		//pattern or matcher는 패턴을 찾기 위한것
		System.out.println(b);
		
		String r="[abc]a[otz]";
		boolean b1="bat".matches(r);
		System.out.println(b1);
		System.out.println("batcao".matches(r));
		System.out.println("cao".matches(r));
		//정확히 일치 하는지를 체크
		boolean t="A3b".matches("[A-Z][^0-3[368]][^g-m]");
		//&&조건을 적을시에는 []적어줘야한다.[[]]는 기본이 or 둘중하나라도 있다면 true이다.
		System.out.println(t);
		//미리 특정그룹은 기호로 처리 해둠.
		// . : any char 
		// \\d digit[0-9]  
		// \\D non-digit [^0-9]
		// \\s whitespace[\t\n\r]스페이스라고 생각하면된다.
		// \\S non-white[^\\s]
		// \\w word character[A-Za-z0-9_]
		// \\W non-word character  Digit
		
		boolean z1="3 D".matches("\\d\\s\\w");
		System.out.println("==> "+z1);
		boolean z2="31다0244".matches("\\d\\d[ㄱ-ㅎ가-힣]\\d\\d\\d\\d");
		boolean z3="31ㅋ0244".matches("\\d\\d[ㄱ-ㅎ가-힣]\\d\\d\\d\\d");
		System.out.println(z2);//ㄱㄴㄷㄹ은 따로 잡혀있다.
		System.out.println(z3);//ㄱㄴㄷㄹ은 따로 잡혀있다.
		
		//자바스크립트시 로그인시 문자체크기능
	}
}
