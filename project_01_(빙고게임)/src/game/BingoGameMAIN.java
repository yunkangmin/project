package game;

import java.util.Arrays;
import java.util.Scanner;

public class BingoGameMAIN {
/*static void combinePrintTOConsole(BingoPan p1,BingoPan p2) {
	for(int r=0;r<p1.pan.length;r++) {
		String sp1=Arrays.toString(p1.pan[r]);
		String sp2=Arrays.toString(p2.pan[r]);
		System.out.println(sp1+"\t"+sp2);
	}
	System.out.println();
}*/
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		NumberManager nm=new NumberManagerV1();
		BingoPan player=new BingoPan(true);
		BingoPan com=new BingoPan(false);
		
		int turn=0;
		while(true) {
			System.out.println(++turn+"��===========================");
			if(turn==1)
			BingoPan.combinePrintTOConsole(player, com);
			/*System.out.println("�÷��̾��� �� :");
			player.printToConsole();
			System.out.println("��ǻ���� �� : ");
			com.printToConsole();*/
			int num;
			if(turn%2==0) {//¦���϶�
				num=nm.pick();
				com.markingBingo(num);
				player.markingBingo(num);
				BingoPan.combinePrintTOConsole(player, com);
				
			}else {
				System.out.println("üũ�� ����?");
				num=cin.nextInt();
				boolean b=nm.contains(num);
				com.markingBingo(num);
				player.markingBingo(num);
				//System.out.println(b);
				if(b==false) {//false�϶��� ����ִ´�.
					nm.add(num);
				}
			}
			System.out.println("����"+num+"��  ���ʿ� ��ŷ�մϴ�.");
			System.out.println(nm.toString());
			System.out.println();
		
			int c=player.checkBingo();
			int c1=com.checkBingo();
			//BingoPan.combinePrintTOConsole(player, com);
			/*System.out.println("player�� ����: ");
			System.out.println(c);
			System.out.println("com�� ����: ");
			System.out.println(c1);*/
			if(c>=5||c1>=5)
				break;
		}
	}
}

