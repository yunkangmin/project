
public class Study12 {

	public static void main(String[] args) {
		//++,--
		int val=100;
		val+=1;
		val++;
		++val;
		System.out.println(val);
		val-=1;
		val--;
		--val;
		System.out.println(val+=1+val);
		val=100;
		System.out.println((val+=1)+val);
		val=100;
		System.out.println(val+=(1+val));
		val=100;
		System.out.println(++val+val);
		val=100;
		System.out.println(val++ + val);
		System.out.println("===========");
		System.out.println(val);
		//++,--��ȣ�� ���� ������ �ܼ��� 1������ �Ǵ°� �ƴ϶�
		//��ȭ�� ���ÿ� ����� �ȴٸ� �ٸ������� ��ȭ�� �Ͼ��.
		//������ ++,--�� ��ȭ�Ŀ� ���� ����
		//�������ʿ� ��ġ�� ++,--�� ���� ���ǰ� ��ȭ��;
		int target=10;
		int v1=target++;
	
		int v2=++target;
		System.out.println(target);
		System.out.println(v1);
		System.out.println(v2);
		
		target=10;
		System.out.println(target + ++target + target++ + target + ++target);
		System.out.println(target);
	}

}
