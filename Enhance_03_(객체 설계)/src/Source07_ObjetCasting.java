import hospital.Corpse;
import hospital.Doctor;
import hospital.Patient;
import hospital.Sims;

/*
 * ���(=Ȯ��)
 * �̹� �����ϴ� �� class�� ����(�����߰�. ��ɺ���)�� ����
 * 								��class�� �����ϴ� ��
 * ȿ��?
 * -��ü ���𵨸��� ����
 * -���� �κ� ����� ���� ��ü ���� ����
 * -�������� �̿��� ������ü ���� ����.
 * 
 * 
 */
public class Source07_ObjetCasting {
	public static void main(String[] args) {
		//��ü�� ĳ������ ������.
		Corpse c=new Corpse();
		Patient p=(Patient)c;//c��ü�� Patient ��ü��� �����ϰ�
		//��ü ��� ��
		System.out.println("1st done..");
		Sims s=(Sims)p;
		System.out.println("2nd done..");
		Patient pp=(Patient)s;
		System.out.println("3rd done..");
		//�׻� �Ǵ°� �ƴϰ�, ���� ��Ӱ���������
		//Doctor d=(Doctor)p;//��Ӱ��谡 �ƴϿ��� �ȵȴ�.
		//�迭�� �ٸ��� ������ ����
		Doctor d=(Doctor)s;//��üĳ������ ��Ÿ�ӿ����� �߻��Ҽ� ����
		//�����Ͽ����� �ƴϴ�.�õ��� �ȴ�.
		//������ �ȹٲ��� ������ ����.
		System.out.println("4th done..");
		//�̰������� ������ �θ�Ÿ������ �ø��� ���� ()�����Ҽ� ����.
		//��ü����  �θ�Ÿ������ �ø��°� ��ĳ����.
		//��ü���� �ڽ�Ÿ������ ������ �� �ٿ�ĳ����.
		//��ĳ������ ()��������
		//��üĳ������ �׻� �����ϴ°� �ƴ�.�ش簴ü�� �ȹٲ�� ĳ���� ���а� 
		//����� �ִ�.
		//�̰� �̿��ϱ� ���ؼ� ��ӱ����� ����.
	}
}
