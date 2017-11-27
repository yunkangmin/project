package annotations;
/*
 * annotation : ����(�ּ�)
 * -���α׷������δ� �������� ������ ���� ������,
 * ������ �����ϴ� (�����Ϸ� Ȥ�� Ÿ �ý���)������ ��
 * ��谡 �ν��ϴ� �ּ�
 * @Override�������� �ҋ� ��迡 ��� ������ �����Ѵ�.
 * ������̼��� ���� ����� ���� ���� ����.
 * �̸� ������ �͵� ��� ���캸�� ��. 
 * 
 */
public @interface Comment {
	String writer();
	String date();
	String about();
	int version()default 1;
	boolean flag()default false;
	//default�� �ִ� �͵��� ������ ���ص� �ȴ�.
}
