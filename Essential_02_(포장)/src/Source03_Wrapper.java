/*
 * Wrapper class��  �� �ʼ��� ������..
 * 	parsing ����� Wrapper class��  ������ �־..
 * 	(parse:�м��ϴ�.)//String =>�⺻������
 */
public class Source03_Wrapper {
	public static void main(String[] args) {
		boolean b=Boolean.parseBoolean("123true");
		//��ĭ�̶� ����� ������ false�� ���. 
		//boolean parsing�� ������ ture�ƴϸ� false�� ���.
		System.out.println(b);
		//parseXXXX(String)10�� �м�, parseXXXX(String, int)���� ����
		//byte be=Byte.parseByte("1321");
		byte be1=Byte.parseByte("121");
		//��ġ�� parsing�� �ͼ����� �߻��Ҽ� ����.
		//�����ʰ���, �м��Ұ����� ���ڰ� ������
		
		//Integer.parseInt("123d44");// ������, �⺻�� 10���� 
		Integer.parseInt("223",16);
		
		//�Ǽ��� ������ ����.
		float f=Float.parseFloat("233.22");//�Ҽ����� �ΰ��� ����
		System.out.println(f);
		
		double d=Double .parseDouble("111.44");
	
		//Character�� parse�� ����.
		//String�� ������ �־ ����.
	}
}
