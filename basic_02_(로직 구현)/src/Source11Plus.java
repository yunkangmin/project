
public class Source11Plus {

	public static void main(String[] args) {
		//Ư���� N�� D������ ���غ��� -for loop�� ����ؼ�

		/*	int n=2+(int)(Math.random()*4);//2-5
		int d=3+(int)(Math.random()*5);//3-7
		int result=1;
		for(int cnt=0;cnt<d;cnt++) {
			result*=n;
		}
		System.out.println(n+" �� "+d+" ����(��) ��? "+result);*/

		//������ ����� ������ ó���ϸ� �ȴ�.
		//if else�� ����
		int n=2+(int)(Math.random()*4);//2~5
		int d=-3+(int)(Math.random()*7);//-3 ~ 3
		double result=1;//int�� �ȵȴ�.
		if(d>0) {
			for(int cnt=0;cnt<d;cnt++) {
				result*=n;
			}
		}
		else {
			for(int cnt=0;cnt<-d;cnt++) {
				result/=n;
			}
		}
		System.out.println(n+" �� "+d+" ����(��) ��? "+result);
		double p=Math.pow(n, d);//n�� d������ �����ִ� ���.
		System.out.println(p);
		//d�� 0�� ��� �׳� 1�� ���´�.
	}

}
