import java.util.Arrays;

public class Source09_Array {
public static void main(String[] args) {
	int[]data=new int[] {300,200,1000,400,300,700,300,500};//2400
	int[]maxs=new int[data.length];
	//���� for�� �̿��ؼ�..
	//0�� ������(����)���Ŀ� �����ϴ� ������ �ְ�
	//1�� ������ (����)���Ŀ� �����ϴ� ������ �ְ�
	//2�� ������(����)���Ŀ� �����ϴ� ������ �ְ�
	//���ο� �迭�� ����
	 
	 int tmp = 0;
	 for(int i=0;i<data.length;i++) {
		 //data[0]..[7]
		 int max=data[i];//0�̶��?
		 //��ó���� 2000�̶�� ���� ����� �ȳ��´�.
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
	 //Ŭ���ؼ� �����ϸ�ȴ�.
}
}
