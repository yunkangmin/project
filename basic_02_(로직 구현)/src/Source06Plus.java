
public class Source06Plus {

	public static void main(String[] args) {
		//�Ϲ������� switch ~case�� break�� �̿��ؼ�, ���̽��� �۾� �����ϴ� ���°� ������
		//�� break�� ��� �Ǵ� �� �ƴ�. �� ���¸� ���캸��
		int t=7;
		char c='A';
		int s=1;//������ �����ΰ�?T:t*t*t , D:t*t, S:t
		//break����
		//������ ū�ͺ��� �����ϸ� break�� ��� �ȴ�.
		//break�� ����� �Ǵ� �Ǿƴϴ�.
		switch(c) {
		default:
			s=999;
			break;
		case 'T': 
		case 't'://�ҹ��ڿ� �빮�ڸ�� �ش�
			s*=t;
		case 'D':
			s*=t;
		case 'S':
			s*=t;
		}
		System.out.println(s);
		//Ư���� N�� D������ ���ϴ� ���?
		//int�� ���� �ϳ��� 1�����صΰ�, �� ����*=N�۾��� D�� ��Ű�� ��.
	}

}
