import java.io.File;
import java.io.FileInputStream;

public class Source02_FileIO {

	public static void main(String[] args) {
		//1바이트 씩이 아니라,.. byte[]을 쓰면 한번에 읽어낼 바이트 양을 늘릴수 있음.

		try {
			File target=new File("d:\\datas","setup.exe");
			FileInputStream fis=new FileInputStream(target);
			System.out.println("읽어낼수 있음.");
			byte[] b=new byte[512];//512개씩 읽어낸다.
			int cnt=0;
			while(fis.available()>0) {
				cnt++;
				int p=fis.read(b);//byte[]읽어낼때는, 리턴되는 숫자의 의미가 사용한 배열의 칸수
				if(cnt==1) {
					System.out.println(b[0]+",,"+b[1]);
				}
				
				
				System.out.println("p = "+p);
				/*String s=new String(b);
				System.out.println(s);*///txt문서일시
				//메모장은 바이트를 문자로 바꿔주는 프로그램
				//512만큼읽다가 마지막이125라면 512개에서 125를 뺀값에는 처음에 읽은 값이 들어있으므로 그것이 또다시 출력된다.
			}
			
			
			fis.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
