import java.io.File;
import java.io.FileOutputStream;

public class Source03_FileIO {

	public static void main(String[] args) {
		//파일에 데이터 출력을 할려면, FileOutputSteam이 사용됨
		try {
			File target=new File("d:\\datas","output");
			FileOutputStream fos=new FileOutputStream(target);
			//출력할수 없을때, Exception이 발생 -파일은 없으면 만들고 있으면 무조건 덮어씌움
			//물어보는게 필요 인풋은 파일이 없으면 터진다.
			//디렉토리는 안된다. 상위가 없을때 이미 디렉토리로 존재할때.
			System.out.println("파일 출력 준비 완료");
		
		
		fos.write(30);//1바이트출력 숫자30을 출력 ->1E
		
		byte[]b=new byte[512];//바이트배열을 주면 그내용을 따다다딱쏜다.물론 안에 0이 다 들어간다.
		fos.write(b);
		fos.write(b,0,40);//배열의 일부분출력
		//입출력이 queue형태 파일수신 파일카피시 바이트단위 전송
		//정512-1024
		
		fos.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
