
public class Source02_Wrapper {

	public static void main(String[] args) {
		//Wrapper class �� data���� Auto Boxing,Auto Unboxing(�ڵ����� 
		//Wrap�� �ǰ�, UnWrap
		//1.5�������ĺ��� �������� ���Ǹ� ���ؼ� ���� �����Ϲ���
		int v=2;//byte������������ �ȴ�.-128~127
		Integer i=v;//���� ����� ���.�ڵ����� Wrapó���� �ȴ�.(Auto Boxing)
		int vv=i;//�ڵ����� UnWrap�Ǽ� int�� ��ȯ�Ǳ⵵ ��.(Auto UnBoxing)
		Integer ii=2;
		System.out.println(i==ii);
		
		Character c='��';
		Character cc='��';
		System.out.println(c+" vs "+cc);
		System.out.println(c==cc);
		
		//�ڵ���� �ɶ��� ���Ǵ� �޼ҵ尡, Wrapper class�� valueOf�޼ҵ尡 �۵��ϴ°�.
		Integer izz=21;
		Integer iz=Integer.valueOf(21);//�� ���� null�� �ٲٸ�?
		System.out.println("====================");
		System.out.println(izz+iz);//��ü���� ��ڽ����Ͼ��.(���, ����)
		Integer cmp=new Integer(21);
		System.out.println(izz==iz);
		System.out.println(cmp==iz);
		
		Boolean t=false;
		Boolean t2=Boolean.valueOf(false);
		System.out.println(t==t2);//cacheó�� true
		Boolean t3=new Boolean(false);//new�� ó���Ѱ͵��� ������ �ٸ���.
		System.out.println(t==t3);
		t3=null;
		//boolean b=t3;//t3.booleanValue();
		//t3�� null�̾ ������.
	
		//�⺻������ new�� ���°͵��� �ƹ��� ==�ص� �ٸ��ٰ� ���.
		//Integercache�� �̿��ؼ� ���� ��ü�� ���ü��� �ִ�.
		//-128~127������ �̹��ѹ��̶� ���� ��ü���� �װ�ü���� �����Ѵ�.
		//String�� ����� �ǹ�
	
	}

}
