import java.io.*;

public class Source03_File {

	public static void main(String[] args) {
		File java = new File("C:\\Program Files\\Java\\jdk1.8.0_144");
		File f1 = new File(java, "bin");
		String[] list=java.list();//���� ����Ʈ���� ���´�.���������� �迭�γ��´�. ���丮�����Ѱ�
		for(int i=0;i<list.length;i++) {
			System.out.println("->"+list[i]);
		}
		File[] cf=java.listFiles();//�ڽĵ� �ϳ��ϳ��� �� ���Ϸ� ������ش�.
		for(int i=0;i<cf.length;i++) {
			String fn=cf[i].getName();
			String ap=cf[i].getAbsolutePath();
			System.out.println("->"+fn+"("+ap+")");
		}
		//�ݺ������鼭 �������� ���丮���� �Ǵ��Ҽ��ִ�.
		//===============================================================================================

		File f2 = new File(java, "src.zip");
		String[] f2list=f2.list();
		System.out.println(f2list==null);//������ �ڽ��̾��� �׷��� null�� ���.
		/*	for(int i=0;i<f2list.length;i++) {
			System.out.println("->"+f2list[i]);
		}*/
		System.out.println(new File("c:\\empty").list().length);
		//Lis<File>�ؼ� ������ ����� �ٻ������ִ�.


	}

}
