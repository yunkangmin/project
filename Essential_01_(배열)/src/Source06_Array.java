import java.util.Arrays;

public class Source06_Array {

	public static void main(String[] args) {
		int[]ar=new int[] {3,5,11,55,4};//0~(ar.length-1)
		System.out.println(ar[2]);
		for(int room=0;room<=ar.length-1;room++) {
			System.out.println(room+"�� "+ar[room]);
		}
		int room=3;
		System.out.println(room+": "+ar[room]);//�迭�� idx�� ����ó�� ����
		
		int[]datas=new int[7];
		for(int idx=0;idx<datas.length;idx++) {
			datas[idx]=1+(int)(Math.random()*15);
			
		}
		System.out.println(Arrays.toString(datas));
		//����Ÿ���� �迭�� ���� ó�������ϰ� �����ε� �Ǿ�����.
		int target=1+(int)(Math.random()*20);
		System.out.println("ó���ؾߵ� ������ = "+target);
		boolean b=false;
		for(int i=0;i<datas.length;i++) {
			b=(datas[i]==target);
			if(b) 
				break;
		}
		System.out.println(target+"�� ���� ���� �ִ°�? "+b);
		int cnt=0;
		for(int i=0;i<datas.length;i++) {
			if(datas[i]>target)
				cnt++;
		}
		System.out.println(target+"���� ū ���� ��ΰ�? "+cnt);
		//datas�迭�� �����Ǵ� �������߿�, target�̶� ���� �����Ͱ� �����ϴ���?boolean
		//datas �迭�� �����Ǵ� �������߿� target���� ū �����ʹ� ��ΰ�?
	}

}
