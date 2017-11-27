package game;

import java.util.Scanner;

public class BingoPanTEST {
//BingoPan객체 두개를 만들고 Scanner객체하나 만들고 NumberManager(nm)객체도 하나만들고
/*while(ture)
 * player판출력/com판 출력
 * 사용자로부터 숫자 입력받고,
 * nm객체 이용해서 나온 숫자인지 아닌지 확인하고.
 * 안나왔던 숫자면
 * nm에게 add시키고
 * 판들에게 marking시키고
 * 판들에게 checkBingo시켜서 둘중에 하나라도 5면 break; 
 *
 * player판출력/com판 출력
 * nm에서 랜덤 픽해서
 * 판들에게 marking시키고
 * 판들에게 checking시켜서 둘중에 하나라도 5면 break;
 * 
 * Main class가 제대로 작동하는지 확인했다면.
 * export Runnabel jar#
 * 프로젝트우클릭>export>Runnable jar>Lauch Configuetion>빙고용 메인클래스를 선택>
 * Export Destination(바탕화면으로 내보내기 )>저장경로잡고 파일이름선택>이니셜이나 이름을 포함해서 만들기Bingoby이니셜
 * >경고가뜬다(warning이 하나라도 있으면 경고가 뜬다)>나의 워크스페이스확인>finish
 * 
 * #Runnable
 * 
 * 여기서 명령창 열기 java -jar [jar파일명]Tab키이용(메인을 실행시켜준다)
 * 공유폴더에 올리기
 */
	
	public static void main(String[] args) {
		BingoPan player=new BingoPan(true);
		BingoPan com=new BingoPan(false);
		
		/*player.printToConsole();
		
		for(int i=1;i<=10;i++) {
			//com.markingBingo(i);
			player.markingBingo(i);
		}
		player.printToConsole();*/
		
		Scanner cin=new Scanner(System.in);
		
		NumberManager m=new NumberManagerV1();
		for(int cnt=1;cnt<=10;cnt++) {
		int r=m.pick();
		System.out.println(r);
			
		com.markingBingo(r);
		player.markingBingo(r);
		System.out.println("숫자 입력해보세요.");//
		
		int n=cin.nextInt();//사용자의 입력값을 int로 변환해서 발생
		boolean b=m.contains(n);
		com.markingBingo(n);
		player.markingBingo(n);
		System.out.println(b);
		if(b==false) {//false일때만 집어넣는다.
			m.add(n);
		}
		System.out.println(m.toString());
		System.out.println();
		System.out.println("player의 판: ");
		int c=player.checkBingo();
		System.out.println("com의 판: ");
		int c1=com.checkBingo();
		System.out.println("player의 빙고: ");
		System.out.println(c);
		System.out.println("com의 빙고: ");
		System.out.println(c1);
		}
		
		/*
		for(int i=1;i<=20;i++) {
			com.markingBingo(i);
			player.markingBingo(i);
			if(i%10==0)
				player.printToConsole();
		}*/
		
		/*System.out.println("player의 판: ");
		int c=player.checkBingo();
		System.out.println("com의 판: ");
		int c1=com.checkBingo();
*/		
		/*System.out.println("player의 빙고: ");
		System.out.println(c);
		System.out.println("com의 빙고: ");
		System.out.println(c1);*/
		
		//내꺼는 숫자가 보이고 컴퓨터는 숫자가 안보이게

	}

}

