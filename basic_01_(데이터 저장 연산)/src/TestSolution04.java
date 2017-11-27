
public class TestSolution04 {

	public static void main(String[] args) {
		//자바스크립트
		int price=(100+(int)(Math.random()*100))*1000;//구매가격
		int sale=1+(int)(Math.random()*9);//쿠폰 할인 퍼센트
		boolean vip=Math.random()>0.5;//절반확률
	/*	int cupone=(int)((price*sale)/100);
		int finalprice1=price-cupone;*/
		int plus=vip?5:0;
		int last=plus+sale>10?10:plus+sale;
		int discount=(int)(price*(last/100.0));//실수연산이므로 소수점 정리 돈은 소수점이 없으므로 최종결제 금액
		int payment=price-discount;
		int save=(int)(payment*0.05);
		//구매가격에 할인이 들어감
		//1 할인쿠폰(1~10%)
		//2.vip(+5%)
		//두개 동시적용(합산되서)은 됨 but최대 10%센트
		//할인적용된 가격이 결정이되는데 구매시 이가격의 5%만큼을 적립을 시켜줌.
		//이 적립을 포기하는 대신 바로 위 할인적용된 가격에서 차감시켜 결제할수 있음.
		//최종 구매금액의 적립금 5퍼센트가 되는데 이걸 즉시적용
		System.out.println(price+" / "+sale+" / "+vip);
		System.out.println("할인적용 (%): "+last);
		System.out.println("할인금액 (원): "+discount);
		System.out.println("결제금액 (원): "+payment);
		System.out.println("적립금 (원): "+save);
		//적립금이 적용된다면 save에서 payment만 빼면된다
		
		
		
		
		//필요한 데이터를 계산 출력
		//3개다 찍고 실제 적용된 할인율 결제금액  적립금
		//결제금액-적립금

	}

}
