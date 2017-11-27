
public class Source07Plus {

	public static void main(String[] args) {
		String m = "FF";// 16진수의 문자열이라고 생각.
		// String은 문자의 집합이다.
		// 중간과정은 생략했지만 어떻게 해서 잘 분리해냈음.
		char c1 = m.charAt(0);//첫번째 문자
		char c2 = m.charAt(1);//두번째 문자가 뽑힌다.

		System.out.println(m + "은 10진 정수 몇인가?");
		int val = 0;

		if (c1 >= 'A' && c1 <= 'F') {
			System.out.println((int) c1);
			System.out.println((int) (c1 - 55));
			val += 16 * (c1 - 55);
		} else {
			System.out.println((int) c1);
			System.out.println((int) (c1 - 48));
			val += 16 * (c1 - 48);
		}
		if (c2 >= 'A' && c2 <= 'F') {
			val += 1 * (c2 - 55);
		} else {
			val += 1 * (c2 - 48);
		}
		System.out.println("정답: " + val);
	}
	// System.out.println('F'*1);
	/*
	 * int n1, n2; if(c1>64) { n1=c1-55; }else { n1=c1-48; } if(c2>64) { n2=c2-55;
	 * }else { n2=c2-48; } int result=(n1*16)+n2; System.out.println(result); }
	 */
}
