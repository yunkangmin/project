
public class Source02Plus {

	public static void main(String[] args) {
		//int�� �����͵��� 3���� ��� ��û ���� �߻��ϴ� ��Ȳ��.
		//��ȿ�� üũ�� �Ϸ��� ��.(�ϳ��� ��ġ�� ERROR,�� �ٸ��� VALID)
		//�̰� ���� ����ص� �ǰ����� , procedure�� ���� ó���Ҳ���.
		//������ �۾��� procedure�� �ϸ� �����Ҷ� ����.
		//�����غ���
		//�޼�������� �׻� �ҹ��ڷ� ����
		//����ܾ�� �빮�ڷ� 
		//�̸��� �ǹ��ְ� �۸�����
		for(int i=0;i<10;i++) {
			int a=1+(int)(Math.random()*10);
			int b=1+(int)(Math.random()*10);
			int c=1+(int)(Math.random()*10);
			boolean ture=valid(a,b,c);
			System.out.println(a+" "+b+" "+c);
			if(ture)
				System.out.println("ERROR\n");
			else
				System.out.println("VALID\n");
		}
		//int�� �����͵� ���� , �ּҰ����(LCM) , �ִ� �����(GCD)�� ���ؼ� ó���� �ؾߵ� ���� ����
		//�޼ҵ���ӿ� ���ڴ� �� �빮�ڷ��Ѵ�.
		int lcm= chooseLCM(12,15);
		System.out.println("�ּҰ������ " + lcm + "�Դϴ� ");
		int gcd= chooseGCD(15,12);
		if (gcd == 1) {// i�� 1�̶�� �ǹ̴� �ִ������� ���ٴ� ���Դϴ�..
			System.out.println("�ִ������� �����ϴ�.");
		}
		else {
			// i�� 1�� �ƴ� ���̸�, �ִ������� �ٷ� i �Դϴ�..
			System.out.println("�ִ������� " + gcd + "�Դϴ�.");
		}//else
		System.out.println(chooseLCM(8,12));
		System.out.println(chooseLCM2(8,12));
	}
	static boolean valid(int a,int b, int c) {
		return a==b||a==c||b==c;
		//return a!=b&&a!=c&&b!=c;
		/*boolean r=false;
		if(a!=b&&a!=c&&b!=c)
			r=true;
		return r;*/

	}
	static int  chooseLCM2(int a,int b) {
	//�ּ� ������� ���ϴ� ������ ����. �ִ� ������� �˸� ���� ���Ҽ� ����.
	//�ִ�����*(a/�ִ�����)*(b/�ִ�����)
		int gcd=chooseGCD(a,b);
		//int gcd=chooseLCM2(a,b); �Ѵٸ�, recursive(���)�� �Ͼ��.
		return gcd*(a/gcd)*(b/gcd);
	}
	static int  chooseLCM(int t1,int t2) {
		/*int i;
		for (i = 1; i <= t2 * t1; i++) {
			if ((i % t1 == 0) && (i % t2 == 0)) {
				// i�� 1���� �����ؼ� n*m���� ���鼭
				// n���ε� ������ ����, m���ε� ������ ����, break(����)
				break;
			}
		}*///for
		/*int rst=t1;
		for(int val=t1; ;val++) {
			if(val%t1==0&&val%t2==0) {
				rst=val;
				break;
			}
		}
		return rst;*/
		/**/
	/*	for(int val=t1; ;val++) {
			if(val%t1==0&&val%t2==0) {
				return val;
			}
		}*/
		
		int val=t1;
		while(true) {
			if(val%t1==0&&val%t2==0) {
				break;
			}else {
			val++;
			}
		}
		return val;
	//�� �� �߿� ��� ���� �������� �ϴ��� �� �� ��� ���������� ������ �� ū���� �������.
	}
	static int  chooseGCD(int t1,int t2) {
		/*int i;
		for (i = t1; i >= 1; i--) {
			if ((t2 % i == 0) && (t1 % i == 0)) {
				break;
			}
		}//for
		return i;*/
		/**/int r=1;
		for(int val=2;val<=t1;val++) {
			if(t1%val==0&&t2%val==0) {
				r=val;
			}
		}
		//�� �� �߿� �ϳ��� �Ѿ�� �ش� �μ��� �ȳ������� ������ �Ѱ谪�� �μ��� �ƹ� ����
		//�����Ѱ�
		/*int r=t1;
		for(int val=t1;val>=1;val--) {
			if(t1%val==0&&t2%val==0) {
				r=val;
				break;
			}
		}*/
		return r;
	}
	//���Լ� ��� ���߿� ���� Ŀ�� �Ȱ��� ���� ���´�.
	
}
