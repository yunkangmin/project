
public class Source01Plus {

	public static void main(String[] args) {
		int rand = 1000 + (int) (Math.random() * 9000);
		System.out.println(rand);
		int t;
		int prev = rand / 100;
		int next = rand % 100;
		System.out.println("prev : " + prev + " , next :" + next);
		// if�� �ؾߵ� �۾��� �߰�ȣ {}�� �����ؾߵǴ°� ������, �۾��� �ϳ���� ,{}��������
		// �����۾��̶�� {}�ݵ�� ����
		if (prev == next)
			System.out.println("�� �μ��� �� �μ��� ��ġ����");
		else
			System.out.println("�� �μ��� �� �μ��� ����ġ����");
		// != ���� ������
		if (rand % 2 == 0) {
			t = prev + next;
		} else {
			t = prev - next;
		}
		System.out.println(t);
		/*
		 * �������� Ȯ���� ��ġ�� ¦���� ������ ��� õ�� �ڸ� ���� �ڸ� +�����ڸ����� �ڸ� Ȧ���� �����͸� õ�� �ڸ� ���� �ڸ�-���� �ڸ�
		 * �����ڸ� 3317 33-17�� ��� 1248 12+48�� ���
		 *
		 *
		 **/
	}
}
