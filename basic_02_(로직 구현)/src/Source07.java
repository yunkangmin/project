
public class Source07 {

	public static void main(String[] args) {
		//16진수 0~F를 이용해서 숫자를 표기
		//10진수 10=>A, 11=>B   15=>F
		//
	/*	int n=(int)(Math.random()*45);
		String s=Integer.toString(n,16);//앞에 10진수, 뒤에 변환할 진수
		
		System.out.println(n+"은 16진수 "+s);*/
		
		int target=(int)(Math.random()*256);
		System.out.println(target+"을 16진수로 변환하면");
		String change="";
		String b;
		b=""+'a';//그냥'a'는 캐릭터 형이므로 안된다.문자열에 캐릭터를 더하는 것은 된다.
		System.out.println(b);
		//무조건 두자리로 만들어달라.
		//1.16으로 나눴을때의 몫과 나머지를 구해야함
		//10~15까지는 문자로 바꿔야함
		//String이 아무것도 없다면 문자열을 더할 수 가 없다.
		int n1=target/16;
		int n2=target%16;
		if(n1>9) {
			switch(n1) {
			case 15:
				change+="F";
				break;
			case 14:
				change+="E";
				break;
			case 13:
				change+="D";
				break;
			case 12:
				change+="C";
				break;
			case 11:
				change+="B";
				break;
			case 10:
				change+="A";
			}
		}
		else {
			change+=n1;
		}
		if(n2<10) {
			//change+=n2;
			change+=(char)(n2+48);//'0'이 48이기 때문이다.그러면 문자 '0'이 변수에 저장된다.
			//change+=(char)n2;//인트형 숫자에 맞는 문자를 대입한다.
		}else {
			change+=(char)(n2+55);//65가 A이기 때문이다.
		}
		System.out.println(target+">"+change);
		System.out.println('A'==65);
		System.out.println((char)55204);
		System.out.println((int)'힣');
		System.out.println((int)'0');//'0'-'9' : 48 ~ 57 , 'A':65~90, 'a':97
		//'가':44032 '힣'(char)55204 한글의 가장 마지막 지정되어 있지 않았으므로 ?가 나온다.
	
		//switch case두번 작성
		//234==>EA 15----10
		//0까지 다나온다.
		//toString으로 하면 0이 생략된다.
		//else대신 default로 처리할수도 있다.
		
		
		//문자도 숫자다. 
		/*System.out.println('A'*1);
		System.out.println((int)'A');//65~90까지 알파벳이다.
		System.out.println((char)65);
		System.out.println((char)66);
		System.out.println((char)67);*/
	}

}
