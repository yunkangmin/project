
public class Source03Plus {
	public static void main(String[] args) {
		//특정년도의 3월 1일 은 몇일 째 되는날이며, 
		//무슨요일인가?(0:일, 1:월 ,,,,6:토)인가?
		//주어진 데이터 해당연도, 1월1일의 요일.
		//1월31일이 화요일인 이유
		//31%7
		int year=2016;
		int week=5;//1월1일을 0으로 설정
		
		//윤년 +1 4년에 한번씩
		//3월1일이 59일째가 아니라 60일째가 되는 년도가 있어서
		//3월1일이 무슨요일인지만 알면된다.
		//4의 배수마다 윤년 100의배수면 윤년제외 400의 배수면 윤년처리를 함
	/*	윤년의 조건
		  '윤년은 4로 나누어지면서 100으로 나누어 떨어지지 않는 년.'
		  '400으로 나누어 떨어지는 년.' 이 윤년이다.
		 (윤년은 2월에 하루가 더 많아지는 해이다.)*/

	
		int day=59+week;
		System.out.println((year %4==0 && year %100!=0)||year%400==0);
		if((year %4==0 && year %100!=0)||year%400==0) {
			day++;
			
		}
		System.out.println(day%7);
		//1900,1=>4; 
		//2000,6=>3 4의 배수 100의 배수면 윤년에서 제외
		//2016,5=>2
		//2017,0=>3
	
	}
}
