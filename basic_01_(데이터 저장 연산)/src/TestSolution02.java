
public class TestSolution02 {

	public static void main(String[] args) {
		//4.81512(�̵����͸� *100)��  i=>481
		//���� ��ġ �����.
		Math.random();//0.0 <=   <1.0 double�� ������
		System.out.println(Math.random()*10);//0.0<=   <10.0
		
		System.out.println((int)(Math.random()*10));//0<= <10
		
		//(int)(Math.random()*N)? 0<=  <N ������ ������ ����� ���� �ִ�.
		//S+(int)(Math.random()*N)? S+0<=  <S+N ������ ������ ����� ���� �ִ�.
		//1+(int)(Math.random()*3)? 1<=  <4 ������ ������ ����� ���� �ִ�.
		
		//�� ������ó���� ����ؼ� ����wl��(1~9)3���� Ȯ���ϰ� ���
		//�� 3���� �����͸� �ﰢ���� ������ ���̶�� ����
		//���� ��� �츥�̶�� ����� �߰��� ����� 
		//��Ʈ 
		int a=1+(int)(Math.random()*9);
		int b=1+(int)(Math.random()*9);
		int c=1+(int)(Math.random()*9);
		
		double s=(a+b+c)/2.0;
		double width=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println(Math.sqrt(25.0));//������ �����͸� ����ִ´�.���� ������ �޾ƾ��Ѵ�.
		System.out.println(width);
		
		
		}

}
