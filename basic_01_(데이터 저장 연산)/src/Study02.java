
public class Study02 {

	public static void main(String[] args) {
		System.out.println(10);//a�ȵȴ�
		System.out.println(010);//8���� 8�ȵȴ�.
		System.out.println(0b10);//2���� 2�ȵȴ�
		System.out.println(0x10);

		System.out.println(10_000_000);
		//�������
		System.out.println(10+10);
		System.out.println(10-5);
		System.out.println(0b10*10);
		System.out.println(30/0b11);
		
		System.out.println(30%4);//����������
		System.out.println(30/4);//������������ �� ���´�.
		//��Ʈ����&,|,^
		System.out.println(3&4);
		System.out.println(0b11&0b10);
		
		System.out.println(11|10);
		System.out.println(0b10010|0b11001);
		System.out.println(0b11011);
		
		System.out.println(0b10010^0b11001);
		//����Ʈ����
		System.out.println(5<<2);
		System.out.println(0b101<<2);
		
		System.out.println(0b1000<<1);
	}

}
