package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;

/*
 * CMD�� COPY��� (�Ȱ��� byte�� ������ �ϳ� �����°�)
 * Network��������, ���ϼ����� ������ ����
 *
 * 
 */
public class Example02_ByteCopyTEST {
public static void main(String[] args) {
	try {
		JFileChooser fc=new JFileChooser(new File("c:\\Users"));
		fc.showOpenDialog(null);
		File src=fc.getSelectedFile();
		StringBuilder sb=new StringBuilder(src.getName());//�߰��� ���ڸ� �������� ��Ʈ�������� ����ȴ�.
		sb.insert(sb.lastIndexOf("."),"-���纻");
		File dest=new File(src.getParentFile(),"(��)"+src.getName());  //sb.toString()
		//������ ������ �ִ� ���丮���ٰ� (��)�����̸�,Ȯ����
		//									Ȥ�� �����̸�-���纻.Ȯ����
		FileInputStream fis=new FileInputStream(src);
		FileOutputStream fos=new FileOutputStream(dest);
		//int cnt=0;
		//byte[]b=new byte[512];//����Ʈ�迭�� �ָ� �׳����� ���ٴٵ����.���� �ȿ� 0�� �� ����.
		byte[]b=new byte[1024];//������ �⺻ũ�� 8Ű�ι���Ʈ����1024*8
		int tot=fis.available();
		int sum=0;
		while(fis.available()>0) {
			int p=fis.read(b);
			sum+=p;
			fos.write(b,0,p);//�ߺ�����
			System.out.println((double)sum/tot*100+"%");//��ü�߿� �а� �� �뷮
			/*if(p==1024)
			fos.write(b);
			else
				fos.write(b,0,p);*/
		}
/*		while(fis.available()>0) {
			int b=fis.read();
			fos.write(b);
			
		}
*/		fis.close();
		fos.close();
		System.out.println("byte copy done");
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
