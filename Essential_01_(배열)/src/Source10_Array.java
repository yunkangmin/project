import java.util.Arrays;

/*
 * �迭 ������ Sorting(����)
 * �� ���� ��������� �ְ�, ��������� ���α׷��� ���� �� �⺻������ ����Ǿ� �ֱ� ��.
 * �׷��� �ϳ� ������ ������ �ʿ䰡 �ִ�.
 * ���� ���� ���� �˰����� ���� ����
 */
public class Source10_Array {
	public static void main(String[] args) {
		int[]data=new int[] {300,200,1000,400,300,700,300,500};
		//�⺻�帧
		//0���ε������� ó���� �س���.
		//�� ����(������)�� �����ϴ� �������� ���� ���� ���� ������ �ִ� �����͸� ã�Ƽ�,
		//�� �����Ϳ� ó������ �����͸� �ٲ��ָ� ��.
		//0��ĭ�� 3��ĭ�� �����͸� �ٲܷ���,
		for(int idx=0;idx<data.length;idx++) {
			int find=idx;//���°���� ã����
			int min=data[idx];
			for(int start=find;start<data.length;start++) {
				if(data[start]<min) {//data[find]
					min=data[start];
					find=start;//���������� ã�� �ε����� ����ȴ�.
				//�ѹ����� ���� find�ε������� ������������ ���� �ε����� ����ȴ�.
				}
			}
			//min [idx~���� ���������� Ž������ �ּҰ�]
			//find [ �� min value�� idx]
			System.out.println(find+" : "+data[find]+" , "+min);
			/*if(find==idx)
				continue;*/
			int keep=data[idx];
			data[idx]=min;//data[find]
			data[find]=keep;//���������� ã�� �ε��� ��ġ�� �ٲ�� �� �ε����� �ִ´�.
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
		data[3]=data[0];//�ᱹ�� �Ȱ�������.
		data[0]=keep;

		/*	int find=5;
	for(int idx=6;idx<data.length;idx++) {
		if(data[idx]>data[find])
			find=idx;
	}
	System.out.println(find);*/
	}
}
