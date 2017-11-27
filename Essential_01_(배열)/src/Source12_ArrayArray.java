import java.util.Arrays;

class Generator{
	//디폴트클래스라서 퍼블릭을 붙여봐야 외부에서 접근이 안된다.
	public static int [] singleArray() {
		int []ar=new int[1+(int)(Math.random()*10)];
		for(int i=0;i<ar.length;i++) {
			ar[i]=1+(int)(Math.random()*10);
		}//랜덤크기의 1차원배열을 만든다.그리고 거기에 데이터를 세팅한다.그리고 리턴
		return ar;
	}
}
//======================================================
public class Source12_ArrayArray {
	public static void main(String[] args) {
		int[][]sample=new int[5][];
		for(int row=0;row<sample.length;row++) {
			sample[row]=Generator.singleArray();
			String s=Arrays.toString(sample[row]);
			System.out.println(s);
		}
		int max=sample[0].length;
		int num=0;
		for(int row=0;row<sample.length;row++) {
			if(max<sample[row].length)
				num=row;
		}
		System.out.println("가장 길이가 긴 배열인덱스: "+num);
		int sum=0;
		for(int i=0;i<sample[num].length;i++) {
			sum+=sample[num][i];
		}
		System.out.println("가장 길이가 큰 배열안 숫자들의 합: "+sum);

		int maxlen=sample[0].length;
		int[]rowSum=new int[sample.length];
		for(int row=0;row<sample.length;row++) {
			if(maxlen<sample[row].length) {
				maxlen=sample[row].length;
			}
			int sum1=0;
			for(int col=0;col<sample[row].length;col++) {
				sum1+=sample[row][col];
			}
			rowSum[row]=sum1;
		}
		
		int[]colSum=new int[maxlen];//new int[7];//
		//모든상황을 구해서 최대까지 가야한다.
		for(int col=0;col<maxlen;col++) {//가장 긴 배열 길이까지
			int sum1=0;
			for(int row=0;row<sample.length;row++) {
				//if(col<sample[row].length)
					//col을 기준으로 row값이 증가하면서 해당row값의 col보다col이
					//크다면 그 해당row값만 건너뛴다.
				/**/if(col>sample[row].length)
					continue;//하면안된다.
				sum1+=sample[row][col];//row값이 변한다.
			}
			colSum[col]=sum1;
		}
		System.out.println(Arrays.toString(colSum));
		//길이가 일정하지 않다는 것이 문제
		//가장 길이가 큰 배열의 길이
		//int 5칸짜리 배열을 만들어서..
		//각칸에 해당row의 합을 설정.
		//각 컬럼들의 합을 적절한 크기의 배열을 만들어서, 설정
	}
}
