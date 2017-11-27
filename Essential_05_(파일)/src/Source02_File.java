import java.io.*;
public class Source02_File {
public static void main(String[] args) {
	File base=new File("c:\\Program Files\\Java","jdk1.8.0_144");
	System.out.println(base.exists());
	
	//부모
	String parent=base.getParent();//String으로 부모의 absolutePath()
	System.out.println(parent);
	File pfile=base.getParentFile();//부모를 File객체로
	System.out.println(pfile.getName()+" & "+pfile.getAbsolutePath());
	File pfile2=pfile.getParentFile();
	System.out.println(pfile2.getName());
	System.out.println(pfile2.getAbsolutePath());
	
	File pfile3=pfile2.getParentFile();//더이상올라갈곳이 없으면 NULL
	System.out.println(pfile3.getAbsolutePath());
			
}
}
