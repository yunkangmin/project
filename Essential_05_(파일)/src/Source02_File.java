import java.io.*;
public class Source02_File {
public static void main(String[] args) {
	File base=new File("c:\\Program Files\\Java","jdk1.8.0_144");
	System.out.println(base.exists());
	
	//�θ�
	String parent=base.getParent();//String���� �θ��� absolutePath()
	System.out.println(parent);
	File pfile=base.getParentFile();//�θ� File��ü��
	System.out.println(pfile.getName()+" & "+pfile.getAbsolutePath());
	File pfile2=pfile.getParentFile();
	System.out.println(pfile2.getName());
	System.out.println(pfile2.getAbsolutePath());
	
	File pfile3=pfile2.getParentFile();//���̻�ö󰥰��� ������ NULL
	System.out.println(pfile3.getAbsolutePath());
			
}
}
