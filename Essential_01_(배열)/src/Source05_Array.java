/*
 * 배열 다뤄보기
 * 
 */
import java.util.Arrays;
public class Source05_Array {
	public static void main(String[] args) {
		//샘플데이터를 만들어두고 처리
		//배열은 0이상이면 됨.
		boolean[]sample=new boolean[0];//0칸짜리 배열은 존재가능
		sample=null;
		//System.out.println(sample.length);//터진다.
		//System.out.println(Arrays.toString(sample));
		//int형 데이터 보관소 5칸 :idx 0~4로 설정되어있을거임.
		for(int cnt=1;cnt<=3;cnt++) {
			int rd=(int)(Math.random()*sample.length);
			if(sample[rd]) {
				cnt--;
				continue;
			}
			sample[rd]=true;
			System.out.println("try"+cnt+"done");
			//랜덤값이 같을수도 있다.
		}
		System.out.println(sample);//배열객체값
		String s=Arrays.toString(sample);//배열안에 들은 값을 출력해준다.
		System.out.println(s);
		//toString()이 각 자료형으로 오버로딩이 되어있다.
		//위 상황은 이미 설정이 끝난 곳을 고려하지 않아서 무조건 3개가 세팅이 되진않음
		//이걸 세팅 과정을 수정해서 반복처리가 끝나고 난후 랜덤한곳 3곳에 반드시 true를 설정.
	}
}
