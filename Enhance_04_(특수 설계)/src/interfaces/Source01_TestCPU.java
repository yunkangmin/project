package interfaces;

public class Source01_TestCPU {

	public static void main(String[] args) {
		//new CPU();//interface�� cannot instantiate
		//���ϴ� �뵵��???
		//�߻�Ŭ������ ����� ���·� ���Ǿ����� ��.
		//�����뵵�� �ƴ϶�, ���� �������� ����� ��ü���� �޼ҵ带 ��Ƶΰ� ����.
		//�޼ҵ������� ������.�̷��̷��� ������ ������ �ϴ� �޼ҵ� �����
		//����� �����ϱ⺸�� �߻�޼ҵ带 ������ �������� ���� ����
		CPU c=new IntelCPU();
		c.stop();
		CPU cc=new SamsungCPU();
		cc.stop();
		//��ü�ѵΰ��� �������̽��� �Ⱦ��µ� ��Ը� ������Ʈ�� �ϸ� �������̽��� ������
		//��ü���� Ŭ���� ���踦 �Ѵ�.
	}

}
