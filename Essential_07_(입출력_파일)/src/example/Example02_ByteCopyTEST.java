package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;

/*
 * CMD의 COPY기능 (똑같은 byte로 파일을 하나 만들어내는것)
 * Network파일전송, 파일수신의 원리랑 같음
 *
 * 
 */
public class Example02_ByteCopyTEST {
public static void main(String[] args) {
	try {
		JFileChooser fc=new JFileChooser(new File("c:\\Users"));
		fc.showOpenDialog(null);
		File src=fc.getSelectedFile();
		StringBuilder sb=new StringBuilder(src.getName());//중간에 문자를 넣을때는 스트링빌더를 쓰면된다.
		sb.insert(sb.lastIndexOf("."),"-복사본");
		File dest=new File(src.getParentFile(),"(복)"+src.getName());  //sb.toString()
		//선택한 파일이 있는 디렉토리에다가 (복)원래이름,확장자
		//									혹은 원래이름-복사본.확장자
		FileInputStream fis=new FileInputStream(src);
		FileOutputStream fos=new FileOutputStream(dest);
		//int cnt=0;
		//byte[]b=new byte[512];//바이트배열을 주면 그내용을 따다다딱쏜다.물론 안에 0이 다 들어간다.
		byte[]b=new byte[1024];//버퍼의 기본크기 8키로바이트까지1024*8
		int tot=fis.available();
		int sum=0;
		while(fis.available()>0) {
			int p=fis.read(b);
			sum+=p;
			fos.write(b,0,p);//중복제거
			System.out.println((double)sum/tot*100+"%");//전체중에 읽고 쓴 용량
			/*if(p==1024)
			fos.write(b);
			else
				fos.write(b,0,p);*/
		}
/*		while(fis.available()>0) {
			int b=fis.read();
			fos.write(b);
			
		}
*/		fis.close();
		fos.close();
		System.out.println("byte copy done");
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
