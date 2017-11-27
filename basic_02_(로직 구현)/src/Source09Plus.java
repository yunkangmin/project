
public class Source09Plus {

	public static void main(String[] args) {
		int lv=3+(int)(Math.random()*7);
		int rem=(1+(int)(Math.random()*4))*100;
		
		System.out.println("현재 VIP "+lv+"단계이며 , 포인트"+rem+"보유중");
		//사용자의 상태가 이럴 때, 총 얼마를 충전해서 이 상태까지 왓나?
		//
		int charge=0;
		while(lv>=1) {
			charge+=lv*500;
			lv--;
		}
		charge+=rem;
		System.out.println("총 충전액 : "+charge);
	}

}
