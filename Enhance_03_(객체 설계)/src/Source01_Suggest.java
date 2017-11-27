import model.Unit;

/*
 * ��ü������� �����ϴ� ���(inheritance)=(Ȯ��/extension)�̶�� ����.
 * ����� �̹� ����������� Ŭ������ ������ �ִ� ������ 
 * ����, �߰��ؼ� ���ο� Ŭ������ �����ϴ� ���
 * 
 * ������ �����ϱ� ���� ���� ������Ʈ���� �����ص�, model��Ű���� �����ؼ� ������ ����.
 * � ������ �۵��ϴ��� �ϴ� ����, ��� Ȱ���ϴ��� ������ �غ���.
 * 
 * public class�� �����ϴ°� �ƴ϶��, ���������� �ʿ����
 */
//���� ����Ǵ� class [MagicUnit����...]�ָ� ����Ŭ����, subClass,�ڽ�Ŭ����,�Ļ�Ŭ����
//������ �Ǵ� class[Unit����..]�ָ� ����Ŭ����, superClass, �θ�Ŭ����, ����Ŭ����

class MagicUnit extends Unit{//extends : Ȯ��
	public void selfHeal() {
		hp+=10;	//������ �پ��ִ� �ֵ��� �� �ڱ�� ���� ����ؼ�, �߰� ��� ������ ����
		hp=hp>100?100:hp;//�� �����ڿ� �ɸ��� �� ��¿�� ����
		
		
	}
}


public class Source01_Suggest {
	public static void main(String[] args) {
		MagicUnit u= new MagicUnit();
		String s=u.toJSON();
		System.out.println(s);
		//u.hp=300;
		u.damageBy(30);//�ڽİ�ü�� �θ�ü�� �޼ҵ带 �ڱ� �͸��� �����ִ�.
		System.out.println(u.toJSON());
		u.selfHeal();
		System.out.println(u.toJSON());
	}
}
