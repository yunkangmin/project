/*
 * �迭�� clone�� ���� ũ���� �迭�� ����, �Ȱ��� ���ý�Ų �迭�� ����� �ִ°�.
 * 
 */
public class Source04_Array {
	public static void main(String[] args) {
		int [] t= new int[] {11,22,33};
		int [] ct= t.clone();
		System.out.println(ct==t);
		//�� �迭�� ������ ���°� ������..
		for(int idx=0;idx<t.length;idx++) {
			boolean b=(t[idx]==ct[idx]);
			System.out.println(b);
			ct[idx]*=2;
		}
		System.out.println(t[0]);
		System.out.println(ct[0]);
		StringBuilder[] sb= new StringBuilder[3];
		sb[0]=new StringBuilder();
		sb[1]=new StringBuilder();
		sb[2]=new StringBuilder();
		System.out.println("["+sb[0].toString()+"]");
		
		StringBuilder[] sbb=sb.clone();
		for(int idx=0;idx<sb.length;idx++) {
			boolean b=(sbb[idx]==sb[idx]);
			System.out.println(b);
			sbb[idx].append("java");
		}
		System.out.println("["+sb[0].toString()+"]");
		System.out.println("["+sbb[0].toString()+"]");
		//���� ��ü�� �ּҰ��� ����Ǿ� �־ �Ѵ� �Ȱ��� ���Ѵ�.
	}
}
