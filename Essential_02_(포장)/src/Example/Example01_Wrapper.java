package Example;

import java.util.Arrays;

public class Example01_Wrapper {

	public static void main(String[] args) {
		Integer[] is=new Integer[10];//Integer배열 10개를 만듦
		//null이 들어가있다.
		int sum=0;
		for(int cnt=1;cnt<=is.length;cnt++) {
			
			int n=10+(int)(Math.random()*90);
			int ridx=(int)(Math.random()*is.length);
			//똑같은 곳에 값을 다시 값을 집어넣을수도 있고
			//값을 넣지 않은곳이 있을 수도 있다.
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
		//Integer배열의 합을 구하세요.
		
	}

}
