package dart;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainSource {
	public static void main(String[] args) {
		Console co=System.console();
		while(true){
			System.out.println("점수 |보너스|[옵션] : ");//으로 이루어진 문자열 3세트

			String data=co.readLine("분석문자열입력>",null);
			data=data.toUpperCase();
			System.out.println(data);
			int result=0;

			//String data="1S2D*T";
			//"10D10T3S 1S2D*3T 1D2S#10S 1D2S0T 1S*2T*3S 1D#2S*3S 1T2D3D# 1D2S3T*";
			//이걸토대로 점수계산
			/*int num1=(int)(Math.random()*11);
 int char1=1+(int)(Math.random()*3);
			 */

			String regex="([0-9][0]?[SDT][\\*\\#]?)([0-9][0]?[SDT][\\*\\#]?)([0-9][0]?[SDT][\\*\\#]?)";
			Pattern p=Pattern.compile(regex);//여기에는 +를 넣으면 안된다.아무거나 넣으면 안된다.
			//안에 들어가는 문자열이 정규식에 안맞으면 터진다.

			Matcher m=p.matcher(data);//한번만들면 재활용은 없다.다시 쓰려면 다시만들어야한다.
			//for(int cnt=1;cnt<=6;cnt++) {
			boolean b=m.find();//맨처음에는 첫번째 두뻔째호출에는 그다음 또호출하면 그다음
			System.out.println(b);
			//}
			if(b==false){
				System.out.println("다시입력하세요.");
				continue;
			}

			m.reset();//
			int cnt=0;
			while(m.find()) {
				cnt++;
				String g=m.group();//찾은 부분의 문자열 당연히 complie에 니다를 넣엇으므로 니다가 나온다.
				//String g1=m.group(1);
				int s=m.start();//찾은 문자열의 시작idx
				int e=m.end();//끝 idx+1;
				//start <=    <  end
				System.out.println(g+"["+s+"-"+e+"]");
			}
			System.out.println("CNT == "+cnt);
			result=scoreCal(data);
			System.out.println("결과 : "+result);

		}
	}
	public static int scoreCal(String s){
		int score[]=new int[3];
		int total=0;
		int num=0;
		char[] c=s.toCharArray();
		for(int j=0;j<s.length();j++){
			if((c[j]=='1')&&(c[j+1]=='0')){//숫자10이상
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



