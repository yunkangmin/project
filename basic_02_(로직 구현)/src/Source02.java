
public class Source02 {

	public static void main(String[] args) {
		int t = 100 + (int) (Math.random() * 900);
		boolean mode = Math.random() > 0.5;
		System.out.println(mode + " .. " + t);

		// mode���� ture�� ,t��� ���ڱ����� ���δ� �ٸ� ��ġ���� Ȯ��
		int a = t / 100;// t%1000/100
		int b = (t % 100) / 10;// (t-a*100)/10
		int c = (t % 100) % 10;// t%10/1 t%10
		boolean rst;

		if (mode) {
			boolean b1 = (a != b);
			boolean b2 = (a != c);
			boolean b3 = (b != c);
			rst = b1 && b2 && b3;

		} else {

			boolean b1 = (a == 3);
			boolean b2 = (a == 3);
			boolean b3 = (b == 3);
			rst = b1 || b2 || b3;
		}
		System.out.println("���� ��� : " + rst);
		// �׷��� ������,3�̶�� ��ġ�� �ִ��� Ȯ��

	}

}
