
public class Source08 {

	public static void main(String[] args) {
		// 반복처리....
		// 10진수를 16진수로 바꾸는 것은 255까지 였기때문 범위를 알고 있다.
		int rand = (int) (Math.random() * 4);// 0~3이라면
		// 2진문자열로 만들자 0~3까지나온다
		// if else
		String m = "";
		m += rand / 2;// 몫과
		m += rand % 2;// 나머지를 나눠서만 처리하면됨
		System.out.println(rand + " => " + m);
		// 발생할 수 있는 수치의 범위를 모른다면, 간단히 처리되지 않는다.
		// 몫구하고 나머지구하고 몫구하고 나머지구하고를 반복해야한다.
		// 반복처리에 사용되는 구문은 while (do~while)/for 두가지이다.
		// 1.while loop(반복=루프) :
		// 반복을 시켜야되는 데이터 상태를 설정.
		while (rand > 0) {
			// System.out.println("1");
			// System.out.println("2");
			rand--;
		}
		int val = (int) (Math.random() * 30);
		// 2로나누고 몫을 구한다 이작업이 2보다 클때까지
		// 그리고 거꾸로 더한다.
		System.out.println(val);
		String result = "";
		while (val > 0) {
			int p = val / 2;
			int n = val % 2;
			result = n + result;
			System.out.println(p + " ....." + n);
			val = p;// 값 바꿔치기 그래야 조건이 성립하고 멈춘다.
			// 값을 콘솔에서 출력하는 방향으로했다
		}
		System.out.println(result);
		String str = "";
		str = "자" + str;
		str = "전" + str;
		str = "거" + str;
		System.out.println(str);
	}

}
