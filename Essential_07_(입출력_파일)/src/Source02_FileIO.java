import java.io.File;
import java.io.FileInputStream;

public class Source02_FileIO {

	public static void main(String[] args) {
		//1����Ʈ ���� �ƴ϶�,.. byte[]�� ���� �ѹ��� �о ����Ʈ ���� �ø��� ����.

		try {
			File target=new File("d:\\datas","setup.exe");
			FileInputStream fis=new FileInputStream(target);
			System.out.println("�о�� ����.");
			byte[] b=new byte[512];//512���� �о��.
			int cnt=0;
			while(fis.available()>0) {
				cnt++;
				int p=fis.read(b);//byte[]�о����, ���ϵǴ� ������ �ǹ̰� ����� �迭�� ĭ��
				if(cnt==1) {
					System.out.println(b[0]+",,"+b[1]);
				}
				
				
				System.out.println("p = "+p);
				/*String s=new String(b);
				System.out.println(s);*///txt�����Ͻ�
				//�޸����� ����Ʈ�� ���ڷ� �ٲ��ִ� ���α׷�
				//512��ŭ�дٰ� ��������125��� 512������ 125�� �������� ó���� ���� ���� ��������Ƿ� �װ��� �Ǵٽ� ��µȴ�.
			}
			
			
			fis.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
