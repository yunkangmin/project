
public class Source09Plus {

	public static void main(String[] args) {
		int lv=3+(int)(Math.random()*7);
		int rem=(1+(int)(Math.random()*4))*100;
		
		System.out.println("���� VIP "+lv+"�ܰ��̸� , ����Ʈ"+rem+"������");
		//������� ���°� �̷� ��, �� �󸶸� �����ؼ� �� ���±��� �ӳ�?
		//
		int charge=0;
		while(lv>=1) {
			charge+=lv*500;
			lv--;
		}
		charge+=rem;
		System.out.println("�� ������ : "+charge);
	}

}
