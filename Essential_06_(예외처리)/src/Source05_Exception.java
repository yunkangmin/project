
/*
 * �帧�� ¥�ٺ���, �������� �ͼ����� ���ÿ� ó���ؾߵǴ� ��Ȳ�� ����.
 * 
 * 
 * 
 */
import java.io.IOException;
import java.net.*;//��Ʈ��ũ ��Ž� ���

import javax.swing.JOptionPane;

public class Source05_Exception {
	public static void main(String[] args) {
		//���� �ͼ����� ���ÿ� ó���ؾ� �Ǵ� ��찡 ���� ��Ƽĳġ
		//����ó���� �ϰ� ������ catch(�ͼ��� | �ͼ��� | �ͼ��� �������Ѱ�)
		long t1=System.currentTimeMillis();
		
		try {
			String port=JOptionPane.showInputDialog(null,"������ ��Ʈ?");
			//esc�� ������ ��ü�� ������ �ȵ� nullPointException
			
			
			
			
			/**/if(port.matches("1\\d+")) {//1�ν����ϴ� ���̸�
				throw new IndexOutOfBoundsException();
				//���� �����߻�
			}
			
			
			int iport=Integer.parseInt(port);
		ServerSocket server=new ServerSocket(iport);//���� ������ 1���������� 65535����
		//SecurityException, IOException, IllegalArgumentException
		System.out.println("�߰� ���డ��..");
		/*long t2=System.currentTimeMillis();
		System.out.println(t2-t1+"ms");*/
		}catch(NumberFormatException e) {//���ڰ��ƴѰ�
			System.out.println("��ġ���·� �Է� �ٶ�");
			
			//�츮���� Ȯ���ϱ� �����͵鸸 ���Ƽ� ó���ض�(if else������ ó���ϱ� �����͵�)
		}/*catch(IllegalArgumentException e) {//������ ���� ��Ʈ��ȣ
			System.out.println("1~65535 ��ġ�� �Է�");//��Ƽ�ͼ���ó�� �ͼ��������� ������ ��Ƽ ĳġ�ϸ�ȴ�.
		
		}*/catch(IOException | IllegalArgumentException e){//�������� ��Ʈ //�ָ� ��Ƶ� ������ �ִ�. //445
			System.out.println("1~65535���� �Ⱦ��� ��Ʈ�� ����");
			System.out.println(e.getMessage());//�� ��Ʈ�ȴ��� ������ ���´�.
		}/**/finally {
			//try�� ���������� ó���Ǵ�, catch�� ���� ������ �������� ������ �۵�
			long t2=System.currentTimeMillis();
			System.out.println(t2-t1+"ms");
			//finally�� ������
		}
		
		
		
		System.out.println("���α׷� ����");
		}
}
//�ͼ��ǵ鵵 ��Ű���� �ִ�.
//����Ƶ� �Ǵ��ͼ��ǵ��� if else�� �������ִ�.