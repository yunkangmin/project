
public class Source09_RegEx {
	public static void main(String[] args) {
		String[] regex=new String[] {
				"[abc]",//a or b or c
				"[^abc]",//except a or b or c //a b c ���ƴϰ�
				"[a-zA-Z]",// a through z or A trough Z �����ھƹ��ų�
				"[a-d[m-p]]", // a through d, m through d : a-dm-p
				"[a-z&&[def]]",//d,e ,or f
				"[a-z&&[^bc]]",//a through z and except b,c : ad-z
				"[a-z&&[^m-r]]"//a through z and except m thought r
		};
		
		boolean b="cat".matches("[abc]a[tp]");
		//���ڿ��ϳ��� üũ�ϴ°� String�� ���� matches�� true or false��ȯ
		//pattern or matcher�� ������ ã�� ���Ѱ�
		System.out.println(b);
		
		String r="[abc]a[otz]";
		boolean b1="bat".matches(r);
		System.out.println(b1);
		System.out.println("batcao".matches(r));
		System.out.println("cao".matches(r));
		//��Ȯ�� ��ġ �ϴ����� üũ
		boolean t="A3b".matches("[A-Z][^0-3[368]][^g-m]");
		//&&������ �����ÿ��� []��������Ѵ�.[[]]�� �⺻�� or �����ϳ��� �ִٸ� true�̴�.
		System.out.println(t);
		//�̸� Ư���׷��� ��ȣ�� ó�� �ص�.
		// . : any char 
		// \\d digit[0-9]  
		// \\D non-digit [^0-9]
		// \\s whitespace[\t\n\r]�����̽���� �����ϸ�ȴ�.
		// \\S non-white[^\\s]
		// \\w word character[A-Za-z0-9_]
		// \\W non-word character  Digit
		
		boolean z1="3 D".matches("\\d\\s\\w");
		System.out.println("==> "+z1);
		boolean z2="31��0244".matches("\\d\\d[��-����-�R]\\d\\d\\d\\d");
		boolean z3="31��0244".matches("\\d\\d[��-����-�R]\\d\\d\\d\\d");
		System.out.println(z2);//���������� ���� �����ִ�.
		System.out.println(z3);//���������� ���� �����ִ�.
		
		//�ڹٽ�ũ��Ʈ�� �α��ν� ����üũ���
	}
}
