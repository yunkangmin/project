
public class Study13Plus {

	public static void main(String[] args) {
		System.currentTimeMillis();//long�� ������
		Math.random();//0.0<= x<1.0������ ������
		double t=Math.random();
		System.out.println(t);
		//�Ϸ��� �� �ʸ� 1.0���� ���� �������� Ȯ���� ��ġ�� 1�� ���� �� ���������̸� 
		int total=(int)(t*3600*24);
		System.out.println(total);
		int hour=total/3600;
		total-=hour*3600;
		int minute=total/60;
		total-=minute*60;
		int second=total;
		
		System.out.println(hour+" "+minute+" "+second);
		//�̼�ġ�� 1���̶�� ���� ������� ����ΰ�?
		
		int a,b;
		a=400;
		b=900;
		System.out.println((((double)(b-a)/a)*100)+" "+(b-a));
		
		int c=50000000;
		double d=9/100.0;
		System.out.println(d);
		int rt=(int)((c/((1-1/(1+d))/d))+0.5);
		System.out.println("�������: "+c+" "+"�� ��������: "+(rt-c));
	}

}
