package game;

import java.util.Scanner;

public class BingoPanTEST {
//BingoPan��ü �ΰ��� ����� Scanner��ü�ϳ� ����� NumberManager(nm)��ü�� �ϳ������
/*while(ture)
 * player�����/com�� ���
 * ����ڷκ��� ���� �Է¹ް�,
 * nm��ü �̿��ؼ� ���� �������� �ƴ��� Ȯ���ϰ�.
 * �ȳ��Դ� ���ڸ�
 * nm���� add��Ű��
 * �ǵ鿡�� marking��Ű��
 * �ǵ鿡�� checkBingo���Ѽ� ���߿� �ϳ��� 5�� break; 
 *
 * player�����/com�� ���
 * nm���� ���� ���ؼ�
 * �ǵ鿡�� marking��Ű��
 * �ǵ鿡�� checking���Ѽ� ���߿� �ϳ��� 5�� break;
 * 
 * Main class�� ����� �۵��ϴ��� Ȯ���ߴٸ�.
 * export Runnabel jar#
 * ������Ʈ��Ŭ��>export>Runnable jar>Lauch Configuetion>����� ����Ŭ������ ����>
 * Export Destination(����ȭ������ �������� )>��������� �����̸�����>�̴ϼ��̳� �̸��� �����ؼ� �����Bingoby�̴ϼ�
 * >������(warning�� �ϳ��� ������ ��� ���)>���� ��ũ�����̽�Ȯ��>finish
 * 
 * #Runnable
 * 
 * ���⼭ ���â ���� java -jar [jar���ϸ�]TabŰ�̿�(������ ��������ش�)
 * ���������� �ø���
 */
	
	public static void main(String[] args) {
		BingoPan player=new BingoPan(true);
		BingoPan com=new BingoPan(false);
		
		/*player.printToConsole();
		
		for(int i=1;i<=10;i++) {
			//com.markingBingo(i);
			player.markingBingo(i);
		}
		player.printToConsole();*/
		
		Scanner cin=new Scanner(System.in);
		
		NumberManager m=new NumberManagerV1();
		for(int cnt=1;cnt<=10;cnt++) {
		int r=m.pick();
		System.out.println(r);
			
		com.markingBingo(r);
		player.markingBingo(r);
		System.out.println("���� �Է��غ�����.");//
		
		int n=cin.nextInt();//������� �Է°��� int�� ��ȯ�ؼ� �߻�
		boolean b=m.contains(n);
		com.markingBingo(n);
		player.markingBingo(n);
		System.out.println(b);
		if(b==false) {//false�϶��� ����ִ´�.
			m.add(n);
		}
		System.out.println(m.toString());
		System.out.println();
		System.out.println("player�� ��: ");
		int c=player.checkBingo();
		System.out.println("com�� ��: ");
		int c1=com.checkBingo();
		System.out.println("player�� ����: ");
		System.out.println(c);
		System.out.println("com�� ����: ");
		System.out.println(c1);
		}
		
		/*
		for(int i=1;i<=20;i++) {
			com.markingBingo(i);
			player.markingBingo(i);
			if(i%10==0)
				player.printToConsole();
		}*/
		
		/*System.out.println("player�� ��: ");
		int c=player.checkBingo();
		System.out.println("com�� ��: ");
		int c1=com.checkBingo();
*/		
		/*System.out.println("player�� ����: ");
		System.out.println(c);
		System.out.println("com�� ����: ");
		System.out.println(c1);*/
		
		//������ ���ڰ� ���̰� ��ǻ�ʹ� ���ڰ� �Ⱥ��̰�

	}

}

