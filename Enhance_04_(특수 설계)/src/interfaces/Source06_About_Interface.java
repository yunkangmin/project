package interfaces;
//interface�� extends����
interface SuperTranslator extends Translator{
	
}
//�������̽������� extends�� ����.
interface Manager{
	abstract boolean work(String job);
}
//�������̽��� ���ÿ� �������� �Ѳ����� ���� ������.

//�߻�Ŭ������ �ϼ��� �κ��� �־ �浹�� �Ͼ���մ�.���߻�ӺҰ�
//���࿡ ���߻�ӵǸ� �ڽ��ʿ��� �߻�޼ҵ带 ȣ���ҽ� �̸��� ������ �浹�� �Ͼ
//������ �������̽��� �ϼ������ʾƼ� �׷��κ��� ����.
class Almight implements Translator,Manager{
	@Override
	public String execute(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean work(String job) {
		// TODO Auto-generated method stub
		return false;
	}
}

public class Source06_About_Interface {

}
