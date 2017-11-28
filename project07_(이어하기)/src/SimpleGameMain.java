import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleGameMain {

	public static void main(String[] args) {
		Console console = System.console();
		String user;
		int win = 0;
		int lose = 0;
		// 1.������ �ε�====================================================
		user = console.readLine("����ڴг���?");
		File f = new File("c:\\empty", user + ".dat");
		if (f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);
				int cnt = 0;
				try {
					// while(dis.available()>0) {
					// cnt++;
					int w = dis.readInt();
					int l = dis.readInt();
					System.out.println();
					System.out.println(user + "���� �����͸� �ҷ��鿴���ϴ�.");
					// if(cnt<=4||dis.available()<=4)
					// System.out.println(cnt+" : "+b);
					// �� �ڵ忡�� �ǹ��ְ� ���� �Ǵ°�, �迭�� �о��(read),
					// ���ϵǴ� ���� ���� ä���� ĭ�� ��� ��(�� ���� ĭ���� ���ǹ�)
					// }
					win = w;
					lose = l;
					//System.out.println("����� ���� => �̱�Ƚ�� : "+win+" ��Ƚ��: "+lose);
				} catch (IOException e) {

					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

			// �ش����Ͽ� ��ǲ�� ���� ��������ǲ���� ��ü�ؼ� �����͸� �ٴٴٴ� read
			// win,lose�� ����
		} else {
			win = 0;
			lose = 0;
			System.out.println(user + "���� �����͸� �ʱ�ȭ�Ͽ����ϴ�.");

		}
		// 2.���� ����==============================================================
		System.out.println("������ ������ �����ø�  'n'�� ��������.");
		while (true) {
			System.out.println("===================================================");
			System.out.println("���ݱ����� ���� => �̱�Ƚ�� : "+win+" ��Ƚ��: "+lose);
			String in = console.readLine("������ ����! 1.����2.����3.�� ?   ");
			//System.out.println();
			//System.out.println();
			if (in.equalsIgnoreCase("n")) {
				break;
			}
			try {
				Thread.sleep(700);
				System.out.println("\t��");
				Thread.sleep(700);
				System.out.println("\t��");
				Thread.sleep(700);
				System.out.println("\t��");
				System.out.println();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int r = 1+(int)(Math.random()*3);
			if(in.equals("1")){
				if(r==Integer.parseInt("1"))
				System.out.println("����� ���� ��ǻ�͵� ���� �����ϴ�.");
				else if(r==Integer.parseInt("2")){
					System.out.println("����� ���� ��ǻ�ʹ� ���� ����� �����ϴ�.");
					lose++;
					
				}
				else{
				
					System.out.println("����� ���� ��ǻ�ʹ� �� ����� �̰���ϴ�.");
					win++;
				}
			}
			else if(in.equals("2")){
				if(r==Integer.parseInt("1")){
					System.out.println("����� ���� ��ǻ�ʹ� ���� ����� �̰���ϴ�.");
					win++;
				}
					else if(r==Integer.parseInt("2"))
						System.out.println("����� ���� ��ǻ�͵� ���� �����ϴ�.");
					else{
						System.out.println("����� ���� ��ǻ�ʹ� �� ����� �����ϴ�. ");
						lose++;
					}
			}
			else if(in.equals("3")){
				if(r==Integer.parseInt("1")){
					System.out.println("����� �� ��ǻ�ʹ� ���� ����� �����ϴ�.");
					lose++;
				}
					else if(r==Integer.parseInt("2")){
						System.out.println("����� �� ��ǻ�ʹ� ���� ����� �̰���ϴ�.");
					win++;	
					}
					else
						System.out.println("����� �� ��ǻ�͵� �� �����ϴ�.");
				
			}
			else{
				System.out.println("�ٽ��Է��ϼ���.");
				
			}
			/*
			if (r > 0.2) {
				lose++;
				System.out.println("��Ÿ���Ե� ����� �����ϴ�.");
				switch (in) {
				case "1":
					System.out.println("���� �� # ����� ����...������ ����");
					break;

				default:
					break;
				}

			} else if (r <= 0.2 && r >= 0.05) {
				if (Math.random() > 0.25) {
					System.out.println("���ེ�� ����� �����ϴ�.");
				} else {
					System.out.println("�Ǹ��մϴ�.���� �����ƽ��ϴ�.");
					win++;
				}

			}*/
			// ======================================================================
			//System.out.println();
			//String con = console.readLine("������ �����÷��� N (����� enter)?"); // ""
			System.out.println();
		}
		// 3.������
		// ����===============================================================================
		// ������̸����� ���ϸ���
		// ���Ͼƿ�ǲ���, �����;ƿ�ǲ ��ü�ؼ�
		// �о ������� ����� �صθ� ��.

		FileOutputStream fos;
		try {
			fos = new FileOutputStream(new File("c:\\empty", user + ".dat"));

			// ������ üũ�� �ؾ��Ѵ�. 1���ƿ�ǲ��Ʈ�� ����������
			System.out.println("����غ� �Ϸ�.");
			// byte Ȥ�� byte[]��¹ۿ� �ȵ�.
			DataOutputStream dos = new DataOutputStream(fos);// �Ű�������
																// �ƿ�ǲ��Ʈ���䱸(�ƿ�ǲ��Ʈ����
																// ������ ���� �����ϳ���
																// ���Ͼƿ�ǲ��Ʈ��)
			// ���Ͼƿ�ǲ��Ʈ���� �ڱ������� ���������
			// 2���ƿ�ǲ��Ʈ��(���������� �ƴ�)�ϴ� �ٲ۰��̰ɷ�
			// DataOutputStream���� �����ϸ� .�⺻�������� +String�� byte�� �ڵ���ȯ�ؼ� �������

			dos.writeInt(win);
			dos.writeInt(lose);
			//dos.writeInt(win/(win+lose)*100);
			// 39�Է��ϸ� 39�� �ش��ϴ� 4����Ʈ�� �ٲ�����Ѵ�.

			dos.close();// dos�� Ŭ�������൵ fos�� �ڵ����� ������.���ʿ��� �۵��Ǵ� Stream�� close�� ��
			// fos.write(33);
			// �̰ɰ����� ���̺������� ���� ������ ��Ų��.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // int4����Ʈ �⺻���������� ����Ʈ�� �ٲ㼭 ������ش�.//������ �ִ��� ������ Ȯ���Ҽ�����
		System.out.println(user + "���� �����Ͱ� �� ��ϵǾ����ϴ�.");
		/*
		 * #����,����,��#
		 * 
		 * -������ �̿��ؼ� ������� ������ �����ϰ� �����ϰ�, ���α׷��� ������,������� ������ �ִٸ� �����͸� �о, �׻��¿���
		 * �̾��Ҽ� �ֵ��� ����
		 * 
		 * ���̺������� ������� �����Ҳ��ĸ� ��ŷ����.dat cat.dat ���̸����� ������� �̸��� �������ִ��� üũ
		 */

	}

}
