
public class Study12Plus {

	public static void main(String[] args) {
		int seq=0;
		System.out.println(seq++ +"번째 출력");
		System.out.println(seq++ +"번째 출력");
		System.out.println(seq++ +"번째 출력");
		
		System.out.println(++seq +"번째 출력");
		System.out.println(++seq +"번째 출력");
		System.out.println(++seq +"번째 출력");
		
		int storeCnt=0;//변수에 값이 저장되는 횟수
		int mathCnt=0;//수치연산 횟수
		int loadCnt=0;//변수에 값이 로드 되는 횟수
		int hour=19;//0~23
		int minute=15;//0~59
		int second=27;//0~59
		//hour, minute, second의 데이터는 바뀔수 있음. 유효한 데이터가 있다고 가정
		
		//total 변수에 있는 값을 사용해서, 하루기준 몇초가 흘러간건지
		int total=(hour*3600)+(minute*60)+second;
		loadCnt+=3;
		storeCnt+=1;
		mathCnt+=4;
		//여기다가 설정하기
		//그 계산된 total값을 사용해서 하루를 1로 봤을때 대략적인 비율
		double rate;
		rate=total/(60*60*24.0);
		loadCnt++;
		storeCnt++;
		mathCnt+=3;
		
		System.out.println("total: "+total);
		System.out.println("rate: "+rate);
		System.out.println("storeCnt: "+storeCnt);
		System.out.println("mathCnt: "+mathCnt);
		System.out.println("loadCnt: "+loadCnt);

	}

}
