package hint;
import java.util.*;


import java.io.*;
class Contact implements Comparable{
	String name;
	String phone;
	Contact(String n,String p){
		name=n;
		phone=p;
	}
	@Override
	public String toString() {
		return name+" / "+phone;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+phone.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals..called");
		/**/ if (obj instanceof Contact) {
			Contact r = (Contact)obj;
			return (name.equals(r.name)) &&(phone.equals(r.phone));
		}
		return super.equals(obj);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class WorldNumber {

	public static void main(String[] args) {
		Set<Contact> set=new HashSet<>();
		Map<String,List<Contact>> nums=new TreeMap<>();
		//Ű�� �������� �����̵ȴ�.
		Console cons=System.console();
		boolean r=true;
		main:while(true) {
			//���:add 1 ONE, add 3 �� , add 3 THREE
			//�˻�: list 1(1���ش��ϴ� ���ܾ ���´�.)
			if(r){
				System.out.println("�Է¿���)add ������ 01012341234 ����");
				System.out.println("�Է¿���)list ����");
				System.out.println();
				r=false;
			}
			String w=cons.readLine("WN>" );
			String[]ar=w.split("\\s");
			switch(ar[0]) {

			case "add":
				if(ar.length!=4) {
					System.out.println("�߸��� �����Դϴ�.");
					System.out.println("��뿹) add ������ 01012341234 ����");
					continue main;
				}
				Contact con=new Contact(ar[1],ar[2]);
				boolean b=set.add(con);
				if(b==false) {
					Set<String> keys=nums.keySet();
					for(String k:keys) {
						List<Contact> vlist=nums.get(k);
						if(vlist.contains(con)) {
							System.out.println(con+"��(��) "+k+" �� ��ϵǾ� �ֽ��ϴ�.");
							continue main;
						}
					}
					/*System.out.println("�̹� �����ϴ� ����ó�Դϴ�.");
					continue main;*/

				}else {
					System.out.println("����Ǿ����ϴ�.");
				}
				if(nums.containsKey(ar[3])==false)
					nums.put(ar[3], new ArrayList<Contact>());
				nums.get(ar[3]).add(con);

				List<Contact> str=nums.get(ar[3]);
				System.out.println("=="+ar[3]+"==");
				for(Contact s: str) {
					System.out.println("->"+s);
				}
				break;
			case "list":
				if(ar.length==1){
					System.out.println(nums.toString());
					break;
				}
				if(ar.length>2) {
					System.out.println("�߸��� �����Դϴ�.");
					System.out.println("�Է¿���)list ����  or list");
					continue main;
				}
				if(nums.containsKey(ar[1])){
					System.out.println("=="+ar[1]+"==");
					System.out.println(nums.get(ar[1]));
					//System.out.println( nums.get(ar[1]));
				}
				else
					System.out.println("���� �׷��Դϴ�.");
				break;
			default:
				System.out.println("ó���� �� ���� ����Դϴ�.");
			}
			//String a;
			System.out.println();
			//list 5 �ش� Ű ���� ���
			//�ٸ�Ű�� ���� ���� �ȵȴ�.
			//��������ó����� �ȵǴ�.
			//set���� ����óüũ
		}//=========================================================
	}

}
/*##����ó ����##
class Contact{
 String name;
 String phone;
}
�ϴ�, �⺻���� ���� ����ó�� ����� �ȵ�.
�ߺ�üũSet hashcode equals compareTo��� ���͸�ó���� set���� �Ҳ���
(HashSet,TreeSet,LinkedHashSet)�̰ɷ� ó��
contact�� �����ϼžߵɲ���,
=============================================
##����̼�##
���� ����ó �ʹ� ����ø�, WorldNumber�̰Ÿ� ���� �ϼ���ų��
1.�Ѵܾ �������� ��ϵɼ� ���� ������
2.�̹� ��ϵǾ� �ִ� �ܾ�� ��� �ش� Ű���� ����ٰ�
(���� ��� 1�� one�� ������,one�� �� add�� , �̹�1�� ��ϵ� �ܾ��̴�.)
3.����� ���� ����ϴ°� �ƴ϶� ��ġ ���·� �ٲܰ�
�� Contact�� �׷����� ��� �����Ҳ���.��� �׷쿡 ������ �����.
Map<String,List<Contact>> map;
�Է¿�)add ����ȣ 01046148225 ģ�� �Է��� �ѹ��� �� �� �޴´�.
         add ��Ӵ� 01012333144 ���� ���ٷ� �Է� split
               ------contact-------- �׷�
         add �ƹ��� 01232131231 ����(Ű��) 

 list ģ�� ģ������� ���´�.
�������� �ǵ���ϸ� �����Ͱ� ���󰣴�.
����� ���� ����ϴ°�
list 3==>�ش� ���ڷ� �Ǿ��ִ� ����Ʈ�� �ִٸ� ����� ���
������ �� ���ڴ� ���� �����Ͱ� ����. 
 */


