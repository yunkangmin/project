
public class Source141Plus {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			//���� ���� ���ϴ� �ε����� ����� �� ���� �ִ�.
			String str=i+":";
			//System.out.print(str);
			for(int j=0;j<=i;j++) {
				//System.out.print(j+" ");
				str+=j+" ";
			}
			System.out.println(str);
		}
		
		System.out.println();
		for(int i=0;i<5;i++) {
			//���� ���� ���ϴ� �ε����� ����� �� ���� �ִ�.
			String str=i+":";
			System.out.print(str);
			for(int j=4;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//for�� ���� ������ ���ؼ� �����ϴ� ������, ����⿬��
		for(int i=0;i<5;i++) {
			//���� ���� ���ϴ� �ε����� ����� �� ���� �ִ�.
			String str="";
			//System.out.print(str);
			for(int j=0;j<=i;j++) {
				//System.out.print(j+" ");
				str+="��";
			}
			System.out.println(str);
		}
		for(int i=0;i<5;i++) {
			//���� ���� ���ϴ� �ε����� ����� �� ���� �ִ�.
			String str="";
			//System.out.print(str);
			for(int j=4;j>=i;j--) {
				//System.out.print(j+" ");
				str+="��";
			}
			System.out.println(str);
		}
	}

}
