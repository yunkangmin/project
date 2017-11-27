/*
 * Wrapper class가  꼭 필수인 이유가..
 * 	parsing 기능을 Wrapper class가  가지고 있어서..
 * 	(parse:분석하다.)//String =>기본데이터
 */
public class Source03_Wrapper {
	public static void main(String[] args) {
		boolean b=Boolean.parseBoolean("123true");
		//한칸이라도 띄어져 있으면 false가 뜬다. 
		//boolean parsing은 무조건 ture아니면 false가 뜬다.
		System.out.println(b);
		//parseXXXX(String)10진 분석, parseXXXX(String, int)진수 설정
		//byte be=Byte.parseByte("1321");
		byte be1=Byte.parseByte("121");
		//수치형 parsing은 익셉션이 발생할수 있음.
		//범위초과나, 분석불가능한 문자가 있을때
		
		//Integer.parseInt("123d44");// 터진다, 기본이 10진법 
		Integer.parseInt("223",16);
		
		//실수는 진법이 없다.
		float f=Float.parseFloat("233.22");//소수점이 두개면 에러
		System.out.println(f);
		
		double d=Double .parseDouble("111.44");
	
		//Character는 parse가 없음.
		//String이 가지고 있어서 없다.
	}
}
