
public class TestSolution02 {

	public static void main(String[] args) {
		//4.81512(이데이터를 *100)후  i=>481
		//랜덤 수치 만들기.
		Math.random();//0.0 <=   <1.0 double형 데이터
		System.out.println(Math.random()*10);//0.0<=   <10.0
		
		System.out.println((int)(Math.random()*10));//0<= <10
		
		//(int)(Math.random()*N)? 0<=  <N 사이의 정수를 만들어 낼수 있다.
		//S+(int)(Math.random()*N)? S+0<=  <S+N 사이의 정수를 만들어 낼수 있다.
		//1+(int)(Math.random()*3)? 1<=  <4 사이의 정수를 만들어 낼수 있다.
		
		//위 데이터처리를 사용해서 랜덤wl수(1~9)3개를 확보하고 출력
		//이 3개의 데이터를 삼각형의 각변의 길이라고 생각
		//넓이 계산 헤른이라는 사람이 발견한 헤론의 
		//루트 
		int a=1+(int)(Math.random()*9);
		int b=1+(int)(Math.random()*9);
		int c=1+(int)(Math.random()*9);
		
		double s=(a+b+c)/2.0;
		double width=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println(Math.sqrt(25.0));//더블형 데이터를 집어넣는다.더블 변수로 받아야한다.
		System.out.println(width);
		
		
		}

}
