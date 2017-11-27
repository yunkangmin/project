import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Source08_RegEx {
	public static void main(String[] args) {
		String data="3S-93J43.l3l3kD7T4-Z";//샘플데이터
		
		String regex="3.";//컴파일할 문자열.
		

		Pattern p=Pattern.compile(regex);//여기에는 +를 넣으면 안된다.아무거나 넣으면 안된다.
		//안에 들어가는 문자열이 정규식에 안맞으면 터진다.

		Matcher m=p.matcher(data);//한번만들면 재활용은 없다.다시 쓰려면 다시만들어야한다.
		for(int cnt=1;cnt<=6;cnt++) {
			boolean b=m.find();//맨처음에는 첫번째 두뻔째호출에는 그다음 또호출하면 그다음
			System.out.println(b);
			//m.start();//true가 나와야 쓸수있다.
		}
		m.reset();//
		int cnt=0;
		//m.group();//find()를 하지않고 사용해서 에러
		while(m.find()) {
			cnt++;
			String g=m.group();//찾은 부분의 문자열 당연히 complie에 니다를 넣엇으므로 찾은니다가 나온다.
			int s=m.start();//찾은 문자열의 시작idx
			int e=m.end();//끝 idx+1;
			//start <=    <  end
			System.out.println(g+"["+s+"-"+e+"]");
		}
		System.out.println("CNT == "+cnt);
		//regex에서 .이 의미하는게, any character를 의미하는 메타캐릭터(특수문자)
		//.은 아무문자를 의미
		//카카오톡 블라인드테스트
		//매칭을 하고 제어하는방법
		//매칭하는 방법
	}
}
