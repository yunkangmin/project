/*
 * Exception - ���α׷����� ������ �߻��ϴ� �͵�.
 * 
 * 
 * 
 */
import javax.swing.JOptionPane;
public class Source03_Exception {
public static void main(String[] args) {
	//String[]ar=new String[-3];

	
	while(true) {
	int n1=(int)(Math.random()*999);
	int n2=(int)(Math.random()*999);
	
	String qz="��������!\n "+n1+" - "+n2+" ��? ";
	String in=JOptionPane.showInputDialog(null,qz);
	//�������� �ƴ���
	try {
	if(Integer.parseInt(in)==(n1-n2)) {
		JOptionPane.showConfirmDialog(null, "ȯ���մϴ�\n�����Ϸ�Ǽ���.");
		break;
	}
	}catch(NumberFormatException num) {
		JOptionPane.showConfirmDialog(null, "�������� �������Դϴ�.ss");
	}
	
	}
	while(true) {
	Object[] ar=new Object[] {"��","����","����","�ܿ�"};
	Object oo=JOptionPane.showInputDialog(null, "�����ϴ°�����?", null,0,null, ar,"��");

	}
	
	
	
	
	
	
	}
}
