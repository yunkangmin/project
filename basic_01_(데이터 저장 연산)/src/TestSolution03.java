
public class TestSolution03 {

	public static void main(String[] args) {
		//랜덤정수 2개를 확보 -5 ~ 5//
		/*int a
		int b*/
		int rx=-5+(int)(Math.random()*11);
		int ry=-5+(int)(Math.random()*11);
		System.out.println(rx+" "+ry);
		//2차원 좌표값..0점(0.0)에서 해당 좌표까지의 거리?
		//두점사이 공식 x차^2+y차^2에루트
		//그곳을 폭탄(유효반경 5미만)이 떨어진 지점이라고 생각하고 0점에 영향을 끼치는지?
		//>,>=,<,<= 수치상태 크기 확인 T/F 동치여부

		double r=Math.sqrt(rx*rx+ry*ry);
		System.out.println(r);
		System.out.println(r<5);
		boolean f=r<=5;
		System.out.println("피해?"+f);
		//입는 피해 퍼센트 계산?? 거리가 0:100% /5:0%
		
		double d=100-(r/5*100);//음수 피해가 나온다.
		//거리가 5를 초과한 상황을 고려하지 않고 계산을 해서 음수데이터가 나옴
		//d>=0?d:0;
		
		System.out.println(d);
	}

}
