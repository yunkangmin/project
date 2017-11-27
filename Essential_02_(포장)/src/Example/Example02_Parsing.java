package Example;
import java.util.Arrays;

public class Example02_Parsing {

	public static void main(String[] args) {
		String data="124347";
		
		int pdata=Integer.parseInt(data);
		System.out.println(pdata);
		
		//10진수로만 계산
		char[]ar=data.toCharArray();
		int[] iar=new int[ar.length];
		int result=0;
		for(int idx=ar.length-1;idx>=0;idx--) {
			System.out.println(idx+"=>"+ar[idx]);
			//result+=ar[idx];
			iar[idx]=ar[idx]-48;
			//result+=(ar[idx]-48);
		}
		System.out.println('0'-48==0);
		
		for(int i=0;i<iar.length;i++) {
			result+=iar[i]*Math.pow(10, i);
		}
		System.out.println(Arrays.toString(iar));
		System.out.println(result);
		
	}

}
