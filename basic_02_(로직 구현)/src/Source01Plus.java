
public class Source01Plus {

	public static void main(String[] args) {
		int rand = 1000 + (int) (Math.random() * 9000);
		System.out.println(rand);
		int t;
		int prev = rand / 100;
		int next = rand % 100;
		System.out.println("prev : " + prev + " , next :" + next);
		// if시 해야될 작업을 중괄호 {}로 설정해야되는게 맞지만, 작업이 하나라면 ,{}생략가능
		// 여러작업이라면 {}반드시 설정
		if (prev == next)
			System.out.println("앞 두수와 뒤 두수가 일치상태");
		else
			System.out.println("앞 두수와 뒤 두수가 불일치상태");
		// != 같지 않은지
		if (rand % 2 == 0) {
			t = prev + next;
		} else {
			t = prev - next;
		}
		System.out.println(t);
		/*
		 * 랜덤으로 확보한 수치가 짝수형 데이터 라면 천의 자리 백의 자리 +십의자리일의 자리 홀수형 데이터면 천의 자리 백의 자리-십의 자리
		 * 일의자리 3317 33-17을 계산 1248 12+48을 계산
		 *
		 *
		 **/
	}
}
