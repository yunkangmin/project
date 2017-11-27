/*
 * 분기 흐름 구현에 사용되는 문법
 * if 외에 switch라는 것도 존재함.
 * if -데이터 상태에 따른 분기 흐름
 * switch -데이터 값에 따른 분기 흐름.
 *  switch 처리가 가능한 데이터는 수치형 데이터 , 문자열 데이터, (+ Enum데이터)
 *  
 * */
public class Source06 {

	public static void main(String[] args) {
		int val=4;
		
		switch(val) {
		default:
			System.out.println("DEFAULT");
			break;
		case 4:
			System.out.println("CASE 4 -STEP!!");
			System.out.println("CASE 4 -STEP!!");
			break;
		case 1://콜론 설정 정확한 값 설정
			System.out.println("CASE 1");
			//정확한 값에 따라서 분기가 일어난다
		}
		//switch 문은 해당 case부터 시작해서 다 진행됨(default switch의 흐름)
		//case별 처리가 필요하면, break라는 키워드를 이용해서 설정
		//블록지정하고 alt 화살표 위아래
		//특정 case를 제외한 데이터들은 default case로 처리가 됨.
		//같은 case 지정 불가능.
		System.out.println("END");
		//if(val>4){}
		String mode="action";
		switch(mode) {
		case "comedy":
		break;
		case "romance":
			break;
		default:
			//맨 마지막 항에는  break를 쓸 필요는 없다 어차피 마지막이어서 나간다.
		}//범위지정이 불가하다. 양수일때 음수일때
	
	}

}
