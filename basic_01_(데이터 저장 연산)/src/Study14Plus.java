
public class Study14Plus {

	public static void main(String[] args) {
		int min = 45+(int)(Math.random()*70);
		System.out.println(min);//이렇게 확보한 데이터를 이용시간이라고 가정
		//이용요금은 15분 단위로 계산됨.
		//한시간 미만은15분당 1000원 1시간 이상은 15분당800원
		//27분 2000
		//45분 3000
		//60분 3200
		//61분 4000
		//74분 4000
		int c=min/15;
		//c+=min-(c*15)>0?1:0      == c+=min%15!=0?1:0;
		c+=min%15>0?1:0;
		int p=min>=60?800:1000;
		System.out.println("총이용시간= "+min);
		System.out.println("총이용타임= "+c+"/"+min/15.0);
		System.out.println("적용된 비용= "+p);
		System.out.println(c*p);
		//이용요금 계산?

	}

}
