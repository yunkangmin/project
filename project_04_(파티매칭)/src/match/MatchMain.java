package match;

import java.util.*;
import java.io.Console;

public class MatchMain {
	public static void main(String[] args) {
		Console console=System.console();
		String[]jobs="����,��ɲ�,����,�����,������,�渶����,����̵�,�ּ���,����,�����Ǳ��".split(",");
		List<String> party=new LinkedList<>();
		System.out.println("!!��Ƽ ����!!");
		//�� 7���� �������� �ʿ���
		while(party.size()<7) {
			String j=console.readLine("�߰��� ����(%s/7)>",party.size()+1);
			Set<String> set=new HashSet<>();
			for(int i=0;i<jobs.length;i++) {
				set.add(jobs[i]);
			}
			boolean b1=set.contains(j);
			if(b1==false) {
				System.out.println("���� �����Դϴ�.�ٽ��Է��ϼ���");
				continue;
			}
			
			boolean b=party.contains(j);
			if(b) {
				String jj=console.readLine("�ش������� ��ϵǾ��ֽ��ϴ�. �ߺ������Ͻðٳ�? Y/N ");
				if(jj.equals("y")||jj.equals("Y")) {//jj.equalsIgnoreCase("y");��ҹ��� ���о���
					party.add(j);
					System.out.println("����Ǿ����ϴ�.");
				}
				else {
					System.out.println("�������� �ʽ��ϴ�.");
					continue;
				}
			}
			else {
				party.add(j);
			}
		}
		//================================================================================
		while(true) {
			System.out.println(party.toString());
			String c=console.readLine("�̴�� �����Ͻðڽ��ϱ�?(Y/N)");
			//�ְ� �Է��Ѱ� "Y"�� break;
			//�װ� �ƴϸ�
			if(c.equals("y")||c.equals("Y")) {
				break;
			}
			else {
			String d=console.readLine("������ ���� �ΰ� �Է�(��:2 5) ");
			//���⼭ ���� �ٲ��ְ�,
			//String []ar=d.split("\\s+");
			char a=d.charAt(0);
			char b=d.charAt(2);
			String tmp=party.get(a-48);
			party.set(a-48, party.get(b-48));
			party.set(b-48, tmp);
			}
		}
		System.out.println("���� ��Ƽ.. ���");
		System.out.println(party.toString());
		Set<String> s=new HashSet<>();
		for(int i=0;i<jobs.length;i++) {
			s.add(jobs[i]);
		}
		s.removeAll(party);
		System.out.println("�����ִ� ������ : "+s);
		/*��Ƽ������ �ʿ��� �������� ��ƶ�.
		7���� string�� ��ƾ� ��.

		1�ܰ�
		1.�Է¹޴� STring�� jobs���� �ϳ��� ��ġ�ؾߵ�.
		2.�̹��Է��� �������� ���� , �ѹ� ������޶�
		 �ش������� ��ϵǾ��ֽ��ϴ�. �ߺ������Ͻðٳ�? Y/N

		2�ܰ�
		���������� �ؾ���
		1.����ڰ� ���� ������ ���ҽ� ��ġ �ΰ� �Է¹޾Ƽ�, �� �ش� �ε����� �����͸�
		swap��Ű�� ��
		2.������ ������ �ʴ´ٸ� break;

		3�ܰ�
		�ϼ��� list�� �������.
		�����ִ� �������� �߰� ���.

		contains�� üũ
		���������̸� ���ٰ� üũ
		�����ٲٱ�
		�������� ��������*/
	}

}
