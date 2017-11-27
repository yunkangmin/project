/*
 * Wrapper class는 해당데이터를 다루는데 있어서 
 * 유용한 상수데이터나, 기능들이 존재함.
 * 
 * 
 */
public class Source04_Wrapper {
	public static void main(String[] args) {
		boolean r=Boolean.logicalAnd(true, false);
		System.out.println(r);
		
		boolean r1=Character.isDigit('1');
		System.out.println(r1);
		//해당문자가 숫자가 맞는지
		boolean r2=Character.isAlphabetic('a');
		//문자인지 아닌지
		System.out.println(r2);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int d=Long.compare(40533L,1321L);
		System.out.println(d);
		//뒤에것이 크면 -1 앞에것이 크면 1
		
		System.out.println(1.0/0.0);//문자열자체가 infinity
		boolean z=Double.isInfinite(1.0/0.0);
		System.out.println(z);
		boolean zz=Double.isNaN(0.0/0.0);
		System.out.println(zz);
	}
}
/*
 * Java API문서
 * 	java.oracle.com>java download>java resource>APIs>javase8
 * 
 * Class..java.lang소속의 클래스는 import를 하지 않아도 사용 가능함.
 */


