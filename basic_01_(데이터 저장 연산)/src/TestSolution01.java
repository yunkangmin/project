
public class TestSolution01 {

	public static void main(String[] args) {
		
		System.out.println(1.0/4.0);
		//Ȯ���� �� ���� ��ġ�� ��ȭ���� ��ȭ���� �ۼ�Ʈ�� ���϶�.
		int a, b;
		a=29100;
		b=30500;
		int gap=b-a;
		double r1=gap/a;//�����ü�� ��������
		double r2=(double)gap/a;
		double r3=gap/a*1.0;//������ �켱������ �տ� ���� ���� ���ȴ�.
		double r4=(double)(gap/a);//�����ü�� ������ ��� �װ��� ���� �ִ´�
		r2*=100;
		System.out.println(r2);
		System.out.println(r2 /0.01);
		System.out.println(r2 % 0.01);
		System.out.println("=========");
		r2-=r2%0.01; //�Ǽ� ���� �����߻� ��Ȯ���� ����
		System.out.println(r2);
		System.out.println((int)(r2*100)/100.0);//0.00000�� �ٳ��´�.
		
		System.out.println(a+"-->"+b);
		System.out.println("��ȭ��: "+gap+"("+r2+"%��ȭ)");
		
		
		int m=100;
		double e=32.45;
		int em= (int)(m*e/100+0.5);
		System.out.println("�����:"+m+"������:"+e);
		System.out.println("��������:"+em);
		double w=7%3.0;
		System.out.println(w);

	}

}
