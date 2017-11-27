package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Example01_InputTest {

	public static void main(String[] args) throws InterruptedException {
		JFileChooser f= new JFileChooser();
		f.showOpenDialog(null);
		File t=f.getSelectedFile();
		System.out.println(t.getAbsolutePath());
		//이렇게 해서 선택한 파일에 Input을 연결해서 read작업을 해나가는데,
		//첫 4바이트, 마지막 4바이트 출력
		//8바이트출력
		
		//File target=new File("d:\\datas","setup.exe");
		
		try {
		FileInputStream fis=new FileInputStream(t);
		int cnt=0;
		//특정파일의 바이트를 읽어내느 방법
		//1.available()확인
		//2.read()한값이 -1이 나오기 전까지.
		//3.해당파일의 length()만큼
		while(fis.available()>0) {
			cnt++;
			int b=fis.read();
			if(cnt<=4||fis.available()<=4)
			System.out.println(cnt+" : "+b);
			//이 코드에서 의미있게 봐야 되는건, 배열로 읽어낼때(read),
			//리턴되는 값이 실제 채워준 칸수 라는 것(그 뒤의 칸들은 무의미)
		}
	
	
		fis.close();//close를 꼭 해줘야 한다.파이프제거
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Err! "+e.getMessage());
		}catch(IOException e) {
			System.out.println("입출력작업중 문제!"+e.getMessage());
			
		}
			
	}

}
