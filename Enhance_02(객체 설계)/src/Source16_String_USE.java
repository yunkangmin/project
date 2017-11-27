
public class Source16_String_USE {

	public static void main(String[] args) {
		//String이 가지고 있는 메소드를 알아둘 필요가 있다.
		String data="인트 더블 인트 자바 스트링 인트 블린 더블 플롯";

		String find="인트";

		int idx=data.indexOf(find);//매개변수로 넘긴 문자열의 위치를 찾아준다 
		//최초로 찾은 인덱스
		//못찾으면 -1이 나온다.
		System.out.println(idx);
		//index는 오버로딩이 되어있음
		int idxx=data.indexOf(find,0);//1번부터 찾는다 1번은 무니까 아랑 달라서 
		//그다음 이랑 맞는 인덱스를 찾는다.//메소드 돌려치기할수도 있다.
		System.out.println(idxx);

		/*int num=0;
		int search=0;
		int num1=0;
		while(true) {
			search=data.indexOf(find,num);
			if(search==-1)
			break;
			num=search+1;
			++num1;
		}
		System.out.println(--num1);*/
		int cnt=0;
		int srch=0;
		while(true) {
			int f=data.indexOf(find, srch);
			if(f==-1) 
				break;
			srch=f+1;
			cnt++;
		}
		System.out.println(cnt);
	}
}
