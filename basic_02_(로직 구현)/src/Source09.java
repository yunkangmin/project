
public class Source09 {

	public static void main(String[] args) {
		//vip (������)
		int lv=1;
		int charge=1+(int)(Math.random()*50)*100;//100~5000
		
		System.out.println("VIP"+lv+"�ܰ迡�� "+charge+"�� ������");
		//�� ����� vip����� �ö󰡴°�?
		//�ܰ�� ���׷��̵忡 �ʿ��� ��ġ��?lv*500
		//1->2:500, 2->3:1000, 3->4:1500
		//vip�ø��� charge����
		//�� ����� vip ��? ���� ��/ ���� ���� ���� �߰� �ʿ��� �����ݾ�?
		while(charge>=lv*500) {
			charge-=lv*500;
			lv++;
			
		}
		System.out.println("VIP"+lv);
		System.out.println("REMAIN :"+charge);
		System.out.println("MORE :"+(lv*500-charge));
	}

}
