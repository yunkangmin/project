
public class Source17 {

	public static void main(String[] args) {
		//
		step: for (int chance = 1; chance <= 3; chance++) {
			System.out.println("# " + chance + "ȸ�� ���� #");

			int score = 0;
			for (int i = 1; i <= 5; i++) {
				int t = 80 + (int) (Math.random() * 20);// 80 99
				System.out.println("   => " + t);
				score += t;
				if (score >= 340) {
					continue step;// ���� loop�� ���� ������.
					// break step; //continue ���� �� �Ⱦ���
					// break continue�� ���� ���� loop�� ������ ��ġ�� ������
					// ��ü loop�� ������ ��ġ�� �ʹٸ� nameó���ϰ� �����
					// labeled loop �� ó���Ǿ���.
					// switch���� break�� ����ġ�����ش�ǹǷ� Ư�� loop��
					// ���� ������ �ʹٸ� ���� ����Ѵ�.
				}
			}
			System.out.println(" ...." + score);
		}
		int cnt = 0;
		solution: // ������ �ȵȴ�.
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
			 * if(x==3) { //break test;//�̰� �ȵȴ�. ���ʿ��� �ٱ��ʸ� �ȴ�. }
			 */
		}
		System.out.println(cnt);

	}

}
