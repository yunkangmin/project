
public class TestSolution03 {

	public static void main(String[] args) {
		//�������� 2���� Ȯ�� -5 ~ 5//
		/*int a
		int b*/
		int rx=-5+(int)(Math.random()*11);
		int ry=-5+(int)(Math.random()*11);
		System.out.println(rx+" "+ry);
		//2���� ��ǥ��..0��(0.0)���� �ش� ��ǥ������ �Ÿ�?
		//�������� ���� x��^2+y��^2����Ʈ
		//�װ��� ��ź(��ȿ�ݰ� 5�̸�)�� ������ �����̶�� �����ϰ� 0���� ������ ��ġ����?
		//>,>=,<,<= ��ġ���� ũ�� Ȯ�� T/F ��ġ����

		double r=Math.sqrt(rx*rx+ry*ry);
		System.out.println(r);
		System.out.println(r<5);
		boolean f=r<=5;
		System.out.println("����?"+f);
		//�Դ� ���� �ۼ�Ʈ ���?? �Ÿ��� 0:100% /5:0%
		
		double d=100-(r/5*100);//���� ���ذ� ���´�.
		//�Ÿ��� 5�� �ʰ��� ��Ȳ�� ������� �ʰ� ����� �ؼ� ���������Ͱ� ����
		//d>=0?d:0;
		
		System.out.println(d);
	}

}
