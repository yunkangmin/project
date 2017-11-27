
/*
 * File ��ü ? ���� �۵����� ��ǻ���� ���Ͻý���(���� Ȥ�� ���丮)�� �����ϱ� ���� Ŭ����
 * ���ϻӸ� �ƴ϶� ���丮�� ������ �ȴ�.
 * 
 * 
 */
import java.io.*;
import java.util.Date;

public class Source01_File {
	public static void main(String[] args) {
		//File ��ü ���� #
		//String�� Ǯ��η� String path
		File f1=new File("C:\\Program Files\\Internet Explorer\\F12.dll");//�ý��ۻ��� Ǯ ��� (���丮)��Ʈ������ �ۼ��ϴ¹�
		File f2=new File("D:\\yunkangmin\\�ڷ�\\BingobyYun.jar"); //��λ��� Ǯ��� (����)//Ȯ���ڵ� ��������Ѵ�.
		
		//String parent, String child
		File f3=new File("C:\\","Users");//�θ�� �̸��� ���� �����ص� ��
		//File parent, String child
		File f4=new File(f1,"JAVA");//
		File f5=new File(f4,"jdk1.8.0_144");//
		File f6=new File(f5,"bin");//
		File f7=new File(f5,"src.zip");//
		
		//���4����
		//======================================================
		File[] fs=new File[] {f1,f2,f3,f6,f7};//���߿��� �迭�� ������� �ִ�.
		for(int i=0;i<fs.length;i++) {
			File t=fs[i];
			String path=t.getAbsolutePath();//�����ΰ� �´� Ǯ���
			String name=t.getName();//�̸�������
			System.out.println("name ? "+name);
			System.out.println("path ? "+path);
			System.out.println("exists ?"+t.exists());//�ִ��� ������
			System.out.println("isDirectory ?"+t.isDirectory());
			System.out.println("isFile ?"+t.isFile());
			System.out.println("isHidden ? "+t.isHidden());
			long t1=t.length();//�����Ʈ¥�� �������� ũ���ε� ����byte ���丮�ΰ�� �׾ȿ� �ҼӵǾ� ���� ����
			//�Ҽ����� �����ִ� �ڽĵ� ���� ���� ������ ���丮��
			System.out.println("length ? "+t1);
			long t2=t.lastModified();
			System.out.println("lastModified ? "+t2+" / "+new Date(t2));//���������ð� �����ð��� �������� �귯�� �ð� currentMillontimes
			System.out.println();
			//���״�� ���丮�̸��� �����̸��� ���°�
		}
		//exists�� false�� ���� ���ǹ�
		//Ǯ�� ����´� �������丮�� �����κе��� ����ų� 
	
	}
}
