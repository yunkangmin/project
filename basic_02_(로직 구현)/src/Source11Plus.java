
public class Source11Plus {

	public static void main(String[] args) {
		//특정수 N의 D제곱을 구해보자 -for loop를 사용해서

		/*	int n=2+(int)(Math.random()*4);//2-5
		int d=3+(int)(Math.random()*5);//3-7
		int result=1;
		for(int cnt=0;cnt<d;cnt++) {
			result*=n;
		}
		System.out.println(n+" 의 "+d+" 제곱(승) 은? "+result);*/

		//음수와 양수를 나눠서 처리하면 된다.
		//if else를 쓰자
		int n=2+(int)(Math.random()*4);//2~5
		int d=-3+(int)(Math.random()*7);//-3 ~ 3
		double result=1;//int면 안된다.
		if(d>0) {
			for(int cnt=0;cnt<d;cnt++) {
				result*=n;
			}
		}
		else {
			for(int cnt=0;cnt<-d;cnt++) {
				result/=n;
			}
		}
		System.out.println(n+" 의 "+d+" 제곱(승) 은? "+result);
		double p=Math.pow(n, d);//n의 d제곱을 구해주는 기능.
		System.out.println(p);
		//d가 0인 경우 그냥 1이 나온다.
	}

}
