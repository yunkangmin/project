
public class Source05 {
	//메서드 작동할대 매개변수로 데이터가 카피되서 작동함.
	static int sum(int start,int end) {
		int r=0;
		while(start<=end) {
			
			r+=start++;
		}
		return r;
		
	}
	public static void main(String[] args) {
		int z=sum(1,10);
		System.out.println(z);
		
		int a=11;
		int b=13;
		
		int zz=sum(a,b);
		System.out.println(zz);
		
		System.out.println("a ?"+a);
		

	}

}
