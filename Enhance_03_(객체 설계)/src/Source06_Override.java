import java.awt.*;
import java.awt.event.*;
//Override ���Ѽ� ��ü�� �������� �� �������� �޼ҵ尡 �۵��ȴٴ°� �̿��� awt
//�迭�� Ŭ������.
class CustomWindowAdapter extends WindowAdapter{
//ctrl+space //�������̵��Ҽ� �ִ� �޼ҵ���� ���.
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("widowClosing");
		//����Ŭ������
		//�������̵� �Ѱ͸� �̿��Ҽ� �ִ�.
	}
}
public class Source06_Override {
	public static void main(String[] args) {
		Frame f=new Frame();
		System.out.println("��ü����");
		
		f.setVisible(true);//â�� �ϳ� ���.x��ư�� ������,
		//frame��ü�� ������ �ִ� Windowadapter�� ��ü�� � Ư��
		//�޼ҵ带 ȣ����.
		//System.out.println(��ü)==>��ü�� toString()�� ����ؼ�
		///����� �Ͼ�°Ͱ� ���
		//WindowAdapter�� �ٲ㼭 �����ϸ� , x��ư�������� �ؾ������� ����
		//�� �� ����.������ ���ϸ� �ƹ��ϵ� ���Ͼ.
		//toString()�� �������̵� �ϸ�. ��������� �ٲ� �� �ִ°� ����
		//�ֿܼ��� �������� �׸� ������ ���ߵȴ�.
		CustomWindowAdapter cwa=new CustomWindowAdapter();
		WindowAdapter wa=cwa;//�θ�Ŭ����
		WindowListener wl=wa;//�θ�Ŭ�������� ����ȯ
		WindowListener wll=new CustomWindowAdapter();
		cwa.windowClosing(null);//�Ű������� null�� �����Ѱ� ũ�� �Ű�Ƚᵵ ��.
		//wll.windowClosing(null);
		f.addWindowListener(cwa);//�ָ� ȣ���� �ϸ� �˾Ƽ� windowClosing
		//ȣ���Ѵ�.
		//������ CustomWindowAdapter�� extends�� ����. 29��° ���ο��� ������ ����
		//�� ��
		//��ü �� ��ȯ?
	}
}
