
public class Study14Plus {

	public static void main(String[] args) {
		int min = 45+(int)(Math.random()*70);
		System.out.println(min);//�̷��� Ȯ���� �����͸� �̿�ð��̶�� ����
		//�̿����� 15�� ������ ����.
		//�ѽð� �̸���15�д� 1000�� 1�ð� �̻��� 15�д�800��
		//27�� 2000
		//45�� 3000
		//60�� 3200
		//61�� 4000
		//74�� 4000
		int c=min/15;
		//c+=min-(c*15)>0?1:0      == c+=min%15!=0?1:0;
		c+=min%15>0?1:0;
		int p=min>=60?800:1000;
		System.out.println("���̿�ð�= "+min);
		System.out.println("���̿�Ÿ��= "+c+"/"+min/15.0);
		System.out.println("����� ���= "+p);
		System.out.println(c*p);
		//�̿��� ���?

	}

}
