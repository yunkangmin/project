/*
 * 컬렉션을 이용하나 데이터 관리프로그램을 만들어보았음.
 * 근데, 현재 상태로는 아직 미완성임(문제점이 존재함)
 * 
 * 데이터를 100개 넣었다고 가정해봅시다.
 * 프로그램 종료되면..?다 날라감.
 * 
 * 이걸 유지하기 위한 방법으로는 파일로 관리 or 데이터베이스 연동.2가지 방식
 * 파일로 관리 : 게임 진척도 끄면  그 상태로 다시 시작됨->파일관리
 * 
 * 파일에다가 데이터를 내보내고, 파일에 저장시켜둔 데이터를 읽어내는 작업을 해보자.
 * 
 * 기본작업은 파일로 관리 세이브파일 로드파일
 * 
 * 데이터베이스는 기수가 끝나면 서버가 끝나서 프로젝트를 쓸수없다.
 * 
 * 입력?-데이터를 받아들이는 작업 Input
 * 출력?-데이터를 내보내는 작업 Output
 * 
 * 입출력의 기준점은 프로그램(어플리케이션)
 * 		-세이브파일:-출력작업
 * 		-로드파일:-입력작업
 * 
 */
import java.io.*;
public class Source01_FileIO {
	public static void main(String[] args) throws InterruptedException {
		//기존에 존재하고 있는 파일로부터 데이터를 읽어내기 위해선
		//이런 코드가 등장해야되는데,
	/*	File f=new File("??");//1.파일객체다루기 2.exception
		FileInputStream fis=new FileInputStream(f); *///파일 객체를 좀 살펴봐야 하고, Exception Handing을 알아야만 할수 있다.
		//연락처 프로그램에서 저장되어 있는 데이터가 있다면 파일에서 읽어오도록할것임.
		//익셉션처리를 하지 않으면 사용하지 못하는 객체나 메소드가 있다.
		//=============================================================================================================
		//파일을 대상으로 데이터를 입출력을 하기 위해선
		//File 객체와 Exception Handling (Checked Exception 처리해야 되니까)
		//데이터를 읽어내는 작업을 해보자.
		//데이터를 읽어내고자할때는,File객체로 타겟을 설정
		//d:같은 곳에 임의 폴더를 만드셔서 거기에 샘플 파일을 몇개 준비;
		
		File target=new File("d:\\datas","setup.exe"); //디렉토리말고 파일만 읽을수 있다.
		//파일이 없으면 에러가 난다.
		//굳이 안잡아도 되는 익셉션들은 if로 막을수 있다.
		try {
			FileInputStream fis=new FileInputStream(target);//파일에서 데이터를 읽어낼때 사용되는 입력용 객체
			//생성되는데 성공하면 입력을 받을수 있다.
			///타겟이 없거나 일기 불가능한 경우 FileNotFoundException
			System.out.println("File에서 읽어낼수 있음.");
			
			for(int cnt=0;cnt<=310138;cnt++) {//읽어낼수 있는 available이 줄어든다.
			int a=fis.available();//IOException 입출력과정 중의 에러
			//파일크기 byte크기
			System.out.println("읽어낼수 있는 량 : "+a);
			int b=fis.read();//데이터를 읽어내는 작업 =더 이상 읽어낼 내용이 없다면 -1이 나옴
			System.out.println("b..?"+b+" / "+Integer.toString(b,16).toUpperCase()); //의미하는 값...?
			//1바이트씩 읽어낸다.
			}
			//자신이 확인하고 싶은 파일크기 보다 크게 잡는다
			//read()작업을 종료하면 
			Thread.sleep(10000);
			fis.close();//close를 꼭 해줘야 한다.아니면 계속파일을 점유한다.
			
		} catch (FileNotFoundException e) {
			System.out.println("Err! "+e.getMessage());
		}catch(IOException e) {
			System.out.println("입출력작업중 문제!"+e.getMessage());
			
		}
		
		
	}
}
