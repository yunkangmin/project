
public class Source10 {

	public static void main(String[] args) {
		// do ~ while
		//��� 3���� ������ �����ٲ��� , ��������
		int t1, t2, t3;
		//�ݺ��۾��� �̿��ؼ� t1, t2, t3�� ������ �����ϴµ� (1~3)���̷� , ��ġ�� �ȵ�
		//
		
		t1=1+(int)(Math.random()*3);
		t2=1+(int)(Math.random()*3);
		t3=1+(int)(Math.random()*3);
		
		int nu=0;
		
		while(t1==t2||t1==t3||t2==t3) {
			++nu;
			t1=1+(int)(Math.random()*3);
			t2=1+(int)(Math.random()*3);
			t3=1+(int)(Math.random()*3);
			
		}
		//���ڸ� �̰� ���࿡ �ϳ��� ���� ���� ������ �ִٸ� �������� 
		//�ٽ� ���ڸ� �̴´�. �ϳ��� �����̶� ���� ���� ������
		System.out.println("�����1�� "+t1+" ��.");
		System.out.println("�����2�� "+t2+" ��.");
		System.out.println("�����3�� "+t3+" ��.");
		System.out.println("����3���� �����ϴ� �۾��� �� ���?"+nu);
		
		
	}

}
