package game;
import java.util.Scanner;

import javax.swing.JFrame;
public class NumberManagerTEST {
//1-25까지의 숫자인지 체크하면 좋다.
	public static void main(String[] args) {
		//입력받기
		//JFrame f= new JFrame();
		//f.setLayout(new );
		Scanner cin=new Scanner(System.in);
		
		NumberManager m=new NumberManagerV1();
		for(int cnt=1;cnt<=4;cnt++) {
		int r=m.pick();
		System.out.println(r);
		System.out.println("숫자 입력해보세요.");//
		int n=cin.nextInt();//사용자의 입력값을 int로 변환해서 발생
		
		boolean b=m.contains(n);
		System.out.println(b);
		if(b==false) {//false일때만 집어넣는다.
			m.add(n);
		}
		System.out.println(m.toString());
	}
	}
}
