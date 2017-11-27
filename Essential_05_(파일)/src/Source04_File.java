import java.io.*;
public class Source04_File {
	public static void main(String[] args) {
		//제어 
		//디렉토리로 생성
		File target =new File("d:\\","temp");//부모디렉터리에 temp디렉토리 생성 부모디렉터리가 없으면 false
		boolean b=target.mkdir();//디렉토리로 생성함.temp디렉토리생성
		System.out.println(b);//이미 있거나 ,파일안에 디렉터리를 생성하거나, 부모디렉터리가 없다면 false
		
		//이름변경
		File m=new File("d:\\","temp2");//파일이나 디렉토리를 바꿀수 있다.
		boolean bb=target.renameTo(m);//원본대상이 없거나 ,바꾸고자 하는 이름이 있거나 이름만 바뀌기 때문에 그하위에 있는 것들은 그래도 있다.
		System.out.println("rename ? "+bb);
		
		//삭제 
		boolean bbb=m.delete();//타겟이 없거나 , 디렉터리인 경우, 소속된 애들이 있다면 false
		System.out.println(bbb);
		
		File t=new File("c:\\Windows");//말단파일만 지울수 있다.
		System.out.println(t+"is exist "+t.exists());
		System.out.println(t+"is directory "+t.isDirectory());
		boolean f=t.delete();
		System.out.println(f);//하위것이 있으면 안지워진다.
		
		
	}
}
