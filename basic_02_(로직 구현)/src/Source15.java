
public class Source15 {

	public static void main(String[] args) {
		//일반적인 반복 흐름을 변화시키는 키워드
		//continue : 해당회차의 남아있는 반복 작업을 건너뛰게 됨(skip)
		//break : 더이상 반복이 진행되지 않고 멈추게 됨(break)
		int num=100;
		while(num>0) {
			System.out.println("loop start.."+num);
			
			int t=-3+(int)(Math.random()*8);//어떤 숫자가 나올지 모른다
			System.out.println("t= "+t);
			if(t<0) {
				System.out.println("!!SKIP!!");
				continue;//이 행 밑으로 작업은 건너 뛰고 다시 위에 조건으로 간다.
			}
			num-=t;//그 값을 뺀다
			System.out.println("loop end...");
			for(int cnt=1;cnt<=2;cnt++) {
				System.out.println(".......");
			}
		}
		System.out.println("terminate");
		/**/
		int tx=-4;
		int ty=2;
		for(int n=-2;n<=2;n++) {//증감식은 스킵의 대상이 아니다.
			int vx=tx+n;
			if(vx<-5||vx>5)
				continue;
			for(int r=-2;r<=2;r++) {
				//int vx=tx+r;
				int vy=ty+r;
				System.out.println(vx+" "+vy);
			}
		}
	}

}
