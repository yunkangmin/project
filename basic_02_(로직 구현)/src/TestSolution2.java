
public class TestSolution2 {

	public static void main(String[] args) {
		// 1970 01.01은 목요일이다

		int year = 2014;
		int month = 4;  
		int day = 5;
		// 무슨요일인가?
		// 몇일째 되는 날이고 무슨요일인가? :1970.01.02가 +1일째 되는날
		/*	int tot = 49879;
		System.out.println(tot);
		System.out.println();
		System.out.println("48,879");
		System.out.println(tot / 1000 + " , " + tot % 1000);*/
		// 년도까지 큰 아웃
		// 윤년인지 안니지 계산해서 365
		// 해당연도이다1월부터 month까지 돌려서 if 1월달이면 얼마를 더하고 최종계산
		
		int tot=0;
		for(int y=1970;y<year;y++) {
			if((y%100!=0&&y%4==0)||y%400==0)
			{
				tot+=366;
			}else {
				tot+=365;
			}
		}
		for(int m=1;m<month;m++) {
			if(m==2) {
				if((year%100!=0&&year%4==0)||year%400==0)
				{
					tot+=29;
				}else {
					tot+=28;
				}
			}else if(m==4||m==6||m==9||m==11){
				tot+=30;
			}else {
				tot+=31;
			}
		}
		tot+=(day-1);//시작일이 0이므로 1을 뺀다.
		System.out.println(tot+"일째..");
		System.out.println(tot / 1000 + "," + tot % 1000);
		int w=tot%7;
		switch(w) {
		case 0:System.out.println("목");break;
		case 1:System.out.println("금");break;
		case 2:System.out.println("토");break;
		case 3:System.out.println("일");break;
		case 4:System.out.println("월");break;
		case 5:System.out.println("화");break;
		case 6:System.out.println("수");break;
		}
	}
	//네이버계산기로 확인하기 D-DAY계산기
	//다른 방법 카운팅하기
}


