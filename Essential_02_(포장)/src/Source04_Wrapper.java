/*
 * Wrapper class�� �ش絥���͸� �ٷ�µ� �־ 
 * ������ ��������ͳ�, ��ɵ��� ������.
 * 
 * 
 */
public class Source04_Wrapper {
	public static void main(String[] args) {
		boolean r=Boolean.logicalAnd(true, false);
		System.out.println(r);
		
		boolean r1=Character.isDigit('1');
		System.out.println(r1);
		//�ش繮�ڰ� ���ڰ� �´���
		boolean r2=Character.isAlphabetic('a');
		//�������� �ƴ���
		System.out.println(r2);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int d=Long.compare(40533L,1321L);
		System.out.println(d);
		//�ڿ����� ũ�� -1 �տ����� ũ�� 1
		
		System.out.println(1.0/0.0);//���ڿ���ü�� infinity
		boolean z=Double.isInfinite(1.0/0.0);
		System.out.println(z);
		boolean zz=Double.isNaN(0.0/0.0);
		System.out.println(zz);
	}
}
/*
 * Java API����
 * 	java.oracle.com>java download>java resource>APIs>javase8
 * 
 * Class..java.lang�Ҽ��� Ŭ������ import�� ���� �ʾƵ� ��� ������.
 */


