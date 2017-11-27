package dart;

import java.io.Console;
import java.util.Arrays;
import java.util.regex.*;

public class Main {

	public static void main(String[]args) {
		Console co = System.console();
		//String data = co.readLine("�м����ڿ� �Է� : ", null);

		String data = "10D10T3S**";
		int[] score= new int[3];
		String r = "(\\d{1,2})([SDT])([\\*#]?)";

		Pattern p = Pattern.compile(r);
		Matcher m = p.matcher(data);

		for (int i = 0; i < 3; i++) {
			if(m.find()!=true) {
				System.out.println("�߸����Է��Դϴ�.");
				break;
			}
			
			System.out.println(m.group());
			String s=m.group(1);//����
			score[i]=1;
			int n=Integer.parseInt(s);
			switch(m.group(2)) {
			case "T":
				score[i]*=n;
			case "D":
				score[i]*=n;
			case "S": //switch ����
				score[i]*=n;
			}
			//=====================================
			if(m.group(3)==null)//?ó���ص� �׷������ null
				continue;//null�� ��� switch
			switch(m.group(3)) {
			case "#":
				score[i]*=-1;
			case "*":
				score[i]*=2;
				if(i-1>=0&&i-1<3) {
					score[i-1]*=2;
				}
			}
		}
		System.out.println(Arrays.toString(score));
		int sum=score[0]+score[1]+score[2];
		System.out.println(sum);
	}
}
