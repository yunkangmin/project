package example;
import java.io.*;
import java.util.Scanner;
public class Example02_CreateAccount {

	public static void main(String[] args) {
		while(true) {
			int cnt=0;
			Console console=System.console();
			//System.out.println(console==null);
			//������ ���ڿ��� �Է¹޴´�
			//��Ʈ����������� %s�ؼ� ����ϴ°� ==>null
			System.out.println("CREATE ACCOUNT..!");
			String id=console.readLine("account id>",null);
			char[] pw=console.readPassword("account pass>",null);
			if((id.length()<=8&&id.length()>=4)&&(pw.length<=8&&pw.length>=4)) {
				System.out.println("���̵� ��й�ȣ �ڸ��� ����!");
				cnt++;
			}
			else {
				System.out.println("���̵� ��й�ȣ �ڸ��� ������!");
				continue;
			}
			//�Է��ص� ������ �ȳ��´�.
			char[] rpw=console.readPassword("account repass>",null);
			String p1=new String(pw);
			String p2=new String(rpw);
			if(p1.equals(p2)) {
				System.out.println("��й�ȣ ��ġ");
				cnt++;
			}
			else {
				System.out.println("��й�ȣ ����ġ");
				continue;
			}
			//�ڹٴ� �پ��� ������� �Է��� �������ִ�.
			//��Ŭ���������� �ְܼ�ü�� �������� �׽�Ʈ�� �Ҽ��� ����.

			/*System.out.println(id);
			System.out.println(pw);
			System.out.println(rpw);*/
			String ss="";
			for(int i=0;i<id.length()-2;i++) {
				ss+="*";
			}
			String ss1="";
			for(int i=0;i<pw.length-2;i++) {
				ss1+="*";
			}
			if(cnt==2) {
				System.out.println("����");
				System.out.println(id.substring(0,2)+ss);
				String m=new String(pw,0,2);
				System.out.println(m.substring(0,2)+ss1);
				break;
			}
			else {
				System.out.println("����");
				continue;
			}
			//�������� ��������
			//id�� pw�� 4����~8���ڻ���
			//PW�� RPW�� ��ġ�ؾ��Ѵ�.

			//�������� ���� .. �տ� �α��ڸ� ����� ������ ���� *ó��
			//master, 1q2e3e4r==>ma*****/1q*****
		}

	}

}
