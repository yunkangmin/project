import java.io.*;
public class Source05_DataIO {
public static void main(String[] args)throws IOException {
	//Source04_DataIO에서 출력해두었던 데이터를 복원
	File src=new File("d:\\datas","savedata01.dat");
	FileInputStream fis=new FileInputStream(src);
	System.out.println("읽어낼 파일 존재함.");
	//읽어내는 것은 바이트밖에 없기떄문에 
	DataInputStream dis=new DataInputStream(fis);
	int n=dis.readInt();//4바이트 정수를 만들어낸다.
	System.out.println(n);
	double d=dis.readDouble();
	System.out.println(d);
	String s=dis.readUTF();
	System.out.println(s);
	//dis.readDouble();//남은 것이 1바이트불린인데 8바이트를 읽으니 터진다.
	boolean b=dis.readBoolean();
	System.out.println(b);
	dis.close();
	//쓴순서대로 읽어내면 된다.
	//메타데이터에 기록을 남긴다.
}
}
