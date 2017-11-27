package model;

public class Bomb {
	//Bomb ���� ����ΰ� ���� �ѵ�, instance�� �޼���� �ƴѰ� ����,
	//class�� ���� �����ؼ� ���� �ʿ������ ������ ����,
	//��ȿ�� ��Ÿ����� �ƴ��� üũ
	public static boolean checkValid(Bomb t) {
		return t.radius>0;
	}
	public boolean isValid() {
		return radius>0;
	}
	int x;
	int y;
	int radius;
	Bomb(int a, int b) {
		x = a;
		y = b;
		radius = 1;
	}
	Bomb(int a, int b, int c) {
		x = a;
		y = b;
		radius = c;
	}
	public String toJson() {// ���̽� ���·� ��µǰ�
		return "{\"x\":\"" + x + "\",\"y\":" + y + ",\"radius\":" + radius + "}";
	}
	boolean contains(int x, int y) {
		// ��ź�ݰ濡 �ش� ���޵� x,y�� ���ԵǾ� �ִ��� Ȯ��
		// (���̳� �簢������ ���, ��輱 ������)
		// JSON����� ȣȯ�Ǵ� ���ľ��
		// ������ nosql
		// return this.x-radius<=x&&x+radius>=x&&this.y-radius<=y&&y+radius>=y;
		if (rangeTo(x, y) < radius)
			return true;// return�� ���Ǵ� ��� �޼ҵ尡 ����ȴ�.
		return false;
	}
	double damageTo(int x, int y) {
		// ���޵� x,y�� ���� �������ۼ�Ʈ
		/*
		 * if(contains(x,y)) return ((radius-rangeTo(x,y))/radius)*100;
		 * 
		 * else return 0.0;
		 */ double r = rangeTo(x, y);
		if (r > radius)//��輱�� ������ ���ؾ� ���ڸ����� ���� +2ĭ -2ĭ������ Ȯ���ȴ�.
			return 0;
		else
			// range 0=100, range=radius :0, r=?
			return 1-r/radius;
		// 100 - (r / radius * 100);
	}
	double rangeTo(int tx, int ty) {
		// ���޵� x,y������ �Ÿ��� ���
		double t = Math.pow(x - tx, 2) + Math.pow(y - ty, 2);
		return Math.sqrt(t);
	}
}
