import model.Bomb;
import model.BombUtil;

public class Source12_BombUtil_TEST {

	public static void main(String[] args) {
		//��ü�� ���� �������� �ʰ� Ȯ���� ������
		//��ǥ���� ������ ���°� ���丮 ������ ����
		Bomb t1=BombUtil.create();
		System.out.println(t1.toJson());
		//���� ���·� ����ؾ� ��ü�� ����ִ� ���� ��µȴ�.

		Bomb t2=BombUtil.create();
		System.out.println(t2.toJson());
		
		
	}
}


