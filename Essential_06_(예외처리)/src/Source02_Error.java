
/*
 * Error �迭�� , �ϵ�������� ������.
 * 
 * 
 * StackOverflowErroe:�ؾߵ� �۾��� �и��� ��쿡 ����(cpu�� ������ �ذ��)
 * OutOfMemoryError : ��� �޸��ʰ��Ǵ� ��쿡 �߻�..(RAM�� ������ �ذ��)
 * 
 * �̷��� ���۽����� ����Ǵ°� ���� �ʹٸ� , ó���� ���ָ� ��.
 * ==>JVm(���̷�Ʈ��)������ �ȵ��Բ� ö��
 *
 *
 *
 */
import java.util.*;

public class Source02_Error {
	static void recursive() {
		System.out.println(System.currentTimeMillis());
		recursive();
	}

	public static void main(String[] args) {
	try {
		recursive();// stackoverflowerror ��ǻ���� �۾��ӵ��� �����󰡴°� ����ȣ�� cpu����
	}catch(StackOverflowError sof){ //OutOfMemoryError�� ����´�.
		//��������忡�� �׳� ������ �ȵǹǷ� ���������� �˷��ش�.
		System.out.println("����� ��ǻ�Ͱ� �� ���α׷��� ������ �� �����ϴ�.");
		//�������� ����
	}	
	/*	*/List<int[]> li = new ArrayList<>();
	try {
		for (int cnt = 1; cnt <= 10000; cnt++) {
			int[] t = new int[1000000];
			li.add(t);
		}
	}catch(OutOfMemoryError oome){
		System.out.println("�ý��� ���ɻ� ������ �ȵ˴ϴ�.");
	}
	System.out.println("=========================");
	}
}// ��ǻ�͸� ����ϴٰ� ������ �迭 ��ǻ������ ����->�޸𸮺���
// OutOfMemoryError
// �ͼ����� �ڵ幮��
// ������ �ͼ����̵� ���α׷��� ���´�.
// �츮�� ���α׷��� ���������Ḧ ����ʹ�. �׳� ���°ͺ���.
// �ȵǴ� �� ���� �ٸ���Ȳ���� �۾��� �� �� �ְ� ����->handling