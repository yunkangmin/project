/*
 * Pattern class / Matcher class를 이용하여
 * 문자열이 어떤 패턴을 띄고 있는지 검사를 할 수 있다.
 * 패턴을 잡을때 사용되는게 정규표현식
 * 
 * Regular Experssion
 * String matches와 비슷
 */
import java.util.regex.*;
public class Source07_RegEx {
	public static void main(String[] args) {
		//Pattern 객체는 직접생성하는게 아니라  compile이란 메소드를 이용해서 생성

		String data="자바는 프로그래밍언어입니다. 매우 훌륭합니다. 또한 편리합니다. 최고의 언어입니다.";

		Pattern p=Pattern.compile("언어입니다.");//여기에는 +를 넣으면 안된다.아무거나 넣으면 안된다.
		//안에 들어가는 문자열이 정규식에 안맞으면 터진다.

		Matcher m=p.matcher(data);//한번만들면 재활용은 없다.다시 쓰려면 다시만들어야한다.
		for(int cnt=1;cnt<=6;cnt++) {
			boolean b=m.find();//맨처음에는 첫번째 두뻔째호출에는 그다음 또호출하면 그다음
			System.out.println(b);
		}
		m.reset();//
		int cnt=0;
		while(m.find()) {
			cnt++;
			String g=m.group();//찾은 부분의 문자열 당연히 complie에 니다를 넣엇으므로 니다가 나온다.
			int s=m.start();//찾은 문자열의 시작idx
			int e=m.end();//끝 idx+1;
			//start <=    <  end
			System.out.println(g+"["+s+"-"+e+"]");
		}
		System.out.println("CNT == "+cnt);
		
	}
}
