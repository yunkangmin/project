package enums;

public class Source01_EnumTEST {
	public static void main(String[] args) {
		Direction d= Direction.UP;
		//�̸� �������� �����͸� ���°�
		//Ư�������� �����͵��� ���س��� ����Ѵ�.
		System.out.println(d);
		System.out.println(System.identityHashCode(Direction.RIGHT));
		System.out.println(System.identityHashCode(Direction.RIGHT));
		System.out.println(System.identityHashCode(Direction.LEFT));
		System.out.println(System.identityHashCode(Direction.UP));

		//switch-case�� ó�������� ������ Ÿ����, ����������,String,Enum������
		//�Ϲ� Ŭ������ ���� �ȵȴ�.
		//switch������ ������ �����ִ�.
		switch(d) {
		case RIGHT:
		case LEFT:
		case UP:
		case DOWN:
			//�̷����� Direction.LEFT Enum���� �����Ѵ�.
			//================================================
			//������ �ǹ��ִ� �̸��� �־ ���� �ȴ�.
			//ex)��Į�� ȭ��Ʈ,��
			//�̸� ������ �������Ƴ��Ҵٰ� �����
			//�̹� �����صξ��� �׷� ��ü�ۿ� ������.
			//�� ������� ����.�������� ������ �ִ� ��ü ��� �����ٰ� �����
		}
			if(d==Direction.LEFT) {

			}
		}
	}

