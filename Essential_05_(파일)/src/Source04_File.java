import java.io.*;
public class Source04_File {
	public static void main(String[] args) {
		//���� 
		//���丮�� ����
		File target =new File("d:\\","temp");//�θ���͸��� temp���丮 ���� �θ���͸��� ������ false
		boolean b=target.mkdir();//���丮�� ������.temp���丮����
		System.out.println(b);//�̹� �ְų� ,���Ͼȿ� ���͸��� �����ϰų�, �θ���͸��� ���ٸ� false
		
		//�̸�����
		File m=new File("d:\\","temp2");//�����̳� ���丮�� �ٲܼ� �ִ�.
		boolean bb=target.renameTo(m);//��������� ���ų� ,�ٲٰ��� �ϴ� �̸��� �ְų� �̸��� �ٲ�� ������ �������� �ִ� �͵��� �׷��� �ִ�.
		System.out.println("rename ? "+bb);
		
		//���� 
		boolean bbb=m.delete();//Ÿ���� ���ų� , ���͸��� ���, �Ҽӵ� �ֵ��� �ִٸ� false
		System.out.println(bbb);
		
		File t=new File("c:\\Windows");//�������ϸ� ����� �ִ�.
		System.out.println(t+"is exist "+t.exists());
		System.out.println(t+"is directory "+t.isDirectory());
		boolean f=t.delete();
		System.out.println(f);//�������� ������ ����������.
		
		
	}
}
