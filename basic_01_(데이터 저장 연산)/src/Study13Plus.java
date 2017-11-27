
public class Study13Plus {

	public static void main(String[] args) {
		System.currentTimeMillis();//long형 정수값
		Math.random();//0.0<= x<1.0사이의 랜덤값
		double t=Math.random();
		System.out.println(t);
		//하루의 총 초를 1.0으로 보고 랜덤으로 확보한 수치는 1일 기준 총 몇초정도이며 
		int total=(int)(t*3600*24);
		System.out.println(total);
		int hour=total/3600;
		total-=hour*3600;
		int minute=total/60;
		total-=minute*60;
		int second=total;
		
		System.out.println(hour+" "+minute+" "+second);
		//이수치를 1년이라고 보고 몇월몇일 몇시인가?
		
		int a,b;
		a=400;
		b=900;
		System.out.println((((double)(b-a)/a)*100)+" "+(b-a));
		
		int c=50000000;
		double d=9/100.0;
		System.out.println(d);
		int rt=(int)((c/((1-1/(1+d))/d))+0.5);
		System.out.println("대출원금: "+c+" "+"총 대출이자: "+(rt-c));
	}

}
