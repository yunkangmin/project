package example;

import javax.swing.JOptionPane;

public class Example01_StringPool {

	public static void main(String[] args) {
		String p=JOptionPane.showInputDialog(null,"������ ��й�ȣ?");
		String rp=JOptionPane.showInputDialog(null,"������ ��й�ȣ Ȯ��?");
		
		JOptionPane.showMessageDialog(null, "����â�Դϴ�.", "����", JOptionPane.INFORMATION_MESSAGE);
		
		//p==rp X | p.equals(rp)//�ִ� �迭������ ��
		if(p.equals(rp)) {//���ڿ����̰� ������� p.intern()==rp.intern()
			//���� ��ü���� �ƴ����� ���ϸ�ȴ�.
			JOptionPane.showMessageDialog(null, "��������");
		}else {
			JOptionPane.showMessageDialog(null, "���� ����\n��й�ȣ ����ġ");
			
		}

	}

}
