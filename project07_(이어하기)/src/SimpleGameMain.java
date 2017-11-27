import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SimpleGameMain {

	public static void main(String[] args) {
		Console console=System.console();
		String user;
		int win;
		int lose;
		//1.데이터 로딩====================================================
		user=console.readLine("사용자닉네임?");
		File f= new File("c:\\Users",user+".dat");
		if(f.exists()) {
			try {
				FileInputStream fis=new FileInputStream(f);
				DataInputStream dis=new DataInputStream(fis);
				int cnt=0;
				try {
				//	while(dis.available()>0) {
						//cnt++;
						int w=dis.readInt();
						int l=dis.readInt();
						System.out.println(user+"님의 데이터를 불러들였습니다.");
						//if(cnt<=4||dis.available()<=4)
						//System.out.println(cnt+" : "+b);
						//이 코드에서 의미있게 봐야 되는건, 배열로 읽어낼때(read),
						//리턴되는 값이 실제 채워준 칸수 라는 것(그 뒤의 칸들은 무의미)
					//}
						win=w;
						lose=l;
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			//해당파일에 인풋을 열고 데이터인풋으로 교체해서 데이터를 다다다닥 read
			//win,lose를 설정
		}else {
			win=0;
			lose=0;
			System.out.println(user+"님의 데이터를 초기화하였습니다.");
			
		}
		//2.실제 진행==============================================================
		while(true) {
			System.out.println();
			String in=console.readLine("적과의 조우! 1.가위2.바위3.보 ?");
			double r= Math.random();
			if(r>0.2) {
			
				System.out.println("안타깝게도 당신은 졌습니다.");
				switch (in) {
				case "1":
					System.out.println("전투 상세 # 당신은 가위...상대방은 바위");
					break;

				default:
					break;
				}
				
			}else if(r<=0.2&&r>=0.05){
				if(Math.random()>0.25) {
					System.out.println("다행스레 당신은 비겼습니다.");
				}else {
				System.out.println("훌륭합니다.적을 물리쳤습니다.");	
					win++;
				}
				
			}
			//======================================================================
			String con=console.readLine("모험을 끝내시려면 N (계속은 enter)?"); // ""
			if(con.equals("N")) {
				break;
			}
			
		}
		//3.데이터 저장===============================================================================
		//사용자이름으로 파일만들어서 
		//파일아웃풋잡고, 데이터아웃풋 교체해서 
		//읽어낼 순서대로 출력을 해두면 됨.
		
		
		System.out.println(user+"님의 데이터가 잘 기록되었습니다.");
	/*	#가위,바위,보#

		-파일을 이용해서 사용자의 전적을 저장하고 종료하고,
		프로그램이 켜질때,사용자의 정보가 있다면 데이터를 읽어서,
		그상태에서 이어할수 있도록 진행

		세이브파일은 어떤식으로 관리할꺼냐면
		모킹제이.dat
		cat.dat
		이이름으로 사용자의 이름의 파일이있는지 체크*/

	}

}
