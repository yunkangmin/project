/*
 * Math.pow��, Math.max, Integer.toString ���� ���ν���(�޼���)���踦 �غ���.
 *
 *procedure �̸��� �����ؾߵ�- (method name)
 *input�� data type���� �����ؾ� �� -(arguments, parameter)
 *output�� data type�� �����ؾߵ�-(return type)
 *
 *�� �ܿ� �������� �߰� �ɼ��� �����ؼ� ����.
 *
 *procedure�� ���� �ڵ�� ���.? -�������� ������, ������ ���� main�� �ִ� ���� ���� �����Ҳ���
 *
 * */
public class Source02 {
	// ========================================================
	// max ���鲨��.(input : int 2�� , output : int)
	// �ɼ�
	protected synchronized static final int max(int one, int other) {
		// one, other�� �����Ͱ� �����Ǵ°�, ���ɶ� ����
		int t = one > other ? one : other;
		// int one;//�ȵȴ�.
		// output��ų �����͸� returnŰ����� ����
		return t;
	}// Ŭ�������ʿ��� ������ �ȴ�.���ξȿ��� �������.
		// �ϴ��� static�� �� ������.
		// �ϴ� �� ���Ͼȿ����� �Լ��� ����� �� �ִٰ� �˰� ����.

	// ========================================================
	public static void main(String[] args) {
		System.out.println(max(31, 9));

		int r = max(31, 9);
		System.out.println(r);

	}
	// ========================================================
}
