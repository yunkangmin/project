package Example;

import java.util.Arrays;

public class Example01_Wrapper {

	public static void main(String[] args) {
		Integer[] is=new Integer[10];//Integer�迭 10���� ����
		//null�� ���ִ�.
		int sum=0;
		for(int cnt=1;cnt<=is.length;cnt++) {
			
			int n=10+(int)(Math.random()*90);
			int ridx=(int)(Math.random()*is.length);
			//�Ȱ��� ���� ���� �ٽ� ���� ����������� �ְ�
			//���� ���� �������� ���� ���� �ִ�.
			is[ridx]=n;//new Integer(n).....Integer.valueOf(n);
			/*if(is[ridx]!=null)
			sum+=is[ridx];*/
		}
		String s=Arrays.toString(is);
		System.out.println(s);
		int sum1=0;
		for(int idx=0;idx<is.length;idx++) {
			//sum+=is[idx].intValue();
			if(is[idx]!=null)
			sum1+=is[idx];
		}
		System.out.println(sum1);
		//Integer�迭�� ���� ���ϼ���.
		
	}

}
