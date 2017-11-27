
public class Source11 {

	public static void main(String[] args) {
		//while loop 는 반복을 수행할건지 판단할 수 있는 조건을 설정
		//횟수는 중요하지 않다.결과물이 만들어지기만 하면 횟수는 중요하지 않다.
		//for loop ? 조건 외에 두가지를 더 추가로 설정
		//반복을 최초 수행할때 해야될 작업
		//매 반복이 끝날때마다 해야될 작업
		//for(first job; condition ; each end job) : 각 항이 필수는 아님
		int lv=3;
		int rem=100;
		
		int sum=0;
		int v=1;//첫항과 마지막항에 해야될 일을 정해준다. 첫항은 한번만 실행되고 마지막항은
		//조건이 만족할때까지 계속 반복수행한다.
		//꼭필수는 아니다
		//조건이 없으면 무한반복 판단할 조건이 없기때문이다.
		for(System.out.println("작업스타트..!");v<=lv;System.out.println("한번 끝!")) {
			sum+=(v++)*500;
		}
		sum+=rem;//조건이 없을시 빨간줄이 뜬다. 언리치블코드
		//while은 조건을 비울수없다.for는 비울수 있다.다만 조건이 없다면 무한루프이다.
		System.out.println("결과 : "+sum);
		//이 loop를 만들어둔 이유는
		//1.특정횟수의 반복처리에 용이
		for(int cnt=1;cnt<=5;cnt++) {//가장 기본적인 for문의 형태
			//cnt는 지역변수.해당 for문이 돌아가고 있는 동안에만 유효하다.
			System.out.println("반복 작업");
			//cnt--;무한 반복이 일어난다.
		}
		//System.out.println(cnt); 에러가 난다.
		//for(int cnt=1;cnt<=3;cnt++)
	}

}
