package study;
import java.io.File;
import java.util.Date;

import javax.swing.JFileChooser;
public class Understand01_File {
public static void main(String[] args) {
	JFileChooser jfc=new JFileChooser();
	jfc.showOpenDialog(null);//해당소속지정 일단 null로 콘솔로 띄우는게 아니기때문에
	File file=jfc.getSelectedFile();//선택한것을 파일객체로 만들어줌.
	
	String path=file.getAbsolutePath();
	System.out.println("PATH = "+path);
	//이 파일의 이름 : getName()
	//이 파일의 부모 디렉토리 : lastindexof subString
	//length가 나오는데 파일크기: 두가지 버전으로 출력
	//하나는 그냥 byte로 
	//다른 하나는데이터 크기에 따라서 MB출력 ,KB출력 ,byte출력
	//1024 byte=>1kb , 1024KB => 1MB ,1024MB=>1GB ,1024GB=>1TB , 1024TB=>1PB
	String fn=file.getName();
	System.out.println("NAME = "+fn);
	int idx=path.lastIndexOf(fn);
	String parent=path.substring(0,idx-1);
	System.out.println("PARENT = "+parent);
	long len =file.length();
	if(len<1024){
		System.out.println(len+"byte");
	}else if(len >=1024&&len<1024*1024) {
		System.out.println(len/1024.0+"kbyte");
	}else {
		double size=len/(1024.0*1024);
		String str=Double.toString(size);
		String sstr=str.substring(0,3);
		if(sstr.contains(".")) {
			sstr+=str.charAt(3);
		}
		System.out.println(sstr+"Mbyte");
	}
	
	
	/*String name=file.getName();
	System.out.println("name ? "+name);
	int s=path.lastIndexOf(name);
	String parent=path.substring(0,s);
	System.out.println("parent directoty ? "+parent);
	
	
	long size=file.length();
	if(size>1024) {
		double d=(size/1024.0);
		if(d>=100)
		System.out.println("length ? "+(int)d+"KB");
		
		else if(d>=10) {
			double d1 = ((int)(d*10)/10.0);
		System.out.println("length ? "+d1+"KB");
		}
		else if(d>=0) {
			String s=String.format("%.2d",d);
			System.out.println("length ? "+s+"KB");
		}
		else	
		System.out.println("length ? "+d+"KB");
		
	}else {
	System.out.println("length ? "+size+"byte");
	}*/
	
	
	//정수부분이 3개면 그냥 3자리 정수부분이 2개면 소수점한자리 까지 1개면 소수점2자리
	/*
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
*/	}
	//exists가 false면 모든게 무의미
	//풀로 다잡는다 상위디렉토리와 하위부분따로 만들거나 
}

