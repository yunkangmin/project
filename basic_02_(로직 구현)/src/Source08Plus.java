
public class Source08Plus {

	public static void main(String[] args) {
		int r=(int)(Math.random()*10000);
		int cr=r;
		System.out.println("랜덤수치="+r);
		//구해야되는 데이터 : 각 자리수의 합, 몇자리수 인가?
		//0~9999 0~9:10 10~99:90 100~999:900 1000~9999:9000 0.1%
		int count=0;
		int result=0;//각자리숫자의 합
		while(cr>0) {
			int n=cr%10;
			System.out.println(n+"..");
			int p=cr/10;
			result+=n;//나머지를 더해야한다.
			cr=p;//r/=10;
			count++;//자리수
		}
		System.out.println("랜덤수치="+r);//카피뜨기
		System.out.println(result+" "+count);
	}

}
