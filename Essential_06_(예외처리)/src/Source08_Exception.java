import java.io.IOException;
import java.net.ServerSocket;

/*
 * ���� ���� :
 *  �ͼ����� ���� ó���� ���ؾߵǴ� �� �ƴϰ�, ���۾��� ȣ���� ������ �Ѱܼ� ���ʿ��� ó���� ��ų�� ����.
 * 
 * �޼ҵ�ڿ� �ٴ� throws XXXXXXException�� �ǹ�?
 *  �� �޼ҵ� �ȿ��� �߻��ϴ� XXXXXXException�� �� ������ �Ѱܼ� ó���Ҳ��ϱ� �Ű澲�� ���ƴ޶�°�.
 * 
 * ���ο��ٰ� �ٿ��δ°��� �׷��� ������ �ƴ�.=>���� ������ �ѱ�°� �Ұ���->JVM
 * 
 * throws�� ���� ����ϳ�..?
 * 
 * 
 */
class Timer{
	Timer()throws InterruptedException{//Ŭ������ �����θ� ��򰡿����� ����Ѵ�. ���� �����̶�� ������ �ִ� ���ɼ��� �ִ�.
		//������ �ƴ� �޼ҵ忡�� ����ó���� �������� ����Ѵ�. ���ο��ٰ��� �����ָ�ȴ� ���൵ ������ ����ó���� �ȵȴ�.
		//���߿� �̸޼ҵ带 ����Ҷ� ���ڴٴ°�
		//�ϳ��� �޼ҵ尡 ������ �װͶ����� try catch�� �ؾ��Ѵ�.
		
		System.out.print("CREATE");//print �ٹٲ� ���� �ܼ� ���
		
		//try {
			for(int i=0;i<=3;i++) {
		System.out.print(".");
			Thread.sleep(500);// InterruptedException �ʼ�ó�� �ͼ���
			}
			System.out.println("COMPLETED");
	}
}
public class Source08_Exception {

	public static void main(String[] args) throws InterruptedException,IOException{
		
		/*sleep�޽��� ������ �����¿� ���� ��

		interrupt()�޽��� �����带 ����������

		�߻��ϰ� �ȴ�.*/

		


		
		System.out.print("Ready");//print �ٹٲ� ���� �ܼ� ���
		
			//try {
				for(int i=0;i<=3;i++) {
			System.out.print(".");
				Thread.sleep(500);// InterruptedException �ʼ�ó�� �ͼ���
				}
			//} catch (InterruptedException ie) {
				//System.out.println("exception : "+ie.getMessage());
		//	}
		
		System.out.println("DONE");
		new ServerSocket(445);
	}

}
