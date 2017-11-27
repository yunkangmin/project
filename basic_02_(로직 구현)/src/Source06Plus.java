
public class Source06Plus {

	public static void main(String[] args) {
		//일반적으로 switch ~case는 break를 이용해서, 케이스별 작업 지정하는 형태가 많지만
		//꼭 break를 써야 되는 건 아님. 이 형태를 살펴보자
		int t=7;
		char c='A';
		int s=1;//점수가 몇점인가?T:t*t*t , D:t*t, S:t
		//break없이
		//위에가 큰것부터 설정하면 break가 없어도 된다.
		//break를 꼭써야 되는 건아니다.
		switch(c) {
		default:
			s=999;
			break;
		case 'T': 
		case 't'://소문자와 대문자모두 해당
			s*=t;
		case 'D':
			s*=t;
		case 'S':
			s*=t;
		}
		System.out.println(s);
		//특정수 N의 D제곱을 구하는 방법?
		//int형 변수 하나에 1설정해두고, 이 변수*=N작업을 D번 시키면 됨.
	}

}
