
public class Source12Plus {

	public static void main(String[] args) {
		int t1=20+(int)(Math.random()*40);//20 59
		int t2=20+(int)(Math.random()*40);
		//�� ���� ������ ��
		System.out.println(t1+"~"+t2+"������ ������(��������)=");
		int sum=0;
		
		int small=t1<t2?t1:t2;//��ǻ�Ͱ� �Ⱦ��Ҽ��� �ִ� ��¶�� ������ ����ǹǷ�
		int big=t1>t2?t1:t2;
		/*for(int i=small;i<=big;i=i+1) {//������ t1�� �۴ٰ� �����ϰ� �����ϴ°�
			sum+=i;
		}*/
		//t1�� t2�� ���� ���� ����ȴ�.
		/*if(t1>t2) {//t1�� t2���� Ŭ���
			int sub=t1;//�ΰ��� �ڸ��� �ٲ۴�.
			t1=t2;
			t2=sub;
		}*/
		for(int i=t1;i<=t2;i=i+1) {//������ t1�� �۴ٰ� �����ϰ� �����ϴ°�
			sum+=i;
		}
		System.out.println(sum);

		System.out.println(t1+"��"+t2+"�� ���ÿ� ������ ����߸��� ���� ���� ?");
		
		int cnt=0;
		for(int val=1;val<=small;val++) {
			if(t1%val==0&&t2%val==0) {
				System.out.println("FOUND!!"+val);
				cnt++;
			}
		}
		System.out.println("����� = "+cnt);
		/*int i;
		for (i = 1; i <= t2 * t1; i++) {
			if ((i % t1 == 0) && (i % t2 == 0)) {
				// i�� 1���� �����ؼ� n*m���� ���鼭
				// n���ε� ������ ����, m���ε� ������ ����, break(����)
				break;
			}
		}//for
		System.out.print("�ּҰ������ " + i + "�Դϴ� ");

		for (i = t1; i >= 1; i--) {
			if ((t2 % i == 0) && (t1 % i == 0)) {
				break;
			}
		}//for
		if (i == 1) {// i�� 1�̶�� �ǹ̴� �ִ������� ���ٴ� ���Դϴ�..
			System.out.print("�ִ������� �����ϴ�.");
		}
		else {
			// i�� 1�� �ƴ� ���̸�, �ִ������� �ٷ� i �Դϴ�..
			System.out.print("�ִ������� " + i + "�Դϴ�.");
		}//else
		 */


	}
}
