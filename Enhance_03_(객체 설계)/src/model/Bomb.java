package model;

public class Bomb {
	//Bomb 관련 기능인것 같긴 한데, instance용 메서드는 아닌거 같고,
	//class를 새로 설계해서 만들 필요까지는 없을것 같고,
	//유효한 사거리인지 아닌지 체크
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
	public String toJson() {// 제이슨 형태로 출력되게
		return "{\"x\":\"" + x + "\",\"y\":" + y + ",\"radius\":" + radius + "}";
	}
	boolean contains(int x, int y) {
		// 폭탄반경에 해당 전달된 x,y가 포함되어 있는지 확인
		// (원이나 사각형으로 계산, 경계선 미포함)
		// JSON어느언어나 호환되는 형식언어
		// 몽고디비 nosql
		// return this.x-radius<=x&&x+radius>=x&&this.y-radius<=y&&y+radius>=y;
		if (rangeTo(x, y) < radius)
			return true;// return이 사용되는 즉시 메소드가 종료된다.
		return false;
	}
	double damageTo(int x, int y) {
		// 전달된 x,y에 입힐 데미지퍼센트
		/*
		 * if(contains(x,y)) return ((radius-rangeTo(x,y))/radius)*100;
		 * 
		 * else return 0.0;
		 */ double r = rangeTo(x, y);
		if (r > radius)//경계선을 포함을 안해야 그자리에서 부터 +2칸 -2칸영역이 확보된다.
			return 0;
		else
			// range 0=100, range=radius :0, r=?
			return 1-r/radius;
		// 100 - (r / radius * 100);
	}
	double rangeTo(int tx, int ty) {
		// 전달된 x,y까지의 거리를 계산
		double t = Math.pow(x - tx, 2) + Math.pow(y - ty, 2);
		return Math.sqrt(t);
	}
}
