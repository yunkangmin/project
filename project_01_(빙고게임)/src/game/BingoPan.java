package game;

import java.util.Arrays;

public class BingoPan {
	public static void combinePrintTOConsole(BingoPan p1,BingoPan p2) {
		System.out.println("��                                                 "+"��ǻ��");
		for(int r=0;r<p1.pan.length;r++) {
			String sp1=Arrays.toString(p1.pan[r]);
			String sp2=Arrays.toString(p2.pan[r]);
			System.out.println(sp1+"\t"+sp2);
		}
		System.out.println();
	}
	Bingo[][]pan;
	boolean user;
	public BingoPan(boolean user) {
		this.user=user;
		pan =new Bingo[5][5];
		init();
	}
	public BingoPan(int size) {
		pan=new Bingo[size][size];
	}
	private void init() {
		int num=1;
		while(num<=25) {
			/*Bingo=t;
			 * if(user)
			 * t=new Bingo(num);
			 * else
			 * t=new HideBingo(num);
			 */
			Bingo t=new Bingo(num,user);
			int row=(int)(Math.random()*5);
			int col=(int)(Math.random()*5);
			if(this.pan[row][col]!=null)
				continue;
			this.pan[row][col]=t;
				num++;
		}
	}
	//��±��
	public void printToConsole() {
		//��ǻ�� ���ڰ� ���̸� �ȵȴ�.
		
		for(int r=0;r<pan.length;r++) {
			String s=Arrays.toString(pan[r]);
			System.out.println(s);
		}
		System.out.println();
	}
	//�����ϳ��� �Ѱ����� �ش� ���ڸ� ������ �ִ� Bingo��ü�� flag�� ����
	public void markingBingo(int t) {
		// �� ���� ���� ������ �ִ� Bingo�� ã�Ƽ�,�� ĭ�� Bingo��ü�� flag�� true�� ����.
		for(int row=0;row<pan.length;row++) {
			for(int col=0;col<pan[row].length;col++) {
				if(pan[row][col].num==t)
					pan[row][col].flag=true;
			}
		}
	/*find:
		for(int row=0;row<pan.length;row++) {
			for(int col=0;col<pan[row].length;col++) {
				if(pan[row][col].num==t){
					pan[row][col].flag=true;
				break find;
				}
			}
		}*/
		
	}
	public int checkBingo() {
		//������ �ִ� Bingo[][]�迭���� �ϼ��� ���μ��� ����.
		int rr=0;
		int w=0;
		int bingocnt=0;
		for(int row=0;row<pan.length;row++) {
			int rcnt1=0;
			int wcnt2=0;
			for(int col=0;col<pan[row].length;col++) {
				if(pan[row][col].flag==true)
					rcnt1++;
				if(pan[col][row].flag==true)
					wcnt2++;	
			}
			if(rcnt1==5) {
				bingocnt++;
				rr++;
			}
			if(wcnt2==5) {
				bingocnt++;
				w++;
			}
		}
		int c1=0;
		int c2=0;
		int rc1=0;
		int wc1=0;
		for(int row=0;row<pan.length;row++) {
			if(pan[row][row].flag==true)
				c1++;
			if(pan[row][4-row].flag==true)
				c2++;	
		}
		if(c1==5) {
			bingocnt++;
			rc1++;
		}
		if(c2==5) {
			bingocnt++;
			wc1++;
		}
		//printToConsole();
	
		return bingocnt;
	}
}
