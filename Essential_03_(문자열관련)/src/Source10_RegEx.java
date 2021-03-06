
public class Source10_RegEx {

	public static void main(String[] args) {
		// \\w :a-zA-Z0-9_
		//Quantifiers(수량한정)
		
		//x?,x??,x?+ 다같은 의미 있거나 없거나 0 or 1
		 
		boolean b="9s".matches("\\d[a-z]?"); //"9","9s" ?바로앞에것을 의미 s가 있거나 없거나
		System.out.println(b);
		
		//x*, x*?,x*+ : zero or more 없을수도 있고 있을수도있는데 여러개가 있을수도 있다.
		
		boolean b2="a12323".matches("[aA]*\\d*");//숫자가 없거나 여러개거나 0이상
		System.out.println(b2);//해당 문자열이 정규식에 매치가 되느냐 안되느냐
		
		//x+,x+?,x++ : 1이상 반드시 1번  이상은 있어야 한다.
		boolean b3="10".matches("\\d*[a-z]+");
		System.out.println(b3);
		
		//x{n} ,x{n}? ,x{n}+ :exactly n times
		
		boolean b4="21허7945".matches("\\d{2}[가-힣]\\d{4}");
		//수량제한 반드시 2개가 있어야 한다. 반드시 4개가 있어야 한다.
		System.out.println(b4);
		
		//어떠한 언어든지 정규식은 지원한다.약간씩 쓰는게 다르다.
		//주민등록번호체크
		//x{n,} ,x{n,}?,x{n,}+ :at least n times 최소한 몇번이상
		//x{n,m}, x{n,m},x{n,m}+ :at least n but more than m 최소 n이상m이하
		String r="01[016789]-\\d{3,4}-\\d{4}";//핸드폰 번호
		boolean b5="010-2114-8225".matches(r);
		System.out.println(b5);
		
		boolean b6="[abc]".matches("\\[\\w+\\]");
		System.out.println(b6);//문자에 [있는지 알고싶다면 \\[ \\을 앞에 붙여야한다.
		//이미 의미 있는 문자(.,*,?,+를 찾으려면 \\설정)
		
		//그룹 
		boolean b7="aa3bb2et1ze5".matches("([a-z]{2}\\d)+");//()로 묶게 되면 그룹이란 소리다.
		//특정패턴이 몇번등장해야된다...전체설정
		System.out.println(b7);
	
		
		
		//그룹처리

	}

}
