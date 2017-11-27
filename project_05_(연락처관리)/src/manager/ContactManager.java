package manager;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ContactManager {
	public static void main(String[] args) {
		Set<Contact> filter=new HashSet<>();
		Map<String,List<Contact>> cs=new TreeMap<>();
		//Ű�� �������� �����̵ȴ�.
		Console cons=System.console();
		main:while(true) {
			//���:add ����̸� ����ó �׷�
			//�˻�: list �׷�
			String w=cons.readLine("MANAGER>" );
			String[]ar=w.split("\\s");
			switch(ar[0]) {

			case "add":
				if(ar.length!=3) {
					System.out.println("�߸��� �����Դϴ�.");
					System.out.println("��뿹) add �̸� ����ó �׷�");
					continue main;
				}
				String key=ar[3];
				if(cs.get(key)==null)
					cs.put(key, new ArrayList<Contact>());
				Contact value=new Contact(ar[1],ar[2]);
				//=================================================
				boolean f=filter.add(value);
				System.out.println(f);
				if(f) {
				//=================================================
				cs.get(key).add(value);//�ش� Ű�� List�� add
				System.out.println("����̵Ǿ����ϴ�.");
				//false�� �߸� ��� �Ҽ����� ���� �˼�
				}else {
					//�� value�� �Ҽӵ� List�� Ű�� ���
					Set<String> keys=cs.keySet();
					for(String k:keys) {
						List<Contact> vlist=cs.get(k);
						if(vlist.contains(value)) {
							System.out.println(value+"��(��) "+k+"�� ��ϵǾ� �ֽ��ϴ�.");
							break;
						}
					}
				}
				break;
			case "list":
				if(ar.length!=2) {
					System.out.println("�߸��� �����Դϴ�.");
					System.out.println("��뿹) list 3");
					continue main;
				}
				String ke=ar[1];
				if(cs.get(ke)!=null) {
					System.out.println(ke+"��/�� "+cs.get(ke).toString());
					
				}else {
					System.out.println(ke+"�� ��ϵ��� ���� �������Դϴ�.");
				}
				System.out.println(cs.toString());
				break;
			default:
				System.out.println("ó���� �� ���� ����Դϴ�.");
			}
			System.out.println();
			//list 5 �ش� Ű ���� ���
			//�ٸ�Ű�� ���� ���� �ȵȴ�.
			//��������ó����� �ȵǴ�.
			//set���� ����óüũ
		}//=========================================================
	}
}
