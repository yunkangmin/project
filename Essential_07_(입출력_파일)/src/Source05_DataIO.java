import java.io.*;
public class Source05_DataIO {
public static void main(String[] args)throws IOException {
	//Source04_DataIO���� ����صξ��� �����͸� ����
	File src=new File("d:\\datas","savedata01.dat");
	FileInputStream fis=new FileInputStream(src);
	System.out.println("�о ���� ������.");
	//�о�� ���� ����Ʈ�ۿ� ���⋚���� 
	DataInputStream dis=new DataInputStream(fis);
	int n=dis.readInt();//4����Ʈ ������ ������.
	System.out.println(n);
	double d=dis.readDouble();
	System.out.println(d);
	String s=dis.readUTF();
	System.out.println(s);
	//dis.readDouble();//���� ���� 1����Ʈ�Ҹ��ε� 8����Ʈ�� ������ ������.
	boolean b=dis.readBoolean();
	System.out.println(b);
	dis.close();
	//��������� �о�� �ȴ�.
	//��Ÿ�����Ϳ� ����� �����.
}
}
