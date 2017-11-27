/*
 * Throwable
 * 	-Error : try - catch�� �ʼ��� �ƴ�
 * 	-Exception : -UnChecked Exception : try - catch�� �ʼ��� �ƴ� �������� ���ذ��� �ִ� �ڵ���̸���.
 * 					(����� if�����ɷ� �ɷ������ִ�.)
 * 				 -Checked Exception : try - catch�� �ؾ߸� ��.
 * 					(�ڵ�󿡼� ��� �� ���� ����.)
 * 
 * 
 */
import java.io.*;
public class Source04_Exception {
public static void main(String[] args) {
	File f=new File("src"); //���丮���� �������ϰ� , �̸��� ������ ���α׷� ���ư��°��� parent�� �����.��ũ�����̽�
	System.out.println(f.exists());
	File d=new File(".clsspath");
	File ff=new File(d,"ignore");
	try {
	//ff.createNewFile();//mkdir�� ���丮�� �����°�, createNewFile�� ���Ϸ� ����.
	boolean rst=ff.createNewFile();//�õ����� �ȵɶ�.project .classpath ���Ͼȿ� ������ �������.(�Ұ����� �۾�)    //�̹������� �������.
	System.out.println("createNewFile = "+rst);
	}catch(IOException ie){
		System.out.println("..??");
		
	}
	
	//Unhandled exception type IOException
	//numberfor�̷��ֵ��� ����ó���� ���ص���.
	
	
}
}
