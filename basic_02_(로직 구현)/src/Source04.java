
public class Source04 {

	public static void main(String[] args) {
		// 2.else if ?��� �� �̿��ؼ� �ؾߵǴ� �۾��� 2������ �ƴ϶� ���� ����ȭ ��ų�� �ִ�.
		int n1 = 1 + (int) (Math.random() * 3);
		int n2 = 1 + (int) (Math.random() * 3);

		System.out.println(n1 + ".." + n2);
		// n1�� n2���� ū��Ȳ �׷��� ���� ��Ȳ �� �ΰ��� �бⰡ �ƴ϶�
		// ���� ��Ȳ ���� ��Ȳ���� �� �پ��� �б� �۾��� �ʿ��Ҷ�

		if (n1 > n2) {

		} else if (n1 < n2) {

		} else {

		}
		// ��Ʈ ���� ����ϴ� ������ �־���
		// 3���� ��Ʈ�����Ͱ� �ִٰ� �����ϰ� ���������� ����ϴ°�
		String result="10T#2D7S";//�ɼ������� ���ϱ� �ɼǱ��� �����ϰ� �ؾ���
		
		int score = 0;
		int d1 = 10;
		char b1 = 'D';// ������ Triple(������ 3����)
		char o1='*';//#(-1), *(2��), ����(�� �ɼ�)
		if(b1=='D'||b1=='d') 
			score+=d1*d1;
		else if (b1=='T'|| b1=='t')
			score+=d1*d1*d1;
		else
			score+=d1;
		
		if(o1=='*') {}
		
		else if(o1=='#') {}
		/*int d2 = 7;
		char b2 = 'S';// ������ Single(������ 1����)
		score = d2;
		
		int d3 = 7;
		char b3 = 'D';// ������ Double(������ 2����)
		score += d3 * d3;
		*/
		System.out.println("SCORE = " + score);
	}

}
