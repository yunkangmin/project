
public class Study12Plus {

	public static void main(String[] args) {
		int seq=0;
		System.out.println(seq++ +"��° ���");
		System.out.println(seq++ +"��° ���");
		System.out.println(seq++ +"��° ���");
		
		System.out.println(++seq +"��° ���");
		System.out.println(++seq +"��° ���");
		System.out.println(++seq +"��° ���");
		
		int storeCnt=0;//������ ���� ����Ǵ� Ƚ��
		int mathCnt=0;//��ġ���� Ƚ��
		int loadCnt=0;//������ ���� �ε� �Ǵ� Ƚ��
		int hour=19;//0~23
		int minute=15;//0~59
		int second=27;//0~59
		//hour, minute, second�� �����ʹ� �ٲ�� ����. ��ȿ�� �����Ͱ� �ִٰ� ����
		
		//total ������ �ִ� ���� ����ؼ�, �Ϸ���� ���ʰ� �귯������
		int total=(hour*3600)+(minute*60)+second;
		loadCnt+=3;
		storeCnt+=1;
		mathCnt+=4;
		//����ٰ� �����ϱ�
		//�� ���� total���� ����ؼ� �Ϸ縦 1�� ������ �뷫���� ����
		double rate;
		rate=total/(60*60*24.0);
		loadCnt++;
		storeCnt++;
		mathCnt+=3;
		
		System.out.println("total: "+total);
		System.out.println("rate: "+rate);
		System.out.println("storeCnt: "+storeCnt);
		System.out.println("mathCnt: "+mathCnt);
		System.out.println("loadCnt: "+loadCnt);

	}

}
