
public class Source12 {

	public static void main(String[] args) {
		//for loop : Ư�������� ��ġ�� �̿��� �ݺ�ó���� ���ؼ��� ����� �ȴ�.
		/*for(int num=1;num<=10;num++) {
			// in loop ������ num�̶� ������ ����� �� �ִ�.
			System.out.println(num);
		}*/
		//System.out.println(num);for loop �����Ŀ�, num �̶� ������ �̿��� ���� ������,
		//Ư������ ��� ����?
		int target=30;//2~29������ ���ڵ�� target�� �������� ������ 0�� ���� ����
		int c=0;
		for(int v=2;v<target;v++) {//������ �Ѿ �ʿ䰡 ����.������ �Ѿ�� ����� �ȵȴ�.
			if(target%v==0) {//�� ���ݱ����� �ȴ�.
				System.out.print(v+" ");
				c++;
			}
		}
		System.out.println("����� ����: "+c);
		//Ư�� ���� ������ ���
		int dan=3;
		for(int m=9;m>=1;m--) {
			String str=dan+" X "+m+" = "+(dan*m);
			System.out.println(str);
		}
	}

}
