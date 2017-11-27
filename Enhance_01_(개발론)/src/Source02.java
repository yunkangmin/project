/*
 * Math.pow나, Math.max, Integer.toString 같은 프로시져(메서드)설계를 해보자.
 *
 *procedure 이름을 결정해야됨- (method name)
 *input의 data type들을 설계해야 됨 -(arguments, parameter)
 *output의 data type을 결정해야됨-(return type)
 *
 *그 외에 여러가지 추가 옵션을 설정해서 설계.
 *
 *procedure를 설계 코드는 어디에.? -여러곳이 있지만, 지금은 같은 main이 있는 곳에 같이 설계할꺼임
 *
 * */
public class Source02 {
	// ========================================================
	// max 만들꺼임.(input : int 2개 , output : int)
	// 옵션
	protected synchronized static final int max(int one, int other) {
		// one, other에 데이터가 설정되는건, 사용될때 결정
		int t = one > other ? one : other;
		// int one;//안된다.
		// output시킬 데이터를 return키워드로 설정
		return t;
	}// 클래스안쪽에만 있으면 된다.메인안에다 못만든다.
		// 일단은 static은 꼭 붙이자.
		// 일단 이 파일안에서만 함수를 사용할 수 있다고 알고 있자.

	// ========================================================
	public static void main(String[] args) {
		System.out.println(max(31, 9));

		int r = max(31, 9);
		System.out.println(r);

	}
	// ========================================================
}
