
public class Source07 {

	public static void main(String[] args) {
		//16���� 0~F�� �̿��ؼ� ���ڸ� ǥ��
		//10���� 10=>A, 11=>B   15=>F
		//
	/*	int n=(int)(Math.random()*45);
		String s=Integer.toString(n,16);//�տ� 10����, �ڿ� ��ȯ�� ����
		
		System.out.println(n+"�� 16���� "+s);*/
		
		int target=(int)(Math.random()*256);
		System.out.println(target+"�� 16������ ��ȯ�ϸ�");
		String change="";
		String b;
		b=""+'a';//�׳�'a'�� ĳ���� ���̹Ƿ� �ȵȴ�.���ڿ��� ĳ���͸� ���ϴ� ���� �ȴ�.
		System.out.println(b);
		//������ ���ڸ��� �����޶�.
		//1.16���� ���������� ��� �������� ���ؾ���
		//10~15������ ���ڷ� �ٲ����
		//String�� �ƹ��͵� ���ٸ� ���ڿ��� ���� �� �� ����.
		int n1=target/16;
		int n2=target%16;
		if(n1>9) {
			switch(n1) {
			case 15:
				change+="F";
				break;
			case 14:
				change+="E";
				break;
			case 13:
				change+="D";
				break;
			case 12:
				change+="C";
				break;
			case 11:
				change+="B";
				break;
			case 10:
				change+="A";
			}
		}
		else {
			change+=n1;
		}
		if(n2<10) {
			//change+=n2;
			change+=(char)(n2+48);//'0'�� 48�̱� �����̴�.�׷��� ���� '0'�� ������ ����ȴ�.
			//change+=(char)n2;//��Ʈ�� ���ڿ� �´� ���ڸ� �����Ѵ�.
		}else {
			change+=(char)(n2+55);//65�� A�̱� �����̴�.
		}
		System.out.println(target+">"+change);
		System.out.println('A'==65);
		System.out.println((char)55204);
		System.out.println((int)'�R');
		System.out.println((int)'0');//'0'-'9' : 48 ~ 57 , 'A':65~90, 'a':97
		//'��':44032 '�R'(char)55204 �ѱ��� ���� ������ �����Ǿ� ���� �ʾ����Ƿ� ?�� ���´�.
	
		//switch case�ι� �ۼ�
		//234==>EA 15----10
		//0���� �ٳ��´�.
		//toString���� �ϸ� 0�� �����ȴ�.
		//else��� default�� ó���Ҽ��� �ִ�.
		
		
		//���ڵ� ���ڴ�. 
		/*System.out.println('A'*1);
		System.out.println((int)'A');//65~90���� ���ĺ��̴�.
		System.out.println((char)65);
		System.out.println((char)66);
		System.out.println((char)67);*/
	}

}
