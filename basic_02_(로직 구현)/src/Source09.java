
public class Source09 {

	public static void main(String[] args) {
		//vip (레벨업)
		int lv=1;
		int charge=1+(int)(Math.random()*50)*100;//100~5000
		
		System.out.println("VIP"+lv+"단계에서 "+charge+"를 충전함");
		//이 사람은 vip몇까지 올라가는가?
		//단계당 업그레이드에 필요한 수치는?lv*500
		//1->2:500, 2->3:1000, 3->4:1500
		//vip올리고 charge빼고
		//이 사람은 vip 몇? 남은 양/ 다음 업을 위해 추가 필요한 충전금액?
		while(charge>=lv*500) {
			charge-=lv*500;
			lv++;
			
		}
		System.out.println("VIP"+lv);
		System.out.println("REMAIN :"+charge);
		System.out.println("MORE :"+(lv*500-charge));
	}

}
