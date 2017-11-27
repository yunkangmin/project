import java.util.Arrays;

public class Source11_ArrayArray {

	public static void main(String[] args) {
		//배열을 배열로:2중배열
		System.out.println(new int[4][]);
		//System.out.println(new int[][4]);
		System.out.println(new int[3][4]);
		int[][]data=new int[3][];//기본형태//int[] instance는 없음.
		System.out.println(data.length);
		System.out.println(Arrays.toString(data));
		data[0]=new int[4];
		data[1]=new int[] {1,5,7,89,2};
		//배열을 배열로 관리
		data[2]=new int[2];
		System.out.println(Arrays.toString(data));
		//int 공간을 쓸려면,
		int []t=data[1];
		System.out.println(t.length);
		System.out.println(t[3]);
		
		System.out.println(data[1][2]);
		for(int row=0;row<data.length;row++) {
			int[]line=data[row];
			System.out.println(line.length+"=="+data[row].length);
			String s =Arrays.toString(data[row]);
			System.out.println(s);
			for(int col=0;col<data[row].length;col++) {
				System.out.println("-->"+data[row][col]);
				//출력에 대한 접근방법
			}
		}
	}

}
