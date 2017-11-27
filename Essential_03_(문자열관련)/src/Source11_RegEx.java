import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Source11_RegEx {

	public static void main(String[] args) {
	String data="이전에 몰던 차는 21가1231였고, 새로 산 차는 41오9135였는데, 지금 사고 중이라 몰고 있는";
	data+="임시 차 번호는 79바79125너12312입니다.";
	//사용한것은 버린다 사용이 안된다.
	String regex="(\\d{2})([가-힣])(\\d{4})";

	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(data);
	
	while(m.find()) {
		String g=m.group();
		System.out.println("->"+g);
		
		String s1=m.group(1);
		String s2=m.group(2);
		String s3=m.group(3);
		//m.group(4);
		
		System.out.println(s1+".."+s2+".."+s3);
		String tt=String.format("%s,%s,%s,%s", m.start(),m.start(1),m.start(2),m.start(3));
		System.out.println(tt);
	}
	/*Pattern p=Pattern.compile("\\d{2}[가-힣]\\d{4}");//여기에는 +를 넣으면 안된다.아무거나 넣으면 안된다.
	//안에 들어가는 문자열이 정규식에 안맞으면 터진다.

	Matcher m=p.matcher(data);//한번만들면 재활용은 없다.다시 쓰려면 다시만들어야한다.
	for(int cnt=1;cnt<=6;cnt++) {
		boolean b=m.find();//맨처음에는 첫번째 두뻔째호출에는 그다음 또호출하면 그다음
		System.out.println(b);
	}
	
	m.reset();
	int cnt=0;
	
	while(m.find()) {
		cnt++;
		String g=m.group();//전체 그룹 m.group(0); 같은거임
	    int s=m.start();//찾은 문자열의 시작idx
		int e=m.end();//끝 idx+1;
		String s1=m.group(1);
		String s2=m.group(2);
		String s3=m.group(3);
		System.out.println(s1+" "+s2+" "+s3);
		String tt=String.format("%s,%s,%s,%s", m.start(),m.start(1),m.start(2),m.start(3));
		System.out.println(tt);
		
		//start <=    <  end
		System.out.println(g+"["+s+"-"+e+"]");
		System.out.println(data.substring(s,s+2));
		System.out.println(data.substring(s+2,s+3));
		System.out.println(data.substring(s+3,e));
	}
	System.out.println("CNT == "+cnt);*/
	
	//차량 번호 전체 잡았으면, 그다음..
	//앞에 2개 따로 가운데 문자 따로
	
	// hutblog.tistory.com/entry/02
	//카톡블라인드테스트 2번문제
	//배열을쓰자
	//1라운드 2라운드 3라운드 따로 추출
	//정규식/그룹/Pattern&Matcher/
	//데이터 처리를 위한 int[]
	//반드시 3세트
	//그 프로그램을 실행시켰을때 데이터를 입력받아서 처리하게만 바꿔두시고
	
	}

}
