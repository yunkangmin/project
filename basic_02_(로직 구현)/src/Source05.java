
public class Source05 {

	public static void main(String[] args) {
		// if�� else if , Ȥ�� else�ȿ��� ��ø if ����Ҽ� ����
		// 20~90������ ���� ���� 3���� Ȯ���Ͻÿ�
		int s1 = 20 + (int) (Math.random() * 80);
		int s2 = 20 + (int) (Math.random() * 80);
		int s3 = 20 + (int) (Math.random() * 80);

		System.out.println(s1 + ".." + s2 + ".." + s3);
		String result;// result�� ���ڿ� �ϳ��� �����ؾߵ�
		// ���90�̻��̸� A���, 75�̻��̸� B���, 60�̻��̸� C��� ,�������� FAIL�̶�� ���ڿ��� ����
		// ��ո� ��޿� ������ ��ġ�°� �ƴ϶� �ϳ��� 40�̸��� ������ ������ FAIL
		// ū ������ ��������
		double avg = (s1 + s2 + s3) / 3.0;
		avg = (int) (avg * 100) / 100.0;

		if (s1 >= 40 && s2 >= 40 && s3 >= 40) {
			// ���⼭ ����� ����ؼ�
			// �̾ȿ� if elseó��.
			if (avg >= 90) {// ��ø if else�� �鿩���� ���� �ܺ� if else�� �򰥸���.
				result = "A";
			} else if (avg >= 75) {
				result = "B";
			} else if (avg >= 60) {
				result = "C";
			} else {
				result = "FAIL";
			}
		} else {
			result = "FAIL";
		}
		System.out.println(avg);
		String r = avg > 0 ? "+" : "";
		r += avg;
		if ((int) (avg * 100) % 10 == 0)
			r += "0";
		System.out.println(result + " " + r);
	}
	//�����͸� ����ִ°͵� �۾��̴�.

}
