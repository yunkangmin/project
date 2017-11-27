
public class Source12Plus {

	public static void main(String[] args) {
		int t1=20+(int)(Math.random()*40);//20 59
		int t2=20+(int)(Math.random()*40);
		//두 정수 사이의 합
		System.out.println(t1+"~"+t2+"사이의 누적합(끝값포함)=");
		int sum=0;
		
		int small=t1<t2?t1:t2;//컴퓨터가 싫어할수도 있다 어쨋든 무조건 실행되므로
		int big=t1>t2?t1:t2;
		/*for(int i=small;i<=big;i=i+1) {//무조건 t1이 작다고 생각하고 실행하는것
			sum+=i;
		}*/
		//t1과 t2가 같을 때도 적용된다.
		/*if(t1>t2) {//t1이 t2보다 클경우
			int sub=t1;//두개의 자리를 바꾼다.
			t1=t2;
			t2=sub;
		}*/
		for(int i=t1;i<=t2;i=i+1) {//무조건 t1이 작다고 생각하고 실행하는것
			sum+=i;
		}
		System.out.println(sum);

		System.out.println(t1+"과"+t2+"를 동시에 나누어 떨어뜨리는 수의 개수 ?");
		
		int cnt=0;
		for(int val=1;val<=small;val++) {
			if(t1%val==0&&t2%val==0) {
				System.out.println("FOUND!!"+val);
				cnt++;
			}
		}
		System.out.println("공약수 = "+cnt);
		/*int i;
		for (i = 1; i <= t2 * t1; i++) {
			if ((i % t1 == 0) && (i % t2 == 0)) {
				// i가 1부터 시작해서 n*m까지 가면서
				// n으로도 나누어 지고, m으로도 나누어 지면, break(종료)
				break;
			}
		}//for
		System.out.print("최소공배수는 " + i + "입니다 ");

		for (i = t1; i >= 1; i--) {
			if ((t2 % i == 0) && (t1 % i == 0)) {
				break;
			}
		}//for
		if (i == 1) {// i가 1이라는 의미는 최대공약수가 없다는 것입니다..
			System.out.print("최대공약수가 없습니다.");
		}
		else {
			// i가 1이 아닌 수이면, 최대공약수가 바로 i 입니다..
			System.out.print("최대공약수는 " + i + "입니다.");
		}//else
		 */


	}
}
