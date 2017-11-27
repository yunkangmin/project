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
			System.out.println(++turn+"턴===========================");
			if(turn==1)
			BingoPan.combinePrintTOConsole(player, com);
			/*System.out.println("플레이어의 판 :");
			player.printToConsole();
			System.out.println("컴퓨터의 판 : ");
			com.printToConsole();*/
			int num;
			if(turn%2==0) {//짝수일때
				num=nm.pick();
				com.markingBingo(num);
				player.markingBingo(num);
				BingoPan.combinePrintTOConsole(player, com);
				
			}else {
				System.out.println("체크할 숫자?");
				num=cin.nextInt();
				boolean b=nm.contains(num);
				com.markingBingo(num);
				player.markingBingo(num);
				//System.out.println(b);
				if(b==false) {//false일때만 집어넣는다.
					nm.add(num);
				}
			}
			System.out.println("숫자"+num+"을  양쪽에 마킹합니다.");
			System.out.println(nm.toString());
			System.out.println();
		
			int c=player.checkBingo();
			int c1=com.checkBingo();
			//BingoPan.combinePrintTOConsole(player, com);
			/*System.out.println("player의 빙고: ");
			System.out.println(c);
			System.out.println("com의 빙고: ");
			System.out.println(c1);*/
			if(c>=5||c1>=5)
				break;
		}
	}
}

