
public class Source04 {

	public static void main(String[] args) {
		//�� ���� ����ø� �Ǵµ�, �����ε��� ���Ѽ� ����.
		//�μ���������
		//2��¥���� ù��° ���ڷ� �ѱ䰪����, �ι�° ���ڷ� �ѱ� �������� ��
		//1��¥���� 0���� �ش�������� ��.
		int t1=(int)(Math.random()*10);//20 59
		int t2=1+(int)(Math.random()*10);

		int result=sum(t1,t2);
		System.out.println(t1+"����"+t2+"������ ���� ?"+result);

		int idx="�����ٶ󸶹ٻ�".indexOf("��");
		System.out.println(idx);//���� �����͸� ��������� -1�̳��´�.
	}
	static int sum(int a) {
		int sum=0;
		for(int i=0;i<=a;i=i+1) {//������ t1�� �۴ٰ� �����ϰ� �����ϴ°�
			sum+=i;
		}
		return sum;
	}
	static int sum(int a,int b) {
		if(a==0)
			return sum(b);
		/**/if(a>b) {//t1�� t2���� Ŭ���
			int sub=a;//�ΰ��� �ڸ��� �ٲ۴�.
			a=b;
			b=sub;
		}
		int sum=0;
		for(int i=a;i<=b;i=i+1) {//������ t1�� �۴ٰ� �����ϰ� �����ϴ°�
			sum+=i;
		}
		return sum;
	}
	/*static int sum(int end) {
		return sum(0,end);

	}*/
	/*static int sum(int start, int end) {
		if(end<start||start<0)
			return -1; //-1�� ���Ƿ� ���� �������...(üũ������)
		int s=0;
		for(int i=start;i<=end;i++) {
			s+=i;
		}
		return s;
	}*/


}
