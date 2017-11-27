package interfaces;

import javax.swing.JOptionPane;

/*
 * 
 * 
 */
class Checker {}
class TimeChecker extends Checker implements Runnable{
	//�������̽��� ����� �ƴ� �����̱� ������ ��Ӱ� ������ ���ÿ� �����ϴ�.
	public void run() {
		long t1=System.currentTimeMillis();
		int cnt=0;
		while(true) {
			
			if(System.currentTimeMillis()-t1>5000)
				break;
			cnt++;
		}
		System.out.println(cnt);
		JOptionPane.showConfirmDialog(null, "Time OVER");
		System.exit(0);
	}
}
public class Source02_TestUsingCode {
public static void main(String[] args) {
	//Runnable�����۾��ҽ� �����·� ������ �Ѵ�.
	//�������̽��� ���� �������Ѵ�.
	//Ŭ������ JVM�� ��������ش�.���ο��� �����۵��ϴ°� Runnable���� �����.
	//��Ƽ���μ�����Ƽ������
	Runnable r= new TimeChecker();
	new Thread(r).start();//Runnable class�� �۵���Ű�� �ڵ�

	//�������� �����忡 �������̽��� �ִ�.�̰ɺ��� �Ȱ��� ������ �����·� ������
	//�Ű������� �䱸�ϴ°� ���� gui������������ ���ݴܰ迡�� �Ҽ�����.
	int n=JOptionPane.showConfirmDialog(null, "Do You Want To Exit");
	System.out.println("CHECK : "+n);
	//������ ������ ���� �ڵ�� ������ �ȴ�
	//��ư�� ������ ���ڷ� ���´�.
	//10�ʵ��� �ƹ��۾��� ������ ���â�� ���ų�
}
}
