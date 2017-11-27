package example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example03_EmailRegex {

	public static void main(String[] args) {
		String regex="^[_0-9a-zA-Z-]+@[0-9a-zA-Z-]+(.[_0-9a-zA-Z-]+)*$";
		//  "\\w{1,}@[\\w&&[^_]]{1,}(\\,\\w+)+";
		String[] sample=new String[] {
				"hyoungho@kgitbank.co.kr","shizo@naver.com","sa@.co.kr","@daum.net","saan@oracle"
		};
		
				
				
		System.out.println("Email - validation");
		for(int i=0;i<sample.length;i++) {
			System.out.println();
			System.out.print(sample[i]+">>>");
			System.out.println(sample[i].matches(regex));
		}

		Pattern p=Pattern.compile(regex);//여기에는 +를 넣으면 안된다.아무거나 넣으면 안된다.
		//안에 들어가는 문자열이 정규식에 안맞으면 터진다.
		System.out.println();
		
		for(int cnt=0;cnt<sample.length;cnt++) {
			Matcher m=p.matcher(sample[cnt]);//한번만들면 재활용은 없다.다시 쓰려면 다시만들어야한다.
			while(m.find()) {
				String g=m.group();
				int s=m.start();
				int e=m.end();
				System.out.println(g+"["+s+"-"+e+"]");
				
			}
			
			boolean b=m.find();//맨처음에는 첫번째 두뻔째호출에는 그다음 또호출하면 그다음
			System.out.println(b);
		/*	String g=m.group();
			int s=m.start();
			int e=m.end();
			System.out.println(g+"["+s+"-"+e+"]");*/
			
		}
		
	
		
		
		//특정문자구성에서 수량제한을 건뒤..pattern match시키면
		
		//"10a!dsa50aa4"   ..\\d\\w+ 로 find시키면...어디까지가 그룹인지
		//어디서 끊기는지 확인

		


	

	}

}
