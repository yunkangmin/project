import java.util.Date;

public class Source08_Array {
	public static void main(String[] args) {
		// 배열로 처리되는 데이터중에 가장 큰값, 가장 작은 값 추출도 자주 하는 작업
		int[] data = new int[] { 5, 2, 543, 11, 6, 4, 2, 1, 6, -3, 5 };
		// 샘플데이터설정
		//처리하는 방법..?
		int win=data[0];
		for(int idx=0;idx<data.length;idx++) {
			win=Math.max(win, data[idx]);
		}
		System.out.println(win);
		int min=data[0];
		for(int idx=0;idx<data.length;idx++) {
			if(data[idx]<min)
				min=data[idx];
		}
		//game패키지가서 ,Card랜덤덱 설정해서
		//그중에서 가장 큰 카드와 작은 카드를 추려달라.
		//숫자가 높은애가 일단큼,같은숫자라면
		//♠>♥>◆>♣
		
		//이걸 해결하는데 ,반복문 돌면서 필드체크하지마시고,
		//Card클래스 다른 카드와 크기비교를 할수 있는 메소드를 만들어서 해결.
		//크다고 생각하는 것만 모아두면됨
		Date d=new Date(24212312323412L);
		Date d2=new Date(12324213234112L);
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d2.compareTo(d));
	}
}
