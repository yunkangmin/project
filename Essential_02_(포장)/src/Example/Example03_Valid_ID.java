package Example;
import javax.swing.JOptionPane;
public class Example03_Valid_ID {

	public static void main(String[] args) {
		String pre=JOptionPane.showInputDialog(null,"�ֹι�ȣ �� 6�ڸ�");  //6�ڸ�
		String suff=JOptionPane.showInputDialog(null,"�ֹι�ȣ �� 7�ڸ�"); //7�ڸ�
		
		JOptionPane.showInputDialog(null,"������ �����մϴ�.");
        //toCharArray
		//�ֹι�ȣ �����ѹ�
		//mspaint
		//�ڹ��� ��絥���ʹ� ����90%�� String���� ó���ȴ�.
		//�׸��� �м�
		//���� �ֹι�ȣ
		//�ֹι�ȣ ����...
		//�������6�ڸ�,7�ڸ�(����1�ڸ�/������ȣ2�ڸ�/���繫�ҹ�ȣ2/����Ű�1/�����ѹ�1)
		//6�ڸ��� 6�ڸ��� ���ؼ� ���ڻ���
		//���°�� �Ű�̳�
		//�ѵ��׿��� ������� ��5�ڸ��� �������� �ִ�.
		String total=pre+suff;
		System.out.println(total);
		//char[] prevAr1=pre.toCharArray();
		int result=0;
		/*for(int i=0;i<prevAr1.length;i++) {
			result+=prevAr1[i]*(1+i);
		}*/
		char[] total1=total.toCharArray();
		for(int i=0;i<total1.length-1;i++) {
			if(i<=7)
			result+=(total1[i]-48)*(2+i);
			else
			result+=(total1[i]-48)*(i-6);
		}
		result=11-(result%11);
		result%=10;
		System.out.println(result);
		System.out.println(total1[12]);
		if(result==total1[12]-48)
		  {
		   System.out.println("�ֹε�Ϲ�ȣ�� Ȯ�εǾ����ϴ�.");
		  }
		  else
		  {       
		 System.out.println("�ֹε�Ϲ�ȣ�� Ʋ�Ƚ��ϴ�.");
		  }

	}

}
