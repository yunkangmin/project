
public class TestSolution04 {

	public static void main(String[] args) {
		//�ڹٽ�ũ��Ʈ
		int price=(100+(int)(Math.random()*100))*1000;//���Ű���
		int sale=1+(int)(Math.random()*9);//���� ���� �ۼ�Ʈ
		boolean vip=Math.random()>0.5;//����Ȯ��
	/*	int cupone=(int)((price*sale)/100);
		int finalprice1=price-cupone;*/
		int plus=vip?5:0;
		int last=plus+sale>10?10:plus+sale;
		int discount=(int)(price*(last/100.0));//�Ǽ������̹Ƿ� �Ҽ��� ���� ���� �Ҽ����� �����Ƿ� �������� �ݾ�
		int payment=price-discount;
		int save=(int)(payment*0.05);
		//���Ű��ݿ� ������ ��
		//1 ��������(1~10%)
		//2.vip(+5%)
		//�ΰ� ��������(�ջ�Ǽ�)�� �� but�ִ� 10%��Ʈ
		//��������� ������ �����̵Ǵµ� ���Ž� �̰����� 5%��ŭ�� ������ ������.
		//�� ������ �����ϴ� ��� �ٷ� �� ��������� ���ݿ��� �������� �����Ҽ� ����.
		//���� ���űݾ��� ������ 5�ۼ�Ʈ�� �Ǵµ� �̰� �������
		System.out.println(price+" / "+sale+" / "+vip);
		System.out.println("�������� (%): "+last);
		System.out.println("���αݾ� (��): "+discount);
		System.out.println("�����ݾ� (��): "+payment);
		System.out.println("������ (��): "+save);
		//�������� ����ȴٸ� save���� payment�� ����ȴ�
		
		
		
		
		//�ʿ��� �����͸� ��� ���
		//3���� ��� ���� ����� ������ �����ݾ�  ������
		//�����ݾ�-������

	}

}
