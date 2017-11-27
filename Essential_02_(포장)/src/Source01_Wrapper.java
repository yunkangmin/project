/*
 * Wrapper class
 * -기본데이터를 객체화 할때 사용되는 class
 * 
 * Boolean, Byte, Short, Integer, Long, Float, Double, Character
 * 
 * 
 */
public class Source01_Wrapper {
	public static void main(String[] args) {
		Boolean b=new Boolean(true);
		Boolean bb=new Boolean(true);
		System.out.println(b+" vs "+bb);
		System.out.println(b==bb);//같은 값을 가지고 있는 객체일뿐이다.
		
		Integer i= new Integer(4);//Wrap
		Integer i2=new Integer(4);
		System.out.println(i==i2);
		System.out.println(i.intValue()==i2.intValue());
		
		Long g=new Long("23423");//Wrap
		Double d=new Double(234234.3434);//Wrap
		Character c=new Character('문');//Wrap
		//기본적으로 자기 데이터는 처리를 해준다.
		
		boolean ib=b.booleanValue();//다시 박싱이 풀린다.
		int ii=i.intValue();
		g.longValue();
		d.doubleValue();
		c.charValue();
		
	}

}
