
/*
 * 입출력의 기본 단위는 byte형태임
 * 이미 완성되어 있는 의미있는 파일의 바이트를 복제를 해보았는데
 * 
 * 의미있는 파일을 만들어내려면....?-세이브 파일 같은
 * 게임의 기록을 파일로 출력해서 저장한다.(세이브파일)
 * 의미있는 데이터 생성
 * 
 * 자바 바이트 입출력을 서포트하기 위해 만들어진 보조 IO클래스들이 존재함.
 *  Data Input / OutputStream
 *  
 * 
 */
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Source04_DataIO {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream(new File("d:\\datas","savedata01.dat"));//파일이 있는지 없는지 확인할수없다
		//원래는 체크를 해야한다. 1차아웃풋스트림 직접적연결
		System.out.println("출력준비 완료.");
		//byte 혹은 byte[]출력밖에 안됨.
		DataOutputStream dos=new DataOutputStream(fos);//매개변수로 아웃풋스트림요구(아웃풋스트림의 종류는 많다 그중하나가 파일아웃풋스트림)
		//파일아웃풋스트림은 자기파일을 대상으로함
		//2차아웃풋스트림(직접연결은 아님)일단 바꾼것이걸로
		//DataOutputStream으로 변경하면 .기본형데이터 +String을 byte로 자동변환해서 출력해줌
		
		dos.writeInt(303);//int4바이트    기본데이터형을 바이트로 바꿔서 출력해준다.
		//39입력하면 39에 해당하는 4바이트로 바꿔줘야한다.
		dos.writeDouble(4242.33);//double 8바이트
		//dos.writeChars("모킹제이");//한글자에 2바이트 읽어낼때 어디까지가 문자열데이터인지를 모른다.
		dos.writeUTF("모킹제이");//어디까지가 문자열인지 그정보를 끝에다 넣어준다.6바이트정도 더작다.
		dos.writeBoolean(true);
		dos.close();//dos만 클로즈해줘도 fos가 자동으로 닫힌다.안쪽에서 작동되는 Stream은 close가 됨
	//	fos.write(33);
		//이걸가지고 세이브파일을 만들어서 복원을 시킨다.
	}
}
