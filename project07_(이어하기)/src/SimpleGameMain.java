import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SimpleGameMain {

	public static void main(String[] args) {
		Console console=System.console();
		String user;
		int win;
		int lose;
		//1.������ �ε�====================================================
		user=console.readLine("����ڴг���?");
		File f= new File("c:\\Users",user+".dat");
		if(f.exists()) {
			try {
				FileInputStream fis=new FileInputStream(f);
				DataInputStream dis=new DataInputStream(fis);
				int cnt=0;
				try {
				//	while(dis.available()>0) {
						//cnt++;
						int w=dis.readInt();
						int l=dis.readInt();
						System.out.println(user+"���� �����͸� �ҷ��鿴���ϴ�.");
						//if(cnt<=4||dis.available()<=4)
						//System.out.println(cnt+" : "+b);
						//�� �ڵ忡�� �ǹ��ְ� ���� �Ǵ°�, �迭�� �о��(read),
						//���ϵǴ� ���� ���� ä���� ĭ�� ��� ��(�� ���� ĭ���� ���ǹ�)
					//}
						win=w;
						lose=l;
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			//�ش����Ͽ� ��ǲ�� ���� ��������ǲ���� ��ü�ؼ� �����͸� �ٴٴٴ� read
			//win,lose�� ����
		}else {
			win=0;
			lose=0;
			System.out.println(user+"���� �����͸� �ʱ�ȭ�Ͽ����ϴ�.");
			
		}
		//2.���� ����==============================================================
		while(true) {
			System.out.println();
			String in=console.readLine("������ ����! 1.����2.����3.�� ?");
			double r= Math.random();
			if(r>0.2) {
			
				System.out.println("��Ÿ���Ե� ����� �����ϴ�.");
				switch (in) {
				case "1":
					System.out.println("���� �� # ����� ����...������ ����");
					break;

				default:
					break;
				}
				
			}else if(r<=0.2&&r>=0.05){
				if(Math.random()>0.25) {
					System.out.println("���ེ�� ����� �����ϴ�.");
				}else {
				System.out.println("�Ǹ��մϴ�.���� �����ƽ��ϴ�.");	
					win++;
				}
				
			}
			//======================================================================
			String con=console.readLine("������ �����÷��� N (����� enter)?"); // ""
			if(con.equals("N")) {
				break;
			}
			
		}
		//3.������ ����===============================================================================
		//������̸����� ���ϸ��� 
		//���Ͼƿ�ǲ���, �����;ƿ�ǲ ��ü�ؼ� 
		//�о ������� ����� �صθ� ��.
		
		
		System.out.println(user+"���� �����Ͱ� �� ��ϵǾ����ϴ�.");
	/*	#����,����,��#

		-������ �̿��ؼ� ������� ������ �����ϰ� �����ϰ�,
		���α׷��� ������,������� ������ �ִٸ� �����͸� �о,
		�׻��¿��� �̾��Ҽ� �ֵ��� ����

		���̺������� ������� �����Ҳ��ĸ�
		��ŷ����.dat
		cat.dat
		���̸����� ������� �̸��� �������ִ��� üũ*/

	}

}
