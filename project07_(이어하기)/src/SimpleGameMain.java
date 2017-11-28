import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleGameMain {

	public static void main(String[] args) {
		Console console = System.console();
		String user;
		int win = 0;
		int lose = 0;
		// 1.데이터 로딩====================================================
		user = console.readLine("사용자닉네임?");
		File f = new File("c:\\empty", user + ".dat");
		if (f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);
				int cnt = 0;
				try {
					// while(dis.available()>0) {
					// cnt++;
					int w = dis.readInt();
					int l = dis.readInt();
					System.out.println();
					System.out.println(user + "님의 데이터를 불러들였습니다.");
					// if(cnt<=4||dis.available()<=4)
					// System.out.println(cnt+" : "+b);
					// 이 코드에서 의미있게 봐야 되는건, 배열로 읽어낼때(read),
					// 리턴되는 값이 실제 채워준 칸수 라는 것(그 뒤의 칸들은 무의미)
					// }
					win = w;
					lose = l;
					//System.out.println("당신의 전적 => 이긴횟수 : "+win+" 진횟수: "+lose);
				} catch (IOException e) {

					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

			// 해당파일에 인풋을 열고 데이터인풋으로 교체해서 데이터를 다다다닥 read
			// win,lose를 설정
		} else {
			win = 0;
			lose = 0;
			System.out.println(user + "님의 데이터를 초기화하였습니다.");

		}
		// 2.실제 진행==============================================================
		System.out.println("게임을 끝내고 싶으시면  'n'을 누르세요.");
		while (true) {
			System.out.println("===================================================");
			System.out.println("지금까지의 전적 => 이긴횟수 : "+win+" 진횟수: "+lose);
			String in = console.readLine("적과의 조우! 1.가위2.바위3.보 ?   ");
			//System.out.println();
			//System.out.println();
			if (in.equalsIgnoreCase("n")) {
				break;
			}
			try {
				Thread.sleep(700);
				System.out.println("\t대");
				Thread.sleep(700);
				System.out.println("\t전");
				Thread.sleep(700);
				System.out.println("\t중");
				System.out.println();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int r = 1+(int)(Math.random()*3);
			if(in.equals("1")){
				if(r==Integer.parseInt("1"))
				System.out.println("당신은 가위 컴퓨터도 가위 비겼습니다.");
				else if(r==Integer.parseInt("2")){
					System.out.println("당신은 가위 컴퓨터는 바위 당신은 졌습니다.");
					lose++;
					
				}
				else{
				
					System.out.println("당신은 가위 컴퓨터는 보 당신이 이겼습니다.");
					win++;
				}
			}
			else if(in.equals("2")){
				if(r==Integer.parseInt("1")){
					System.out.println("당신은 바위 컴퓨터는 가위 당신이 이겼습니다.");
					win++;
				}
					else if(r==Integer.parseInt("2"))
						System.out.println("당신은 바위 컴퓨터도 바위 비겼습니다.");
					else{
						System.out.println("당신은 바위 컴퓨터는 보 당신이 졌습니다. ");
						lose++;
					}
			}
			else if(in.equals("3")){
				if(r==Integer.parseInt("1")){
					System.out.println("당신은 보 컴퓨터는 가위 당신은 졌습니다.");
					lose++;
				}
					else if(r==Integer.parseInt("2")){
						System.out.println("당신은 보 컴퓨터는 바위 당신이 이겼습니다.");
					win++;	
					}
					else
						System.out.println("당신은 보 컴퓨터도 보 비겼습니다.");
				
			}
			else{
				System.out.println("다시입력하세요.");
				
			}
			/*
			if (r > 0.2) {
				lose++;
				System.out.println("안타깝게도 당신은 졌습니다.");
				switch (in) {
				case "1":
					System.out.println("전투 상세 # 당신은 가위...상대방은 바위");
					break;

				default:
					break;
				}

			} else if (r <= 0.2 && r >= 0.05) {
				if (Math.random() > 0.25) {
					System.out.println("다행스레 당신은 비겼습니다.");
				} else {
					System.out.println("훌륭합니다.적을 물리쳤습니다.");
					win++;
				}

			}*/
			// ======================================================================
			//System.out.println();
			//String con = console.readLine("모험을 끝내시려면 N (계속은 enter)?"); // ""
			System.out.println();
		}
		// 3.데이터
		// 저장===============================================================================
		// 사용자이름으로 파일만들어서
		// 파일아웃풋잡고, 데이터아웃풋 교체해서
		// 읽어낼 순서대로 출력을 해두면 됨.

		FileOutputStream fos;
		try {
			fos = new FileOutputStream(new File("c:\\empty", user + ".dat"));

			// 원래는 체크를 해야한다. 1차아웃풋스트림 직접적연결
			System.out.println("출력준비 완료.");
			// byte 혹은 byte[]출력밖에 안됨.
			DataOutputStream dos = new DataOutputStream(fos);// 매개변수로
																// 아웃풋스트림요구(아웃풋스트림의
																// 종류는 많다 그중하나가
																// 파일아웃풋스트림)
			// 파일아웃풋스트림은 자기파일을 대상으로함
			// 2차아웃풋스트림(직접연결은 아님)일단 바꾼것이걸로
			// DataOutputStream으로 변경하면 .기본형데이터 +String을 byte로 자동변환해서 출력해줌

			dos.writeInt(win);
			dos.writeInt(lose);
			//dos.writeInt(win/(win+lose)*100);
			// 39입력하면 39에 해당하는 4바이트로 바꿔줘야한다.

			dos.close();// dos만 클로즈해줘도 fos가 자동으로 닫힌다.안쪽에서 작동되는 Stream은 close가 됨
			// fos.write(33);
			// 이걸가지고 세이브파일을 만들어서 복원을 시킨다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // int4바이트 기본데이터형을 바이트로 바꿔서 출력해준다.//파일이 있는지 없는지 확인할수없다
		System.out.println(user + "님의 데이터가 잘 기록되었습니다.");
		/*
		 * #가위,바위,보#
		 * 
		 * -파일을 이용해서 사용자의 전적을 저장하고 종료하고, 프로그램이 켜질때,사용자의 정보가 있다면 데이터를 읽어서, 그상태에서
		 * 이어할수 있도록 진행
		 * 
		 * 세이브파일은 어떤식으로 관리할꺼냐면 모킹제이.dat cat.dat 이이름으로 사용자의 이름의 파일이있는지 체크
		 */

	}

}
