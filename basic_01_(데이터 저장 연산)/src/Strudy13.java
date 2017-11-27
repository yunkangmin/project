
public class Strudy13 {

	public static void main(String[] args) {
		final int ONE_DAY=60*60*24;
		int total=45122;
		
		double rate=total/ONE_DAY*1.0;
		System.out.println(rate);
		//대입이나 연산 같은 경우는 auto casting이 일어남.(수치형데이터기준)
		//i2l,i2f,i2d,l2f,l2d,f2d //직접안해도 자동으로됨
		//[i or l] 2 [f or d] .0붙인 실수데이터로 변환
		//반대 방향은 manual casting을 해야함(유일한 예외가 +=계열)//애네는 직접적어줘야함
		//casting은 (변환할 타입)타겟 데이터 
 		//float frate=rate*10;
		System.out.println(rate*ONE_DAY);//실제로는 아래로 계산된다.
		System.out.println(rate*(double)ONE_DAY);
		System.out.println((int)rate*ONE_DAY);
		//실수형 데이터를 정수형으로 f or d -> i or l로 바꾸면 소수점아래로 다버리고 정수데이터
		
		double d=4.99;
		float f=(float)d;
		System.out.println(d+" "+f);
		System.out.println((int)d);
	
	}

}
