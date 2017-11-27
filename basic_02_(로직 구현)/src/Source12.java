
public class Source12 {

	public static void main(String[] args) {
		//for loop : 특정범위의 수치를 이용한 반복처리를 위해서도 사용이 된다.
		/*for(int num=1;num<=10;num++) {
			// in loop 에서는 num이란 변수를 사용할 수 있다.
			System.out.println(num);
		}*/
		//System.out.println(num);for loop 종료후엔, num 이란 변수를 이용할 수는 없지만,
		//특정수의 약수 개수?
		int target=30;//2~29사이의 숫자들로 target을 나눠보고 나머지 0인 수의 개수
		int c=0;
		for(int v=2;v<target;v++) {//절반을 넘어갈 필요가 없다.절반을 넘어가면 약수가 안된다.
			if(target%v==0) {//딱 절반까지만 된다.
				System.out.print(v+" ");
				c++;
			}
		}
		System.out.println("약수의 개수: "+c);
		//특정 단의 구구단 출력
		int dan=3;
		for(int m=9;m>=1;m--) {
			String str=dan+" X "+m+" = "+(dan*m);
			System.out.println(str);
		}
	}

}
