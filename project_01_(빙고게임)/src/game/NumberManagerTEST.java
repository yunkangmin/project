package game;
import java.util.Scanner;

import javax.swing.JFrame;
public class NumberManagerTEST {
//1-25������ �������� üũ�ϸ� ����.
	public static void main(String[] args) {
		//�Է¹ޱ�
		//JFrame f= new JFrame();
		//f.setLayout(new );
		Scanner cin=new Scanner(System.in);
		
		NumberManager m=new NumberManagerV1();
		for(int cnt=1;cnt<=4;cnt++) {
		int r=m.pick();
		System.out.println(r);
		System.out.println("���� �Է��غ�����.");//
		int n=cin.nextInt();//������� �Է°��� int�� ��ȯ�ؼ� �߻�
		
		boolean b=m.contains(n);
		System.out.println(b);
		if(b==false) {//false�϶��� ����ִ´�.
			m.add(n);
		}
		System.out.println(m.toString());
	}
	}
}
