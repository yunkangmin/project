import java.io.*;

public class Source03_File {

	public static void main(String[] args) {
		File java = new File("C:\\Program Files\\Java\\jdk1.8.0_144");
		File f1 = new File(java, "bin");
		String[] list=java.list();//안의 리스트들이 나온다.여러개여서 배열로나온다. 디렉토리에다한것
		for(int i=0;i<list.length;i++) {
			System.out.println("->"+list[i]);
		}
		File[] cf=java.listFiles();//자식들 하나하나를 다 파일로 만들어준다.
		for(int i=0;i<cf.length;i++) {
			String fn=cf[i].getName();
			String ap=cf[i].getAbsolutePath();
			System.out.println("->"+fn+"("+ap+")");
		}
		//반복문돌면서 파일인지 디렉토리인지 판단할수있다.
		//===============================================================================================

		File f2 = new File(java, "src.zip");
		String[] f2list=f2.list();
		System.out.println(f2list==null);//파일은 자식이없다 그래서 null이 뜬다.
		/*	for(int i=0;i<f2list.length;i++) {
			System.out.println("->"+f2list[i]);
		}*/
		System.out.println(new File("c:\\empty").list().length);
		//Lis<File>해서 파일의 목록을 다뽑을수있다.


	}

}
