
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
		sb1.deleteCharAt(1).deleteCharAt(1);//this를 리턴
		System.out.println(sb1.toString());//start<=  < end
		
		// insert(int , ????) offset endset
		sb1.insert(3,"바밤");
		System.out.println(sb2.toString());
		sb1.insert(5,"erge");//중간에 조작이 가능하다.이건 StringBuilder밖에 못한다.
		System.out.println(sb2.toString());//몇번째부터 넣는다.해당 인덱스포함해서
		
		//replace(int,int,String)
		sb1.replace(0, 4, "s O r T~");
		System.out.println(sb2.toString());//인덱스 4번 전까지
		//setCharAt(int,int)
		sb2.setCharAt(0, 'D');//애는 문자
		System.out.println(sb1.toString());
		
		sb2.reverse();//다뒤집어까진다거꾸로
		System.out.println(sb1.toString());
		
		StringBuilder t1=new StringBuilder("java");
		String t2="java";
		System.out.println(t2.equals(t1));
		System.out.println(t2.equals(t1.toString()));
		//문자열이 주구장창바뀐다.
	}
}


