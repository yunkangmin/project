package model;

public class Function {
	//class ���踦 �Ҷ�, field�� ���� �ʿ�ġ �ʰ�,
	//method���� ����ü�� ����Ǿ� ���� ��찡 �ִ�.
	//�̷� ��쿡 static�޼���� ������� �ϴµ�
	//���� ��ü ������ ���ص� ���� �ִ�.
	//static�� ������ ���ϰ� ���� �ִ�.
	
	public static int max(int a,int b) {
		return a>b?a:b;
		
	}
	public static double max(double a, double b) {
		return a>b?a:b;
		
	}
	//������ �غ��� ���ǹ��ϰ� ��ġ�� ���� class��� �����ڸ� ���Ƶ�.
	private Function() {
		
	}
}
