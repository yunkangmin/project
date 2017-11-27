import java.util.Arrays;

public class Source06_Array {

	public static void main(String[] args) {
		int[]ar=new int[] {3,5,11,55,4};//0~(ar.length-1)
		System.out.println(ar[2]);
		for(int room=0;room<=ar.length-1;room++) {
			System.out.println(room+"→ "+ar[room]);
		}
		int room=3;
		System.out.println(room+": "+ar[room]);//배열의 idx로 변수처리 가능
		
		int[]datas=new int[7];
		for(int idx=0;idx<datas.length;idx++) {
			datas[idx]=1+(int)(Math.random()*15);
			
		}
		System.out.println(Arrays.toString(datas));
		//각종타입의 배열에 대해 처리가능하게 오버로드 되어있음.
		int target=1+(int)(Math.random()*20);
		System.out.println("처리해야될 데이터 = "+target);
		boolean b=false;
		for(int i=0;i<datas.length;i++) {
			b=(datas[i]==target);
			if(b) 
				break;
		}
		System.out.println(target+"과 같은 것이 있는가? "+b);
		int cnt=0;
		for(int i=0;i<datas.length;i++) {
			if(datas[i]>target)
				cnt++;
		}
		System.out.println(target+"보다 큰 수는 몇개인가? "+cnt);
		//datas배열로 관리되는 데이터중에, target이랑 같은 데이터가 존재하는지?boolean
		//datas 배열로 관리되는 데이터중에 target보다 큰 데이터는 몇개인가?
	}

}
