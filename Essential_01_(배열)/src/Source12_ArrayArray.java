import java.util.Arrays;

class Generator{
	//����ƮŬ������ �ۺ��� �ٿ����� �ܺο��� ������ �ȵȴ�.
	public static int [] singleArray() {
		int []ar=new int[1+(int)(Math.random()*10)];
		for(int i=0;i<ar.length;i++) {
			ar[i]=1+(int)(Math.random()*10);
		}//����ũ���� 1�����迭�� �����.�׸��� �ű⿡ �����͸� �����Ѵ�.�׸��� ����
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
		System.out.println("���� ���̰� �� �迭�ε���: "+num);
		int sum=0;
		for(int i=0;i<sample[num].length;i++) {
			sum+=sample[num][i];
		}
		System.out.println("���� ���̰� ū �迭�� ���ڵ��� ��: "+sum);

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
		//����Ȳ�� ���ؼ� �ִ���� �����Ѵ�.
		for(int col=0;col<maxlen;col++) {//���� �� �迭 ���̱���
			int sum1=0;
			for(int row=0;row<sample.length;row++) {
				//if(col<sample[row].length)
					//col�� �������� row���� �����ϸ鼭 �ش�row���� col����col��
					//ũ�ٸ� �� �ش�row���� �ǳʶڴ�.
				/**/if(col>sample[row].length)
					continue;//�ϸ�ȵȴ�.
				sum1+=sample[row][col];//row���� ���Ѵ�.
			}
			colSum[col]=sum1;
		}
		System.out.println(Arrays.toString(colSum));
		//���̰� �������� �ʴٴ� ���� ����
		//���� ���̰� ū �迭�� ����
		//int 5ĭ¥�� �迭�� ����..
		//��ĭ�� �ش�row�� ���� ����.
		//�� �÷����� ���� ������ ũ���� �迭�� ����, ����
	}
}
