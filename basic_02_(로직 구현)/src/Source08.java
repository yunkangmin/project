
public class Source08 {

	public static void main(String[] args) {
		// �ݺ�ó��....
		// 10������ 16������ �ٲٴ� ���� 255���� ���⶧�� ������ �˰� �ִ�.
		int rand = (int) (Math.random() * 4);// 0~3�̶��
		// 2�����ڿ��� ������ 0~3�������´�
		// if else
		String m = "";
		m += rand / 2;// ���
		m += rand % 2;// �������� �������� ó���ϸ��
		System.out.println(rand + " => " + m);
		// �߻��� �� �ִ� ��ġ�� ������ �𸥴ٸ�, ������ ó������ �ʴ´�.
		// ���ϰ� ���������ϰ� ���ϰ� ���������ϰ� �ݺ��ؾ��Ѵ�.
		// �ݺ�ó���� ���Ǵ� ������ while (do~while)/for �ΰ����̴�.
		// 1.while loop(�ݺ�=����) :
		// �ݺ��� ���ѾߵǴ� ������ ���¸� ����.
		while (rand > 0) {
			// System.out.println("1");
			// System.out.println("2");
			rand--;
		}
		int val = (int) (Math.random() * 30);
		// 2�γ����� ���� ���Ѵ� ���۾��� 2���� Ŭ������
		// �׸��� �Ųٷ� ���Ѵ�.
		System.out.println(val);
		String result = "";
		while (val > 0) {
			int p = val / 2;
			int n = val % 2;
			result = n + result;
			System.out.println(p + " ....." + n);
			val = p;// �� �ٲ�ġ�� �׷��� ������ �����ϰ� �����.
			// ���� �ֿܼ��� ����ϴ� ���������ߴ�
		}
		System.out.println(result);
		String str = "";
		str = "��" + str;
		str = "��" + str;
		str = "��" + str;
		System.out.println(str);
	}

}
