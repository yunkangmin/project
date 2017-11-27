
public class Source04 {

	public static void main(String[] args) {
		//두 개를 만드시면 되는데, 오버로딩을 시켜서 구현.
		//두수사이의합
		//2개짜리는 첫번째 인자로 넘긴값부터, 두번째 인자로 넘긴 값까지의 합
		//1개짜리는 0부터 해당수까지의 합.
		int t1=(int)(Math.random()*10);//20 59
		int t2=1+(int)(Math.random()*10);

		int result=sum(t1,t2);
		System.out.println(t1+"부터"+t2+"사이의 합은 ?"+result);

		int idx="가나다라마바사".indexOf("가");
		System.out.println(idx);//없는 데이터를 집어넣으면 -1이나온다.
	}
	static int sum(int a) {
		int sum=0;
		for(int i=0;i<=a;i=i+1) {//무조건 t1이 작다고 생각하고 실행하는것
			sum+=i;
		}
		return sum;
	}
	static int sum(int a,int b) {
		if(a==0)
			return sum(b);
		/**/if(a>b) {//t1이 t2보다 클경우
			int sub=a;//두개의 자리를 바꾼다.
			a=b;
			b=sub;
		}
		int sum=0;
		for(int i=a;i<=b;i=i+1) {//무조건 t1이 작다고 생각하고 실행하는것
			sum+=i;
		}
		return sum;
	}
	/*static int sum(int end) {
		return sum(0,end);

	}*/
	/*static int sum(int start, int end) {
		if(end<start||start<0)
			return -1; //-1은 임의로 룰을 만든거임...(체크용으로)
		int s=0;
		for(int i=start;i<=end;i++) {
			s+=i;
		}
		return s;
	}*/


}
