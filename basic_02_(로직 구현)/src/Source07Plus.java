
public class Source07Plus {

	public static void main(String[] args) {
		String m = "FF";// 16������ ���ڿ��̶�� ����.
		// String�� ������ �����̴�.
		// �߰������� ���������� ��� �ؼ� �� �и��س���.
		char c1 = m.charAt(0);//ù��° ����
		char c2 = m.charAt(1);//�ι�° ���ڰ� ������.

		System.out.println(m + "�� 10�� ���� ���ΰ�?");
		int val = 0;

		if (c1 >= 'A' && c1 <= 'F') {
			System.out.println((int) c1);
			System.out.println((int) (c1 - 55));
			val += 16 * (c1 - 55);
		} else {
			System.out.println((int) c1);
			System.out.println((int) (c1 - 48));
			val += 16 * (c1 - 48);
		}
		if (c2 >= 'A' && c2 <= 'F') {
			val += 1 * (c2 - 55);
		} else {
			val += 1 * (c2 - 48);
		}
		System.out.println("����: " + val);
	}
	// System.out.println('F'*1);
	/*
	 * int n1, n2; if(c1>64) { n1=c1-55; }else { n1=c1-48; } if(c2>64) { n2=c2-55;
	 * }else { n2=c2-48; } int result=(n1*16)+n2; System.out.println(result); }
	 */
}
