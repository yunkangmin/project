
public class Strudy13 {

	public static void main(String[] args) {
		final int ONE_DAY=60*60*24;
		int total=45122;
		
		double rate=total/ONE_DAY*1.0;
		System.out.println(rate);
		//�����̳� ���� ���� ���� auto casting�� �Ͼ.(��ġ�������ͱ���)
		//i2l,i2f,i2d,l2f,l2d,f2d //�������ص� �ڵ����ε�
		//[i or l] 2 [f or d] .0���� �Ǽ������ͷ� ��ȯ
		//�ݴ� ������ manual casting�� �ؾ���(������ ���ܰ� +=�迭)//�ֳ״� �������������
		//casting�� (��ȯ�� Ÿ��)Ÿ�� ������ 
 		//float frate=rate*10;
		System.out.println(rate*ONE_DAY);//�����δ� �Ʒ��� ���ȴ�.
		System.out.println(rate*(double)ONE_DAY);
		System.out.println((int)rate*ONE_DAY);
		//�Ǽ��� �����͸� ���������� f or d -> i or l�� �ٲٸ� �Ҽ����Ʒ��� �ٹ����� ����������
		
		double d=4.99;
		float f=(float)d;
		System.out.println(d+" "+f);
		System.out.println((int)d);
	
	}

}
