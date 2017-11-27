
public class Study07 {

	public static void main(String[] args) {
		long a=System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis()/(1000L*60*60*24*365));
		System.out.println(System.currentTimeMillis()/(1000.0*60*60*24*365));
		for(int i = 0;i<100000000;i++) {
			long sum=0;
			sum+=i;
			
			
			
		}
		long b=System.currentTimeMillis();
		System.out.println(b-a);
	}

}
