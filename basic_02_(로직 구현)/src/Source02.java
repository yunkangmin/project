
public class Source02 {

	public static void main(String[] args) {
		int t = 100 + (int) (Math.random() * 900);
		boolean mode = Math.random() > 0.5;
		System.out.println(mode + " .. " + t);

		// mode값이 ture면 ,t라는 숫자구성이 전부다 다른 수치인지 확인
		int a = t / 100;// t%1000/100
		int b = (t % 100) / 10;// (t-a*100)/10
		int c = (t % 100) % 10;// t%10/1 t%10
		boolean rst;

		if (mode) {
			boolean b1 = (a != b);
			boolean b2 = (a != c);
			boolean b3 = (b != c);
			rst = b1 && b2 && b3;

		} else {

			boolean b1 = (a == 3);
			boolean b2 = (a == 3);
			boolean b3 = (b == 3);
			rst = b1 || b2 || b3;
		}
		System.out.println("검증 결과 : " + rst);
		// 그렇지 않으면,3이라는 수치가 있는지 확인

	}

}
