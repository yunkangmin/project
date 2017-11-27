
public class TestSolution01 {

	public static void main(String[] args) {
		
		System.out.println(1.0/4.0);
		//확보된 두 개의 수치의 변화량과 변화폭을 퍼센트로 구하라.
		int a, b;
		a=29100;
		b=30500;
		int gap=b-a;
		double r1=gap/a;//계산자체가 정수연산
		double r2=(double)gap/a;
		double r3=gap/a*1.0;//연산자 우선순위로 앞에 것이 먼저 계산된다.
		double r4=(double)(gap/a);//계산자체는 정수로 계산 그값을 더블에 넣는다
		r2*=100;
		System.out.println(r2);
		System.out.println(r2 /0.01);
		System.out.println(r2 % 0.01);
		System.out.println("=========");
		r2-=r2%0.01; //실수 연산 오차발생 정확하지 않음
		System.out.println(r2);
		System.out.println((int)(r2*100)/100.0);//0.00000이 다나온다.
		
		System.out.println(a+"-->"+b);
		System.out.println("변화량: "+gap+"("+r2+"%변화)");
		
		
		int m=100;
		double e=32.45;
		int em= (int)(m*e/100+0.5);
		System.out.println("대출금:"+m+"이자율:"+e);
		System.out.println("대출이자:"+em);
		double w=7%3.0;
		System.out.println(w);

	}

}
