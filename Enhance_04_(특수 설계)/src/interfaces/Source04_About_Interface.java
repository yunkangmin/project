package interfaces;
/*
 * �������̽��� ���ؼ� ��� ȿ��
 * -��ü������ ������ (light-coupling)
 * 
 * �޼ҵ�� �ݵ�� public abstract���� ��.
 * ~public abstract Ű���带 ������.
 * �ڵ����� �ٿ��ش�.
 * �ϼ��޼ҵ带 ������ ����
 * Ŭ���������� public �� ������
 * jdk1.8�������� interface�� default�۵��� ����� �Ѽ��� ����.
 * ������ Ư���� ���ø���Ʈ Ŭ������ �Ȱ����� �������̵� 3�� ������ 1���� �ص���->����Ʈ������߰�
 */
interface Translator{
	public default boolean updateWord(String w, String c) {
		return false;
	}//�̷��� �ϸ� �ؿ� �ʿ��� �������̵带 ���ص� �ȴ�.
	String execute(String word);//������ �����һ�public abstract ó��
}
//=================================================
class KoreaTranslator implements Translator{

	public String execute(String word) {
		switch(word) {
		case "1": 
			return "�ϳ�";
		default: 
			return "�𸨴ϴ�.";
		}
	}
}
class JapanTranslator implements Translator{
	@Override
	public String execute(String word) {
		switch (word) {
		case "1":
			return "����";//������
		default:
			return "����ʪ�";//�𸨴ϴ�.
		}
	}
}
public class Source04_About_Interface {
	public static void main(String[] args) {
		//KoreaTranslator t=new KoreaTranslator();
		//tight~coupling ��ü ������ �� �پ��ִ�.
		//�Ѵܰ�÷��� �޴°� light-coupling
		//�������̽��� ������ �� �� �ִ�.
		Translator t= new KoreaTranslator();
		Translator t1= new JapanTranslator();
		//���߿� �ٱ�⸸ �ϸ� �ȴ�.
		//�������̽��� ����ϸ� ���߿� �ڵ��� ū��ȭ�� ��������.
		//�߻�Ŭ������ ����ϰ� �Ϲ� �޼ҵ尡 �� �߰��� �Ͼ��.
		String c=t.execute("1");
		String c1=t1.execute("1");
		System.out.println(c);
		System.out.println(c1);
		//������ �ֳĸ� null �̱� ������
	}
}
