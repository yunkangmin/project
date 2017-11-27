package dart;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainSource {
	public static void main(String[] args) {
		Console co=System.console();
		while(true){
			System.out.println("���� |���ʽ�|[�ɼ�] : ");//���� �̷���� ���ڿ� 3��Ʈ

			String data=co.readLine("�м����ڿ��Է�>",null);
			data=data.toUpperCase();
			System.out.println(data);
			int result=0;

			//String data="1S2D*T";
			//"10D10T3S 1S2D*3T 1D2S#10S 1D2S0T 1S*2T*3S 1D#2S*3S 1T2D3D# 1D2S3T*";
			//�̰����� �������
			/*int num1=(int)(Math.random()*11);
 int char1=1+(int)(Math.random()*3);
			 */

			String regex="([0-9][0]?[SDT][\\*\\#]?)([0-9][0]?[SDT][\\*\\#]?)([0-9][0]?[SDT][\\*\\#]?)";
			Pattern p=Pattern.compile(regex);//���⿡�� +�� ������ �ȵȴ�.�ƹ��ų� ������ �ȵȴ�.
			//�ȿ� ���� ���ڿ��� ���ԽĿ� �ȸ����� ������.

			Matcher m=p.matcher(data);//�ѹ������ ��Ȱ���� ����.�ٽ� ������ �ٽø������Ѵ�.
			//for(int cnt=1;cnt<=6;cnt++) {
			boolean b=m.find();//��ó������ ù��° �λ�°ȣ�⿡�� �״��� ��ȣ���ϸ� �״���
			System.out.println(b);
			//}
			if(b==false){
				System.out.println("�ٽ��Է��ϼ���.");
				continue;
			}

			m.reset();//
			int cnt=0;
			while(m.find()) {
				cnt++;
				String g=m.group();//ã�� �κ��� ���ڿ� �翬�� complie�� �ϴٸ� �־����Ƿ� �ϴٰ� ���´�.
				//String g1=m.group(1);
				int s=m.start();//ã�� ���ڿ��� ����idx
				int e=m.end();//�� idx+1;
				//start <=    <  end
				System.out.println(g+"["+s+"-"+e+"]");
			}
			System.out.println("CNT == "+cnt);
			result=scoreCal(data);
			System.out.println("��� : "+result);

		}
	}
	public static int scoreCal(String s){
		int score[]=new int[3];
		int total=0;
		int num=0;
		char[] c=s.toCharArray();
		for(int j=0;j<s.length();j++){
			if((c[j]=='1')&&(c[j+1]=='0')){//����10�̻�
				if(j>1)
					num++;
				score[num]=10;
				j++;
			}else if(c[j]<='9'&&c[j]>='0'){
				if(j>1)
					num++;
				score[num]=c[j]-'0'; 
				j++;
			}
			/*if(c[j]=='S'){
    score[num]=(int)Math.pow(score[num],1);
   }else if(c[j]=='D'){
    score[num]=(int)Math.pow(score[num], 2);
   }else if(c[j]=='T'){
    score[num]=(int)Math.pow(score[num], 3);
   }else if(c[j]=='*'){
    score[num]*=2;
    if(num>0){
     score[num-1]*=2;
    }
   }else if(c[j]=='#'){
    score[num]*=-1;
   }*/
			switch(c[j]){
			case 'S':
				score[num]=(int)Math.pow(score[num],1);
				break;
			case 'D':
				score[num]=(int)Math.pow(score[num],2);
				break;
			case 'T':
				score[num]=(int)Math.pow(score[num],3);
				break;
			case '*':
				score[num]*=2;
				if(num>0){
					score[num-1]*=2;
				}
				break;
			case '#':
				score[num]*=-1;
			}
		}
		for(int x=0;x<3;x++){
			System.out.println(x+"=> "+score[x]);
			total+=score[x];
		}
		return total;
	}
}



