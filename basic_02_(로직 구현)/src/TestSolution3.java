
public class TestSolution3 {

	public static void main(String[] args) {
		//0�� 1�� ��������
		//�ڱ� �տ��ִ� ���ڸ� ���س�����.
		//0 1 1 2 3 5 8 13 21 34 55
		int n1=0;
		int n2=1;
		int sum;

		for(int i=1;i<=10;i++) {
			if(i==1) {
				System.out.println("1��°�� �� : "+n1);
			}
			else if(i==2) {
				System.out.println("2��°�� �� : "+n2);
			}
			else {
				sum=n1+n2;
				System.out.println(i+"��°�� �� : "+sum);
				n1=n2;
				n2=sum;
			}
		}

		//5���� 1~10������ ���������� �̾Ƴ��� �۾��� �����ؼ� ���� ���ڵ��� ���
		//�� �ݺ��� ������ �� ��, ���� ū ���� Ư�������� ������ �Ǿ��հ� ����.
		//do ~while
		int d=0;
		int a,b,c;
		int sum1 ,sum2;
		do{
			a=1+(int)(Math.random()*10);
			b=1+(int)(Math.random()*10);
			c=1+(int)(Math.random()*10);
			sum2=a+b+c;
			if(d==0) {
				sum1=a+b+c;
			}
			sum1=sum1>sum2?sum1:sum2;
		}while(d<5);
		/*if()
			System.out.println(a+" "+b+" "+c);*/

	}

}
