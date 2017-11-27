
public class Source04 {

	public static void main(String[] args) {
		// 2.else if ?라는 걸 이용해서 해야되는 작업을 2가지가 아니라 좀더 세분화 시킬수 있다.
		int n1 = 1 + (int) (Math.random() * 3);
		int n2 = 1 + (int) (Math.random() * 3);

		System.out.println(n1 + ".." + n2);
		// n1이 n2보다 큰상황 그렇지 않은 상황 이 두가지 분기가 아니라
		// 같은 상황 작은 상황까지 더 다양한 분기 작업이 필요할때

		if (n1 > n2) {

		} else if (n1 < n2) {

		} else {

		}
		// 다트 점수 계산하는 문제가 있었음
		// 3개의 다트데이터가 있다고 가정하고 최종점수를 계산하는거
		String result="10T#2D7S";//옵션있을시 더하기 옵션까지 적용하고 해야함
		
		int score = 0;
		int d1 = 10;
		char b1 = 'D';// 점수가 Triple(점수가 3제곱)
		char o1='*';//#(-1), *(2배), 공백(노 옵션)
		if(b1=='D'||b1=='d') 
			score+=d1*d1;
		else if (b1=='T'|| b1=='t')
			score+=d1*d1*d1;
		else
			score+=d1;
		
		if(o1=='*') {}
		
		else if(o1=='#') {}
		/*int d2 = 7;
		char b2 = 'S';// 점수가 Single(점수가 1제곱)
		score = d2;
		
		int d3 = 7;
		char b3 = 'D';// 점수가 Double(점수가 2제곱)
		score += d3 * d3;
		*/
		System.out.println("SCORE = " + score);
	}

}
