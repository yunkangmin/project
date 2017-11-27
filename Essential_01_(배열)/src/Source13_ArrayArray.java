import java.util.Arrays;

public class Source13_ArrayArray {

	public static void main(String[] args) {
		//이중 배열
		//int[][]ar=new int[4][]
		//int [][]ar= new int[][]{new int[3],new int[2],new int[4]};
		//int[][]ar=new int[][] {new int[] {1,2,3},new int[] {3,4,5,6},
		//new int[] {1,2}};

		int[][]ar=new int[4][5];//new int[5]를 다 만들어서 설정 모든 칸에.
		ar[2]=null;

		for(int r=0;r<ar.length;r++) {
			System.out.println(ar[r]+" ... "+(ar[r]==null));
		}
		//==================================================
		int[][]box=new int[5][5];

		int num=1;
		while(num<=25) {
			int row=(int)(Math.random()*box.length);
			int col=(int)(Math.random()*box[row].length);
			if(box[row][col]!=0)
				continue;
			box[row][col]=num++;

		}
		for(int r=0;r<ar.length;r++) {
			System.out.println(Arrays.toString(box[r]));
		}
		int t=14;//랜덤을 하시던 변경을 하시던.
		int x=0;
		int y=0;
		s:for(int r=0;r<box.length;r++) {
			for(int i=0;i<box[r].length;i++) {
				if(t==box[r][i]) {
					x=r;
					y=i;
					break s;
				}
			}
		}
		System.out.println("box["+x+"]"+"["+y+"]");
		int tr=-1;
		int tc=-1;
		for(int r=0;r<box.length;r++) {
			for(int c=0;c<box[r].length;c++) {
				if(box[r][c]==t) {
					tr=r;
					tc=c;
				}
			}
		}
		System.out.println("["+tr+"]["+tc+"]");
	}

}
