
public class Source02Plus {

	public static void main(String[] args) {
		//int형 데이터들이 3개씩 묶어서 엄청 많이 발생하는 상황임.
		//유효성 체크를 하려고 함.(하나라도 겹치면 ERROR,다 다르면 VALID)
		//이걸 직접 계산해도 되겠지만 , procedure로 만들어서 처리할꺼임.
		//간단한 작업도 procedure로 하면 수정할때 좋다.
		//설계해보자
		//메서드네임은 항상 소문자로 시작
		//연결단어는 대문자로 
		//이름은 의미있게 작명하자
		for(int i=0;i<10;i++) {
			int a=1+(int)(Math.random()*10);
			int b=1+(int)(Math.random()*10);
			int c=1+(int)(Math.random()*10);
			boolean ture=valid(a,b,c);
			System.out.println(a+" "+b+" "+c);
			if(ture)
				System.out.println("ERROR\n");
			else
				System.out.println("VALID\n");
		}
		//int형 데이터들 간에 , 최소공배수(LCM) , 최대 공약수(GCD)를 구해서 처리를 해야될 일이 많음
		//메소드네임에 약자는 다 대문자로한다.
		int lcm= chooseLCM(12,15);
		System.out.println("최소공배수는 " + lcm + "입니다 ");
		int gcd= chooseGCD(15,12);
		if (gcd == 1) {// i가 1이라는 의미는 최대공약수가 없다는 것입니다..
			System.out.println("최대공약수가 없습니다.");
		}
		else {
			// i가 1이 아닌 수이면, 최대공약수가 바로 i 입니다..
			System.out.println("최대공약수는 " + gcd + "입니다.");
		}//else
		System.out.println(chooseLCM(8,12));
		System.out.println(chooseLCM2(8,12));
	}
	static boolean valid(int a,int b, int c) {
		return a==b||a==c||b==c;
		//return a!=b&&a!=c&&b!=c;
		/*boolean r=false;
		if(a!=b&&a!=c&&b!=c)
			r=true;
		return r;*/

	}
	static int  chooseLCM2(int a,int b) {
	//최소 공배수를 구하는 공식이 있음. 최대 공약수를 알면 쉽게 구할수 있음.
	//최대공약수*(a/최대공약수)*(b/최대공약수)
		int gcd=chooseGCD(a,b);
		//int gcd=chooseLCM2(a,b); 한다면, recursive(재귀)가 일어나다.
		return gcd*(a/gcd)*(b/gcd);
	}
	static int  chooseLCM(int t1,int t2) {
		/*int i;
		for (i = 1; i <= t2 * t1; i++) {
			if ((i % t1 == 0) && (i % t2 == 0)) {
				// i가 1부터 시작해서 n*m까지 가면서
				// n으로도 나누어 지고, m으로도 나누어 지면, break(종료)
				break;
			}
		}*///for
		/*int rst=t1;
		for(int val=t1; ;val++) {
			if(val%t1==0&&val%t2==0) {
				rst=val;
				break;
			}
		}
		return rst;*/
		/**/
	/*	for(int val=t1; ;val++) {
			if(val%t1==0&&val%t2==0) {
				return val;
			}
		}*/
		
		int val=t1;
		while(true) {
			if(val%t1==0&&val%t2==0) {
				break;
			}else {
			val++;
			}
		}
		return val;
	//두 수 중에 어느 수를 기준으로 하더라도 두 수 모두 나눠지려면 작은수 던 큰수던 상관없다.
	}
	static int  chooseGCD(int t1,int t2) {
		/*int i;
		for (i = t1; i >= 1; i--) {
			if ((t2 % i == 0) && (t1 % i == 0)) {
				break;
			}
		}//for
		return i;*/
		/**/int r=1;
		for(int val=2;val<=t1;val++) {
			if(t1%val==0&&t2%val==0) {
				r=val;
			}
		}
		//두 수 중에 하나라도 넘어가면 해당 두수로 안나눠지기 때문에 한계값을 두수중 아무 수로
		//설정한것
		/*int r=t1;
		for(int val=t1;val>=1;val--) {
			if(t1%val==0&&t2%val==0) {
				r=val;
				break;
			}
		}*/
		return r;
	}
	//두함수 모두 둘중에 뭐가 커도 똑같은 값이 나온다.
	
}
