
public class Source02_Array {
//������ �̸��� ��������ص��ȴ�. �ٸ������� ������ �ʱ� ������
	public static void main(String[] args) {
		//�迭��ü�� ������ �ϰ� �Ǹ�, �⺻������ �ʱ�ȭ�� �� �Ǿ�����
		//boolean==>false/ byte,short,int,long==>0
		//float,double==>0.0/��ü�� null
		boolean[] a;//�迭�� ������ �� �ƴ�.
		a=new boolean[5];
		System.out.println(a[0]);//�⺻�� false��.
		Runnable[] r=new Runnable[10];//��ü�� �⺻�� null
		System.out.println(r[0]);
		System.out.println(r[0]==null);
		String[] jobs=new String[4];
		System.out.println(jobs[0]);
		
		//�迭�� final�� ������ length��� field�� ����==>int
		System.out.println(a.length);//ũ�Ⱑ ���´�.
		System.out.println(r+"�� ������ index = "+(r.length-1));
		//length�� �ۺ��̴�.
		
		//�迭��ü�� �޼ҵ尡 ���µ� Object�� clone()�� �������̵� �صξ���.
		
		int[] sample=new int[3];
		for(int idx=0;idx<sample.length;idx++) {
			sample[idx]=idx;
		}
		int[] csample=sample.clone();//���ο� �迭 �ϳ����� �ڽ��� �����͸� ���ý��Ѽ�
		//�������� ������ش�.
		System.out.println(csample[2]+".."+csample[1]+".."+csample[0]);
		System.out.println(sample==csample);//�����ʴ�.
	
	}

}
