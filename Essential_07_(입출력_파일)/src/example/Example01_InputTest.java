package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Example01_InputTest {

	public static void main(String[] args) throws InterruptedException {
		JFileChooser f= new JFileChooser();
		f.showOpenDialog(null);
		File t=f.getSelectedFile();
		System.out.println(t.getAbsolutePath());
		//�̷��� �ؼ� ������ ���Ͽ� Input�� �����ؼ� read�۾��� �س����µ�,
		//ù 4����Ʈ, ������ 4����Ʈ ���
		//8����Ʈ���
		
		//File target=new File("d:\\datas","setup.exe");
		
		try {
		FileInputStream fis=new FileInputStream(t);
		int cnt=0;
		//Ư�������� ����Ʈ�� �о�� ���
		//1.available()Ȯ��
		//2.read()�Ѱ��� -1�� ������ ������.
		//3.�ش������� length()��ŭ
		while(fis.available()>0) {
			cnt++;
			int b=fis.read();
			if(cnt<=4||fis.available()<=4)
			System.out.println(cnt+" : "+b);
			//�� �ڵ忡�� �ǹ��ְ� ���� �Ǵ°�, �迭�� �о��(read),
			//���ϵǴ� ���� ���� ä���� ĭ�� ��� ��(�� ���� ĭ���� ���ǹ�)
		}
	
	
		fis.close();//close�� �� ����� �Ѵ�.����������
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Err! "+e.getMessage());
		}catch(IOException e) {
			System.out.println("������۾��� ����!"+e.getMessage());
			
		}
			
	}

}
