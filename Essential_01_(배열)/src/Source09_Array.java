import java.util.Arrays;

public class Source09_Array {
public static void main(String[] args) {
	int[]data=new int[] {300,200,1000,400,300,700,300,500};//2400
	int[]maxs=new int[data.length];
	//이중 for를 이용해서..
	//0번 데이터(포함)이후에 등장하는 값들중 최고값
	//1번 데이터 (포함)이후에 등장하는 값들중 최고값
	//2번 데이터(포함)이후에 등장하는 값들중 최고값
	//새로운 배열에 설정
	 
	 int tmp = 0;
	 for(int i=0;i<data.length;i++) {
		 //data[0]..[7]
		 int max=data[i];//0이라면?
		 //맨처음이 2000이라면 값이 제대로 안나온다.
		 for(int j=i;j<data.length;j++) {
			 max=Math.max(max, data[j]);
		 }
		 maxs[i]=max;
	 }
	 String str=Arrays.toString(maxs);
	 System.out.println(str);
	 
	 int[]cmax=new int[data.length];
	 for(int i=0;i<data.length;i++) {
		 //data[0]..[7]
		 int max=data[i];
		 for(int j=0;j<data.length;j++) {
			 if(j<i)
				 continue;
			 max=Math.max(max, data[j]);
		 }
		 cmax[i]=max;
	 }
	 System.out.println(Arrays.toString(cmax));
	 System.out.println(Arrays.toString(data));
	 
	 Arrays.sort(data);
	 System.out.println(Arrays.toString(data));
	 //클론해서 정렬하면된다.
}
}
