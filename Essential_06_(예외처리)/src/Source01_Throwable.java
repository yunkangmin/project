/*
 * About Throwable ?
 * 
 * Throwable Handle ?
 * 
 * �ڹٴ� Throwable Ŭ�����κ��� �������
 * �ΰ迭�� Ŭ�������� ������ 
 * Exception :����Ʈ�������� ����.
 * Error:�ϵ�������� ����
 * 
 * Ư�� ��ü���� ==> JVM�� ������ ���Ḧ ���߽�Ű�� Ư����ü
 */
public class Source01_Throwable {
	public static void main(String[] args) {
		Throwable t1=new RuntimeException();
		Throwable t2=new InterruptedException();
		Throwable t3=new OutOfMemoryError();
		System.out.println("=============================");
		/*Integer i=Integer.valueOf(544);
		throw i; throwable�� ��Ӿ��ؼ� �ȵȴ�.*/
		if(Math.random()>0.5) { // 90%
			RuntimeException re= new RuntimeException();
			
			  throw re;//throwable�� ����ϴ� ��ü�� ���� ���� ���� �߻�
			  //exception�ֵ��� ���� 
		}
		//���� �����ص� �ڵ�� ���� Ư�� ��� Ȥ�� �����۾��� throw�� �����صа͵��� ������.
		//�迭���� ����ε�������ٿ�忡��
		//�׷��� ���α׷��� ���൵�߿� �߰��� JVM�� ���ߴ� ������ �Ͼ�� ����.
		System.out.println("������� ����");
		
		int n=Integer.parseInt("100d");//�⺻�� 10�����̱⶧���� 10�����ڰ� ��� ������.
		System.out.println(n);
		
		
		int[] ar=new int[3];
		if(ar[3]==0) {//���α׷��� �����Ű�� ��ü���� �ִ�.
			
			
		}
		System.out.println("��������� ����");}
}
