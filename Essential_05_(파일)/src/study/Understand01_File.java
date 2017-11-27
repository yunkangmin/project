package study;
import java.io.File;
import java.util.Date;

import javax.swing.JFileChooser;
public class Understand01_File {
public static void main(String[] args) {
	JFileChooser jfc=new JFileChooser();
	jfc.showOpenDialog(null);//�ش�Ҽ����� �ϴ� null�� �ַܼ� ���°� �ƴϱ⶧����
	File file=jfc.getSelectedFile();//�����Ѱ��� ���ϰ�ü�� �������.
	
	String path=file.getAbsolutePath();
	System.out.println("PATH = "+path);
	//�� ������ �̸� : getName()
	//�� ������ �θ� ���丮 : lastindexof subString
	//length�� �����µ� ����ũ��: �ΰ��� �������� ���
	//�ϳ��� �׳� byte�� 
	//�ٸ� �ϳ��µ����� ũ�⿡ ���� MB��� ,KB��� ,byte���
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
	
	
	//�����κ��� 3���� �׳� 3�ڸ� �����κ��� 2���� �Ҽ������ڸ� ���� 1���� �Ҽ���2�ڸ�
	/*
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
*/	}
	//exists�� false�� ���� ���ǹ�
	//Ǯ�� ����´� �������丮�� �����κе��� ����ų� 
}

