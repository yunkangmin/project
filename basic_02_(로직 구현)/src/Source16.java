
public class Source16 {

	public static void main(String[] args) {
		//break�� �ݺ����� �� ��� ���� ��.
/*		int aim=100;
		for(int cnt=1;cnt<10;cnt++) {
			int gain=7+(int)(Math.random()*15);//7 21
			System.out.println(cnt+"turn..."+gain);
			aim-=gain;
			System.out.println("left aim = "+aim);
			if(aim<=0) {
				System.out.println("  enough !!");
				break;//�ݸ��� ����������
			}
		}
		System.out.println("terminate");
		*/
		int target=(int)(Math.random()*50);
		System.out.println(target);//�� ���ڸ� 2����ȯ�ϸ� ���� 1�θ� �����Ǵ��� Ȯ��
		String result="";
		int b=0;
		while(target>0) {
			int n=target%2;
			if(n==0) {
				b++;
				break;
			}
			target/=2;
		}
		if(b==0) {
			System.out.println("1�θ� ������");
		}
		else {
			System.out.println("0�� ��");
		}
	}
	//õ�� �ڸ�  ����4�� �߿� 7�� ��� ������ Ȯ��
	//7�� �ִ��� �������� �߿� �̶� break�� ���δ�.
	//break�� ��ġ�� �������
	//continue�� �� ���������� ������ �ʿ䰡 ����.
	//�߰��߰��� �־��ָ� �ȴ�.
}
