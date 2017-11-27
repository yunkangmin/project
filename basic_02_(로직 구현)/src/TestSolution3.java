
public class TestSolution3 {

	public static void main(String[] args) {
		//0과 1을 기준으로
		//자기 앞에있는 숫자를 더해나간다.
		//0 1 1 2 3 5 8 13 21 34 55
		int n1=0;
		int n2=1;
		int sum;

		for(int i=1;i<=10;i++) {
			if(i==1) {
				System.out.println("1번째의 값 : "+n1);
			}
			else if(i==2) {
				System.out.println("2번째의 값 : "+n2);
			}
			else {
				sum=n1+n2;
				System.out.println(i+"번째의 값 : "+sum);
				n1=n2;
				n2=sum;
			}
		}

		//5번의 1~10사이의 랜덤정수를 뽑아내는 작업을 설정해서 나온 숫자들을 출력
		//이 반복이 끝나고 난 후, 가장 큰 수가 특정변수에 설정이 되어잇게 구분.
		//do ~while
		int d=0;
		int a,b,c;
		int sum1 ,sum2;
		do{
			a=1+(int)(Math.random()*10);
			b=1+(int)(Math.random()*10);
			c=1+(int)(Math.random()*10);
			sum2=a+b+c;
			if(d==0) {
				sum1=a+b+c;
			}
			sum1=sum1>sum2?sum1:sum2;
		}while(d<5);
		/*if()
			System.out.println(a+" "+b+" "+c);*/

	}

}
