package interfaces;
/*
 * class�ʹ� �ٸ���, static final field / abstract method���� ������ ����
 * ������ ���� ��ü�� �޼ҵ� ���¸��� ����صѼ� ����.
 */
public interface CPU {
	//int level;����������.�Ϲ��ʵ�
	//public CPU() {}����.�����ڵ� �����ȵǰ�
	//public void run() {}����. �Ϲݸ޼ҵ嵵 �������.
	public abstract void stop();//�߻�޼ҵ常 ���谡��
	public static final int MAX=4;//�ʵ�� public final�� ���谡 ����.
	
}
