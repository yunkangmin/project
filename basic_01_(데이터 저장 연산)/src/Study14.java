
public class Study14 {

	public static void main(String[] args) {
		//������ ���¿� ���� �ٸ� ������ �ʿ��Ҷ�
		//1.���׿���:������ ���¿� ���� �ٸ� ������� �ʿ��Ҷ�
		//2.if~else:�����ͻ��¿� ���� �ٸ� �۾��� �䱸�ɶ�
		
		double e= Math.random();
		System.out.println("e= "+e);
		//boolean(boolean������ Ȥ�� ����)? true�ϋ� ����� ������:false�ϋ� ����ҵ�����
		boolean f=e>0.5;
		System.out.println(f?1:0);
		System.out.println(e>0.5?1:0);
		int s =e>0.5?1:0;
		System.out.println(s);
		
		int age=10+(int)(Math.random()*20);
		System.out.println(age);
	System.out.println(age>=19?"����":"�̼�����");
	String cate=
			age>=19?"����":"�̼�����";

			
			int  val1=35+(int)(Math.random()*30);//35->64
			int val2=35+(int)(Math.random()*30);
			System.out.println(val1+".."+val2);
	
	//50�� ����� ���ڸ� �̾ƴ޶�.�׸��� choice�� ����
			int g1=val1>50?val1-50:50-val1;
			int g2=val2-50;
			g2=g2>0?g2:-g2;
			int choice=g1<g2?val1:val2;
			System.out.println(choice);
			
	}

}
