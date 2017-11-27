
public class Source10 {

	public static void main(String[] args) {
		// do ~ while
		//사람 3명의 순서를 정해줄꺼임 , 랜덤으로
		int t1, t2, t3;
		//반복작업을 이용해서 t1, t2, t3에 정수를 설정하는데 (1~3)사이로 , 겹치면 안됨
		//
		
		t1=1+(int)(Math.random()*3);
		t2=1+(int)(Math.random()*3);
		t3=1+(int)(Math.random()*3);
		
		int nu=0;
		
		while(t1==t2||t1==t3||t2==t3) {
			++nu;
			t1=1+(int)(Math.random()*3);
			t2=1+(int)(Math.random()*3);
			t3=1+(int)(Math.random()*3);
			
		}
		//숫자를 뽑고 만약에 하나라도 서로 같은 조건이 있다면 랜덤으로 
		//다시 숫자를 뽑는다. 하나의 조건이라도 같지 않을 때까지
		System.out.println("사용자1은 "+t1+" 턴.");
		System.out.println("사용자2은 "+t2+" 턴.");
		System.out.println("사용자3은 "+t3+" 턴.");
		System.out.println("숫자3개를 세팅하는 작업을 총 몇번?"+nu);
		
		
	}

}
