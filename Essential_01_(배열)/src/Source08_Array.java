import java.util.Date;

public class Source08_Array {
	public static void main(String[] args) {
		// �迭�� ó���Ǵ� �������߿� ���� ū��, ���� ���� �� ���⵵ ���� �ϴ� �۾�
		int[] data = new int[] { 5, 2, 543, 11, 6, 4, 2, 1, 6, -3, 5 };
		// ���õ����ͼ���
		//ó���ϴ� ���..?
		int win=data[0];
		for(int idx=0;idx<data.length;idx++) {
			win=Math.max(win, data[idx]);
		}
		System.out.println(win);
		int min=data[0];
		for(int idx=0;idx<data.length;idx++) {
			if(data[idx]<min)
				min=data[idx];
		}
		//game��Ű������ ,Card������ �����ؼ�
		//���߿��� ���� ū ī��� ���� ī�带 �߷��޶�.
		//���ڰ� �����ְ� �ϴ�ŭ,�������ڶ��
		//��>��>��>��
		
		//�̰� �ذ��ϴµ� ,�ݺ��� ���鼭 �ʵ�üũ�������ð�,
		//CardŬ���� �ٸ� ī��� ũ��񱳸� �Ҽ� �ִ� �޼ҵ带 ���� �ذ�.
		//ũ�ٰ� �����ϴ� �͸� ��Ƶθ��
		Date d=new Date(24212312323412L);
		Date d2=new Date(12324213234112L);
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d2.compareTo(d));
	}
}
