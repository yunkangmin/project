import java.util.Date;

public class Source08_Date_USE {

	public static void main(String[] args) {
		Date b= new Date(0);//default������ System.currentTimeMillis()�� ������
		//���������� 0�� ������ 9�ð� ���´�.
		System.out.println(b.toString());
		b.setYear(90);//1900+@
		//������ �����ڰ� ����� �ȵɰ����� �˰� ����ڿ��� ������������ ǥ���صа�
		//�ٵ� ����� �����ϴ�.
		System.out.println(b.toString());
		b.setMonth(11);//JAN:0~DEC 11
		System.out.println();
		b.setDate(17);//1
		b.setHours(8);
		b.setMinutes(18);
		System.out.println(b.toString());
		long elapse=System.currentTimeMillis(); //b-fastTime
		System.out.println(elapse);
		//��������ü�� ���������Ҽ� ���⿡ �޼ҵ带 �̿��Ͽ� �����͸� ��������
		//��Ű�� ����, ����Ʈ, ��ü�ȿ� �ʵ带 �Ժη� ���� ����, ����������, �þ�
		//private public protected default 
		//�����ͺ�ȣ�� ���ؼ� ���۵�����
		//�޼ҵ�� �տ� public�� �ٿ��� Ÿ ��Ű�������� ��밡���ϴ�.
		
		
	}

}
