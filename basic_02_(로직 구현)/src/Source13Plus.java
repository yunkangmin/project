
public class Source13Plus {

	public static void main(String[] args) {
		//2���� ������...
		//x^2+3x+y=0�� �����ϴ� ���� ����(��, x,y�� ������ -3<= <=3�̴�.)
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
