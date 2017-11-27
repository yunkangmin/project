import java.util.Arrays;

/*
 * 배열 데이터 Sorting(정렬)
 * 꽤 많은 구현방법이 있고, 요새나오는 프로그래밍 언어는 다 기본적으로 내장되어 있긴 함.
 * 그래도 하나 정도는 익혀둘 필요가 있다.
 * 가장 쉬운 정렬 알고리즘이 선택 정렬
 */
public class Source10_Array {
	public static void main(String[] args) {
		int[]data=new int[] {300,200,1000,400,300,700,300,500};
		//기본흐름
		//0번인덱스부터 처리를 해나감.
		//그 이후(낫포함)에 등장하는 데이터중 가장 작은 값을 가지고 있는 데이터를 찾아서,
		//그 데이터와 처리중인 데이터를 바꿔주면 됨.
		//0번칸과 3번칸의 데이터를 바꿀려면,
		for(int idx=0;idx<data.length;idx++) {
			int find=idx;//몇번째부터 찾는지
			int min=data[idx];
			for(int start=find;start<data.length;start++) {
				if(data[start]<min) {//data[find]
					min=data[start];
					find=start;//마지막으로 찾은 인덱스가 저장된다.
				//한번돌고 나면 find인덱스에는 가장작은수를 가진 인덱스가 저장된다.
				}
			}
			//min [idx~부터 마지막까지 탐색후의 최소값]
			//find [ 그 min value의 idx]
			System.out.println(find+" : "+data[find]+" , "+min);
			/*if(find==idx)
				continue;*/
			int keep=data[idx];
			data[idx]=min;//data[find]
			data[find]=keep;//마지막으로 찾은 인덱스 위치에 바꿔야 할 인덱스를 넣는다.
			System.out.println(Arrays.toString(data));
		}

		for(int idx=0;idx<data.length;idx++) {
			/**/	int find=data[idx];
			for(int start=idx;start<data.length;start++) {
				if(find<data[start]) {
					find=data[start];
					data[start]=data[idx];
					data[idx]=find;
				}
			}
			//System.out.println(find);
		}
		System.out.println(Arrays.toString(data));
		int keep=data[3];
		data[3]=data[0];//결국엔 똑같아진다.
		data[0]=keep;

		/*	int find=5;
	for(int idx=6;idx<data.length;idx++) {
		if(data[idx]>data[find])
			find=idx;
	}
	System.out.println(find);*/
	}
}
