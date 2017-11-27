package game;

import java.util.Arrays;

public abstract class NumberManager {
	int [] nums;
	public NumberManager() {
		nums=new int[25];
	}
	//�Ű������� ���޹޴� n���� �̹� nums�迭�� �ִ��� Ȯ��
	public abstract boolean contains(int n);
	//�Ű������� ���޹޴� n���� ����ִ� ĭ�� ã�Ƽ� ������ ��Ű�� ��.
	public abstract void add(int n);
	//�������� �̾Ƽ�, �ڱ��� �迭�� �Ȱ����� �ִ� ���̸� add��Ű�� �װ��� ����
	//��ǻ�Ϳ�
	public abstract int pick();
	public String toString() {
		return Arrays.toString(nums);
	}
}
