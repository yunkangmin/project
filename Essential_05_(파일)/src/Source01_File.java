
/*
 * File 객체 ? 현재 작동중인 컴퓨터의 파일시스템(파일 혹은 디렉토리)을 제어하기 위한 클래스
 * 파일뿐만 아니라 디렉토리도 관리가 된다.
 * 
 * 
 */
import java.io.*;
import java.util.Date;

public class Source01_File {
	public static void main(String[] args) {
		//File 객체 생성 #
		//String은 풀경로로 String path
		File f1=new File("C:\\Program Files\\Internet Explorer\\F12.dll");//시스템상의 풀 경로 (디렉토리)스트링으로 작성하는법
		File f2=new File("D:\\yunkangmin\\자료\\BingobyYun.jar"); //경로상의 풀경로 (파일)//확장자도 적어줘야한다.
		
		//String parent, String child
		File f3=new File("C:\\","Users");//부모와 이름을 따로 설정해도 됨
		//File parent, String child
		File f4=new File(f1,"JAVA");//
		File f5=new File(f4,"jdk1.8.0_144");//
		File f6=new File(f5,"bin");//
		File f7=new File(f5,"src.zip");//
		
		//방법4가지
		//======================================================
		File[] fs=new File[] {f1,f2,f3,f6,f7};//나중에라도 배열로 만들수도 있다.
		for(int i=0;i<fs.length;i++) {
			File t=fs[i];
			String path=t.getAbsolutePath();//절대경로가 맞다 풀경로
			String name=t.getName();//이름만나옴
			System.out.println("name ? "+name);
			System.out.println("path ? "+path);
			System.out.println("exists ?"+t.exists());//있는지 없는지
			System.out.println("isDirectory ?"+t.isDirectory());
			System.out.println("isFile ?"+t.isFile());
			System.out.println("isHidden ? "+t.isHidden());
			long t1=t.length();//몇바이트짜리 파일인지 크기인데 단위byte 디렉토리인경우 그안에 소속되어 있은 총합
			//소속으로 묶여있는 자식들 수에 따라 따르다 디렉토리는
			System.out.println("length ? "+t1);
			long t2=t.lastModified();
			System.out.println("lastModified ? "+t2+" / "+new Date(t2));//최종수정시간 일정시간을 기준으로 흘러간 시간 currentMillontimes
			System.out.println();
			//말그대로 디렉토리이름과 파일이름만 나온것
		}
		//exists가 false면 모든게 무의미
		//풀로 다잡는다 상위디렉토리와 하위부분따로 만들거나 
	
	}
}
