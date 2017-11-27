
public class Source05 {

	public static void main(String[] args) {
		// if나 else if , 혹은 else안에서 중첩 if 사용할수 있음
		// 20~90사이의 랜덤 정수 3개를 확보하시오
		int s1 = 20 + (int) (Math.random() * 80);
		int s2 = 20 + (int) (Math.random() * 80);
		int s3 = 20 + (int) (Math.random() * 80);

		System.out.println(s1 + ".." + s2 + ".." + s3);
		String result;// result에 문자열 하나를 설정해야됨
		// 평균90이상이면 A등급, 75이상이면 B등급, 60이상이면 C등급 ,나머지는 FAIL이라는 문자열을 설정
		// 평균만 등급에 영향을 미치는게 아니라 하나라도 40미만이 있으면 무조건 FAIL
		// 큰 가지를 나눠놓자
		double avg = (s1 + s2 + s3) / 3.0;
		avg = (int) (avg * 100) / 100.0;

		if (s1 >= 40 && s2 >= 40 && s3 >= 40) {
			// 여기서 평균을 계산해서
			// 이안에 if else처리.
			if (avg >= 90) {// 중첩 if else는 들여쓰기 하자 외부 if else와 헷갈린다.
				result = "A";
			} else if (avg >= 75) {
				result = "B";
			} else if (avg >= 60) {
				result = "C";
			} else {
				result = "FAIL";
			}
		} else {
			result = "FAIL";
		}
		System.out.println(avg);
		String r = avg > 0 ? "+" : "";
		r += avg;
		if ((int) (avg * 100) % 10 == 0)
			r += "0";
		System.out.println(result + " " + r);
	}
	//데이터를 집어넣는것도 작업이다.

}
