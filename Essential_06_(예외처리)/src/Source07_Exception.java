
public class Source07_Exception {
	public static void main(String[] args) {
		//try - catch �۾��� �ʿ��Ҷ� �ֻ����� catch�� ��.(�����ڵ��� ����ó���� �ؾ��Ҷ� Trowable�� ��)
		//���� �� ��Ȳ�� ó���� �Ұ�����.
		//������ �ؼ� ������ Ư���ϰ� ó���� Exception�� ������ catch
		try {
			
		}catch(IllegalArgumentException e) {//Ư�� �ͼ���
			
			
		}
		
		catch(/*Throwable*/Exception e){//���� �ͼ��� ��������. Exception���� �ϸ� Exception�� ������.
			System.out.println(e.getMessage());
		}//���������� Throwable�� ��´�. Ȥ�� Exception����
		//������ ���� ������� �Ű��� �Ⱦ���.
		catch(Error e) {
			
		}
		//��Ȳ�� ���� ó��
		//���ߴܰ迡�� �׳� Exception���� �ϴٰ� ���߿� ���������� ��Ȳ�� Exception���� ������.
	}
}
