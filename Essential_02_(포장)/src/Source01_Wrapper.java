/*
 * Wrapper class
 * -�⺻�����͸� ��üȭ �Ҷ� ���Ǵ� class
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
		System.out.println(b==bb);//���� ���� ������ �ִ� ��ü�ϻ��̴�.
		
		Integer i= new Integer(4);//Wrap
		Integer i2=new Integer(4);
		System.out.println(i==i2);
		System.out.println(i.intValue()==i2.intValue());
		
		Long g=new Long("23423");//Wrap
		Double d=new Double(234234.3434);//Wrap
		Character c=new Character('��');//Wrap
		//�⺻������ �ڱ� �����ʹ� ó���� ���ش�.
		
		boolean ib=b.booleanValue();//�ٽ� �ڽ��� Ǯ����.
		int ii=i.intValue();
		g.longValue();
		d.doubleValue();
		c.charValue();
		
	}

}
