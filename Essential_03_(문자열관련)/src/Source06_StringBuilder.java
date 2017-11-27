
public class Source06_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("java");
		StringBuilder sb2=sb1;
		
		sb1.append("pro");
		sb2.append("gram").append("!!");
		System.out.println(sb1.toString());
		
		//delete(int, int) /deleteCharAt(int)
		sb1.delete(2, 7);
		System.out.println(sb1.toString());//start<=  < end
		sb1.deleteCharAt(1).deleteCharAt(1);//this�� ����
		System.out.println(sb1.toString());//start<=  < end
		
		// insert(int , ????) offset endset
		sb1.insert(3,"�ٹ�");
		System.out.println(sb2.toString());
		sb1.insert(5,"erge");//�߰��� ������ �����ϴ�.�̰� StringBuilder�ۿ� ���Ѵ�.
		System.out.println(sb2.toString());//���°���� �ִ´�.�ش� �ε��������ؼ�
		
		//replace(int,int,String)
		sb1.replace(0, 4, "s O r T~");
		System.out.println(sb2.toString());//�ε��� 4�� ������
		//setCharAt(int,int)
		sb2.setCharAt(0, 'D');//�ִ� ����
		System.out.println(sb1.toString());
		
		sb2.reverse();//�ٵ���������ٰŲٷ�
		System.out.println(sb1.toString());
		
		StringBuilder t1=new StringBuilder("java");
		String t2="java";
		System.out.println(t2.equals(t1));
		System.out.println(t2.equals(t1.toString()));
		//���ڿ��� �ֱ���â�ٲ��.
	}
}


