
public class Source16_String_USE {

	public static void main(String[] args) {
		//String�� ������ �ִ� �޼ҵ带 �˾Ƶ� �ʿ䰡 �ִ�.
		String data="��Ʈ ���� ��Ʈ �ڹ� ��Ʈ�� ��Ʈ �� ���� �÷�";

		String find="��Ʈ";

		int idx=data.indexOf(find);//�Ű������� �ѱ� ���ڿ��� ��ġ�� ã���ش� 
		//���ʷ� ã�� �ε���
		//��ã���� -1�� ���´�.
		System.out.println(idx);
		//index�� �����ε��� �Ǿ�����
		int idxx=data.indexOf(find,0);//1������ ã�´� 1���� ���ϱ� �ƶ� �޶� 
		//�״��� �̶� �´� �ε����� ã�´�.//�޼ҵ� ����ġ���Ҽ��� �ִ�.
		System.out.println(idxx);

		/*int num=0;
		int search=0;
		int num1=0;
		while(true) {
			search=data.indexOf(find,num);
			if(search==-1)
			break;
			num=search+1;
			++num1;
		}
		System.out.println(--num1);*/
		int cnt=0;
		int srch=0;
		while(true) {
			int f=data.indexOf(find, srch);
			if(f==-1) 
				break;
			srch=f+1;
			cnt++;
		}
		System.out.println(cnt);
	}
}
