/*
 * �б� �帧 ������ ���Ǵ� ����
 * if �ܿ� switch��� �͵� ������.
 * if -������ ���¿� ���� �б� �帧
 * switch -������ ���� ���� �б� �帧.
 *  switch ó���� ������ �����ʹ� ��ġ�� ������ , ���ڿ� ������, (+ Enum������)
 *  
 * */
public class Source06 {

	public static void main(String[] args) {
		int val=4;
		
		switch(val) {
		default:
			System.out.println("DEFAULT");
			break;
		case 4:
			System.out.println("CASE 4 -STEP!!");
			System.out.println("CASE 4 -STEP!!");
			break;
		case 1://�ݷ� ���� ��Ȯ�� �� ����
			System.out.println("CASE 1");
			//��Ȯ�� ���� ���� �бⰡ �Ͼ��
		}
		//switch ���� �ش� case���� �����ؼ� �� �����(default switch�� �帧)
		//case�� ó���� �ʿ��ϸ�, break��� Ű���带 �̿��ؼ� ����
		//��������ϰ� alt ȭ��ǥ ���Ʒ�
		//Ư�� case�� ������ �����͵��� default case�� ó���� ��.
		//���� case ���� �Ұ���.
		System.out.println("END");
		//if(val>4){}
		String mode="action";
		switch(mode) {
		case "comedy":
		break;
		case "romance":
			break;
		default:
			//�� ������ �׿���  break�� �� �ʿ�� ���� ������ �������̾ ������.
		}//���������� �Ұ��ϴ�. ����϶� �����϶�
	
	}

}
