/*
 * �迭 �ٷﺸ��
 * 
 */
import java.util.Arrays;
public class Source05_Array {
	public static void main(String[] args) {
		//���õ����͸� �����ΰ� ó��
		//�迭�� 0�̻��̸� ��.
		boolean[]sample=new boolean[0];//0ĭ¥�� �迭�� ���簡��
		sample=null;
		//System.out.println(sample.length);//������.
		//System.out.println(Arrays.toString(sample));
		//int�� ������ ������ 5ĭ :idx 0~4�� �����Ǿ���������.
		for(int cnt=1;cnt<=3;cnt++) {
			int rd=(int)(Math.random()*sample.length);
			if(sample[rd]) {
				cnt--;
				continue;
			}
			sample[rd]=true;
			System.out.println("try"+cnt+"done");
			//�������� �������� �ִ�.
		}
		System.out.println(sample);//�迭��ü��
		String s=Arrays.toString(sample);//�迭�ȿ� ���� ���� ������ش�.
		System.out.println(s);
		//toString()�� �� �ڷ������� �����ε��� �Ǿ��ִ�.
		//�� ��Ȳ�� �̹� ������ ���� ���� ������� �ʾƼ� ������ 3���� ������ ��������
		//�̰� ���� ������ �����ؼ� �ݺ�ó���� ������ ���� �����Ѱ� 3���� �ݵ�� true�� ����.
	}
}
