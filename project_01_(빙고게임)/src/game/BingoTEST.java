package game;

import java.util.Arrays;

public class BingoTEST {
	public static void main(String[] args) {
		Bingo[][]a=new Bingo[5][5];
		Bingo[][]b=new Bingo[5][];
		Bingo[]c=new Bingo[5];
		Bingo[]d=null;

		Bingo[][]pan=new Bingo[5][5];
		//5X5�� �غ�� 25ĭ�� ���� 2�� �迭��
		//1~25���� ���� ��ü ����, �����ϰ� �ѷ��޶�

		for(int r=0;r<pan.length;r++) {
			String s=Arrays.toString(pan[r]);
			System.out.println(s);
		}
		/**/int num=1;
		while(num<=25) {
			int row=(int)(Math.random()*pan.length);
			int col=(int)(Math.random()*pan[row].length);
			if(pan[row][col]!=null)
				continue;
			//pan[row][col]=new Bingo(num++);

		}
		/*for(int r=0;r<pan.length;r++) {
			String s=Arrays.toString(pan[r]);
			System.out.println(s+"\n");
		}*/
		//pan[2][3].flag=true;
		/*for(int idx=0;idx<25;idx++) {
			int num= 1+(int)(Math.random()*25);
			if(pan[idx/5][idx%5]!=null) {
				idx--;
				continue;
			}
			pan[idx/5][idx%5]=new Bingo(num);
		}//���� ���ڰ� �������ִ�.
		for(int r=0;r<pan.length;r++) {
			String s=Arrays.toString(pan[r]);
			System.out.println(s);
		}*/
		//1-->15���� ���� �ִ� ��ü�� flag�� true�� �ٲٽð�
		//���� �ϼ��� ���μ�

		for(int row=0;row<pan.length;row++) {
			for(int col=0;col<pan[row].length;col++) {
				if(pan[row][col].num<=20)
					pan[row][col].flag=true;
			}
		}
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
		for(int r=0;r<pan.length;r++) {
			String s=Arrays.toString(pan[r]);
			System.out.println(s);
		}
		System.out.println("���� ����: "+bingocnt);
		System.out.println("������ ���� ���� : "+rr);
		System.out.println("������ ���� ���� : "+w);
		System.out.println("���� �밢�� ���� ���� : "+rc1);
		System.out.println("���� �밢�� ���� ���� : "+wc1);
	/*	int cnt=0;
		row:
			for(int r=0;r<pan.length;r++) {
				for(int cn=0;cn<pan[r].length;cn++) {
					if(pan[r][cn].flag!=true)
						continue row;
				}
				cnt++;
			}
		System.out.println(cnt);
	/*	int cnt=0;
			for(int r=0;r<pan.length;r++) {
			int chk=0;
				for(int cn=0;cn<pan[r].length;cn++) {
					if(pan[r][cn].flag)
						chk++;
				}
				if(chk==5)
				cnt++;
			}
		System.out.println(cnt);
	/*	int cnt=0;
			for(int r=0;r<pan.length;r++) {
			int chk=0;
				for(int cn=0;cn<pan[r].length;cn++) {
					if(pan[cn][r].flag)
						chk++;
				}
				if(chk==5)
				cnt++;
			}
		System.out.println(cnt);
	/*	int cross1=0;
	  int cnt=0;
			for(int idx=0;idx<pan.length;idx++) {
				if(pan[idx][idx].flag){
					cross1++;
					}
				if(pan[idx][4-idx].flag){
					cross2++;
					}
			}
			if(cross1==5)
			cnt++;
			if(cross2==5
			cnt++;
		System.out.println(cnt);
	*/}
}



