
/*
 * ������� �⺻ ������ byte������
 * �̹� �ϼ��Ǿ� �ִ� �ǹ��ִ� ������ ����Ʈ�� ������ �غ��Ҵµ�
 * 
 * �ǹ��ִ� ������ ��������....?-���̺� ���� ����
 * ������ ����� ���Ϸ� ����ؼ� �����Ѵ�.(���̺�����)
 * �ǹ��ִ� ������ ����
 * 
 * �ڹ� ����Ʈ ������� ����Ʈ�ϱ� ���� ������� ���� IOŬ�������� ������.
 *  Data Input / OutputStream
 *  
 * 
 */
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Source04_DataIO {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream(new File("d:\\datas","savedata01.dat"));//������ �ִ��� ������ Ȯ���Ҽ�����
		//������ üũ�� �ؾ��Ѵ�. 1���ƿ�ǲ��Ʈ�� ����������
		System.out.println("����غ� �Ϸ�.");
		//byte Ȥ�� byte[]��¹ۿ� �ȵ�.
		DataOutputStream dos=new DataOutputStream(fos);//�Ű������� �ƿ�ǲ��Ʈ���䱸(�ƿ�ǲ��Ʈ���� ������ ���� �����ϳ��� ���Ͼƿ�ǲ��Ʈ��)
		//���Ͼƿ�ǲ��Ʈ���� �ڱ������� ���������
		//2���ƿ�ǲ��Ʈ��(���������� �ƴ�)�ϴ� �ٲ۰��̰ɷ�
		//DataOutputStream���� �����ϸ� .�⺻�������� +String�� byte�� �ڵ���ȯ�ؼ� �������
		
		dos.writeInt(303);//int4����Ʈ    �⺻���������� ����Ʈ�� �ٲ㼭 ������ش�.
		//39�Է��ϸ� 39�� �ش��ϴ� 4����Ʈ�� �ٲ�����Ѵ�.
		dos.writeDouble(4242.33);//double 8����Ʈ
		//dos.writeChars("��ŷ����");//�ѱ��ڿ� 2����Ʈ �о�� �������� ���ڿ������������� �𸥴�.
		dos.writeUTF("��ŷ����");//�������� ���ڿ����� �������� ������ �־��ش�.6����Ʈ���� ���۴�.
		dos.writeBoolean(true);
		dos.close();//dos�� Ŭ�������൵ fos�� �ڵ����� ������.���ʿ��� �۵��Ǵ� Stream�� close�� ��
	//	fos.write(33);
		//�̰ɰ����� ���̺������� ���� ������ ��Ų��.
	}
}
