
public class TestSolution2 {

	public static void main(String[] args) {
		// 1970 01.01�� ������̴�

		int year = 2014;
		int month = 4;  
		int day = 5;
		// ���������ΰ�?
		// ����° �Ǵ� ���̰� ���������ΰ�? :1970.01.02�� +1��° �Ǵ³�
		/*	int tot = 49879;
		System.out.println(tot);
		System.out.println();
		System.out.println("48,879");
		System.out.println(tot / 1000 + " , " + tot % 1000);*/
		// �⵵���� ū �ƿ�
		// �������� �ȴ��� ����ؼ� 365
		// �ش翬���̴�1������ month���� ������ if 1�����̸� �󸶸� ���ϰ� �������
		
		int tot=0;
		for(int y=1970;y<year;y++) {
			if((y%100!=0&&y%4==0)||y%400==0)
			{
				tot+=366;
			}else {
				tot+=365;
			}
		}
		for(int m=1;m<month;m++) {
			if(m==2) {
				if((year%100!=0&&year%4==0)||year%400==0)
				{
					tot+=29;
				}else {
					tot+=28;
				}
			}else if(m==4||m==6||m==9||m==11){
				tot+=30;
			}else {
				tot+=31;
			}
		}
		tot+=(day-1);//�������� 0�̹Ƿ� 1�� ����.
		System.out.println(tot+"��°..");
		System.out.println(tot / 1000 + "," + tot % 1000);
		int w=tot%7;
		switch(w) {
		case 0:System.out.println("��");break;
		case 1:System.out.println("��");break;
		case 2:System.out.println("��");break;
		case 3:System.out.println("��");break;
		case 4:System.out.println("��");break;
		case 5:System.out.println("ȭ");break;
		case 6:System.out.println("��");break;
		}
	}
	//���̹������ Ȯ���ϱ� D-DAY����
	//�ٸ� ��� ī�����ϱ�
}


