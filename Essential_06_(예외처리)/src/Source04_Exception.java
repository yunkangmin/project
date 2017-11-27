/*
 * Throwable
 * 	-Error : try - catch가 필수가 아님
 * 	-Exception : -UnChecked Exception : try - catch가 필수가 아님 논리적으로 피해갈수 있는 코드들이많다.
 * 					(충분히 if같은걸로 걸러낼수있다.)
 * 				 -Checked Exception : try - catch를 해야만 함.
 * 					(코드상에서 어떻게 할 수가 없다.)
 * 
 * 
 */
import java.io.*;
public class Source04_Exception {
public static void main(String[] args) {
	File f=new File("src"); //디렉토리부터 설정안하고 , 이름만 잡으면 프로그램 돌아가는곳을 parent로 사용함.워크스페이스
	System.out.println(f.exists());
	File d=new File(".clsspath");
	File ff=new File(d,"ignore");
	try {
	//ff.createNewFile();//mkdir은 디렉토리로 만들어내는거, createNewFile은 파일로 만듦.
	boolean rst=ff.createNewFile();//시도조차 안될때.project .classpath 파일안에 파일을 못만든다.(불가능한 작업)    //이미있으면 못만든다.
	System.out.println("createNewFile = "+rst);
	}catch(IOException ie){
		System.out.println("..??");
		
	}
	
	//Unhandled exception type IOException
	//numberfor이런애들은 예외처리를 안해도됨.
	
	
}
}
