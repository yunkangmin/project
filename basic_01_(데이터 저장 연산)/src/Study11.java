
public class Study11 {

	public static void main(String[] args) {
		//변수의 데이터를 변경/조작하는 
		//공통적으로 =(데이터설정)
		float f;
		f=3.14f;
		long n;
		n=11111L;
		//변수라는 건 값이 계속 바뀔 수있음.
		System.out.println(f);
		f=3.142592f;
		System.out.println(f);
	//수치형 변수(byte, short, int, long, float, double)
		int i=100;
		i+=3;
		System.out.println(i);
		i-=1;
		System.out.println(i);
		//+=,-=.*=,/=,%=
		f*=2;
		System.out.println(f);
		//i의 값을 <<2변경하고 싶다면
		i=i<<2;
		System.out.println(i);
		
		int val=30;
		//val=val*0.2;
		val*=0.333;
		byte b=127;
		//b=b+1;
		b+=1;
		
	}

}
