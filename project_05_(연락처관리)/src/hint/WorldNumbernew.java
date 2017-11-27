package hint;
import java.io.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WorldNumbernew {

	public static void main(String[] args) {
		Set<String> filter=new HashSet<>();
		Map<Integer,List<String>> nums=new TreeMap<>();
		//Ű�� �������� �����̵ȴ�.
		Console cons=System.console();
		main:while(true) {
			//���:add 1 ONE, add 3 �� , add 3 THREE
			//�˻�: list 1(1���ش��ϴ� ���ܾ ���´�.)
			String w=cons.readLine("WN>" );
			String[]ar=w.split("\\s");
			switch(ar[0]) {

			case "add":
				if(ar.length!=3) {
					System.out.println("�߸��� �����Դϴ�.");
					System.out.println("��뿹) add 3 THREE");
					continue main;
				}
				Integer key=Integer.valueOf(ar[1]);
				if(nums.get(key)==null)
					nums.put(key, new ArrayList<String>());
				String value=ar[2];
				//=================================================
				boolean f=filter.add(value);
				System.out.println(f);
				if(f) {
				//=================================================
				nums.get(key).add(value);//�ش� Ű�� List�� add
				System.out.println("����̵Ǿ����ϴ�.");
				//false�� �߸� ��� �Ҽ����� ���� �˼�
				}else {
					//�� value�� �Ҽӵ� List�� Ű�� ���
					Set<Integer> keys=nums.keySet();
					for(Integer k:keys) {
						List<String> vlist=nums.get(k);
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
				Integer ke=Integer.valueOf(ar[1]);
				if(nums.get(ke)!=null) {
					System.out.println(ke+"��/�� "+nums.get(ke).toString());
					
				}else {
					System.out.println(ke+"�� ��ϵ��� ���� �������Դϴ�.");
					
					
				}
				System.out.println(nums.toString());
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