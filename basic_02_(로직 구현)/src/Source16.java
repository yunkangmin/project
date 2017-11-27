
public class Source16 {

	public static void main(String[] args) {
		//break는 반복문이 그 즉시 종료 됨.
/*		int aim=100;
		for(int cnt=1;cnt<10;cnt++) {
			int gain=7+(int)(Math.random()*15);//7 21
			System.out.println(cnt+"turn..."+gain);
			aim-=gain;
			System.out.println("left aim = "+aim);
			if(aim<=0) {
				System.out.println("  enough !!");
				break;//반목문을 빠져나간다
			}
		}
		System.out.println("terminate");
		*/
		int target=(int)(Math.random()*50);
		System.out.println(target);//이 숫자를 2진변환하면 전부 1로만 구성되는지 확인
		String result="";
		int b=0;
		while(target>0) {
			int n=target%2;
			if(n==0) {
				b++;
				break;
			}
			target/=2;
		}
		if(b==0) {
			System.out.println("1로만 구성됨");
		}
		else {
			System.out.println("0이 들어감");
		}
	}
	//천의 자리  숫자4개 중에 7이 들어 가는지 확인
	//7이 있는지 없는지가 중요 이때 break가 쓰인다.
	//break의 위치는 상관없다
	//continue는 맨 마지막에는 설정할 필요가 없다.
	//중간중간에 넣어주면 된다.
}
