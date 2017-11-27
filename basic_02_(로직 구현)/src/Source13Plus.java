
public class Source13Plus {

	public static void main(String[] args) {
		//2차원 방정식...
		//x^2+3x+y=0을 만족하는 해의 개수(단, x,y의 범위는 -3<= <=3이다.)
		int cnt=0;
		for(int x=-3;x<=3;x++) {
			for(int y=-3;y<=3;y++) {
				if(x*x+3*x+y==0) {
					System.out.println(x+" "+y);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
