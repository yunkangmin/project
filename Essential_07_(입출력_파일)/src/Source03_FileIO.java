import java.io.File;
import java.io.FileOutputStream;

public class Source03_FileIO {

	public static void main(String[] args) {
		//���Ͽ� ������ ����� �ҷ���, FileOutputSteam�� ����
		try {
			File target=new File("d:\\datas","output");
			FileOutputStream fos=new FileOutputStream(target);
			//����Ҽ� ������, Exception�� �߻� -������ ������ ����� ������ ������ �����
			//����°� �ʿ� ��ǲ�� ������ ������ ������.
			//���丮�� �ȵȴ�. ������ ������ �̹� ���丮�� �����Ҷ�.
			System.out.println("���� ��� �غ� �Ϸ�");
		
		
		fos.write(30);//1����Ʈ��� ����30�� ��� ->1E
		
		byte[]b=new byte[512];//����Ʈ�迭�� �ָ� �׳����� ���ٴٵ����.���� �ȿ� 0�� �� ����.
		fos.write(b);
		fos.write(b,0,40);//�迭�� �Ϻκ����
		//������� queue���� ���ϼ��� ����ī�ǽ� ����Ʈ���� ����
		//��512-1024
		
		fos.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
