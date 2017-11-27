
public class Source06_Exception {
	public static void main(String[] args) {
		/*
		 * 
		 * Exception�� ��ü��, ��Ӱ������� ������.
		 * catch������, �׷����� ������ ����.
		 * IndexOutOfBoundsException
		 * 			-StringIndexOutOfBoundsException  / String ���ð�ü���� ����
		 * 			-ArrayIndexOutOfBoundsException   / Array �����ؼ� ����
		 * 
		 * 
		 * 
		 */
		try {
			if(Math.random()>0.5) {
			char c="java".charAt(9);  //StringIndexOutOfBoundsException  ��Ʈ���迭�� �����ε����� �����Ҷ�  "java".substring(0,6)
			}else {
				char[] car="java".toCharArray();//ArrayIndexOutOfBoundsException  �迭�� ���� ĭ�� �����Ҷ�
			
			System.out.println(car[8]);
			}
		}catch(StringIndexOutOfBoundsException| ArrayIndexOutOfBoundsException e ){
			System.out.println(e.toString()+" / "+e.getMessage());
		}
		//============================================================================================
		System.out.println("==============================================================================");
		try {
			if(Math.random()>0.5) {
				char c="java".charAt(9);  //StringIndexOutOfBoundsException
				}else {
					char[] car="java".toCharArray();//ArrayIndexOutOfBoundsException
				
				System.out.println(car[8]);
				}
			
		}catch(IndexOutOfBoundsException e ){//�θ�Ÿ������ ������ �ִ�.
			System.out.println(e.toString()+" / "+e.getMessage());
		}/*catch(StringIndexOutOfBoundsException e) {
		//�̹� ������ ��Ҵ�. ������ StringIndexOutOfBoundsException�̰� �Ʒ��� IndexOutOfBoundsException�� ���� (������ ����� �ͼ����� ������찡 �ֱ⶧��)
			
			
			
		}*/
		IndexOutOfBoundsException e1=new StringIndexOutOfBoundsException();
		IndexOutOfBoundsException e2=new ArrayIndexOutOfBoundsException();
		//������ �θ�(�׷�)���� ��� �Ʒ��� �����׷����� ��°��� �Ұ�
		//�׷����� ��°� ����, �׷����� ��������� �ش� �Ҽ��� �ͼ����� ���� ó���� ����(������ �ȵ�)
		//�׷���, Source07����... ���� ���� ���Ǵ� ���¸� ����.
		
	}
}
