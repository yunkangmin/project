
public class Source17 {

	public static void main(String[] args) {
		//
		step: for (int chance = 1; chance <= 3; chance++) {
			System.out.println("# " + chance + "회차 전향 #");

			int score = 0;
			for (int i = 1; i <= 5; i++) {
				int t = 80 + (int) (Math.random() * 20);// 80 99
				System.out.println("   => " + t);
				score += t;
				if (score >= 340) {
					continue step;// 안쪽 loop만 빠져 나간다.
					// break step; //continue 라벨은 잘 안쓴다
					// break continue는 가장 안쪽 loop에 영향을 끼치게 되지만
					// 전체 loop에 영향을 끼치고 싶다면 name처리하고 쓰면됨
					// labeled loop 라벨 처리되었다.
					// switch에서 break는 스위치문만해당되므로 특정 loop를
					// 빠져 나가고 싶다면 라벨을 써야한다.
				}
			}
			System.out.println(" ...." + score);
		}
		int cnt = 0;
		solution: // 예약어는 안된다.
		for (int x = -3; x <= 3; x++) {
			test: for (int y = -3; y <= 3; y++) {
				int t = x * x + 3 * x + y;
				if (t == 0) {
					System.out.println("X =" + x + ",Y = " + y);
					cnt++;
					break test;
				}
			}
			/*
			 * if(x==3) { //break test;//이건 안된다. 안쪽에서 바깥쪽만 된다. }
			 */
		}
		System.out.println(cnt);

	}

}
