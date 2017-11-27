package cmd;

import java.io.Console;
import java.io.File;
import java.util.Date;

public class CMD {
	public static void main(String[] args) {
		System.out.println();
		Date d = new Date(System.currentTimeMillis());
		System.out.println("Connected to CMD : " + d.toString());
		System.out.println();
		Console con = System.console();
		File wd = new File("C:\\Users");
		while (true) {
			System.out.println();
			String cmd = con.readLine(wd.getAbsolutePath() + ">");
			String[] ar = cmd.split("\\s+");
			switch (ar[0]) {
			case "cd":	// cd 디렉터리명 예) cd 3dp
				if(ar.length==1) {
					System.out.println(wd.getAbsolutePath());

				}
				else if(ar[1].equals("..")) {
					File tmp = wd.getParentFile();
					if(tmp != null)
						wd = tmp;
				}else {
					String[]arr=cmd.split("\\s+",2); //cd All Users
					File tmp = new File(wd, arr[1]);  // 현재디렉터리를 부모로, 3dp를 이름으로 한 파일
					// ========================================
					if(tmp.exists()&&tmp.isDirectory()) {
						// =============================================
						wd = tmp; // 현재디렉터리를 그 파일로 바꿔치기
					}else if(tmp.exists()&&tmp.isFile()){
						System.out.println("디렉토리 이름이 올바르지 않습니다.");
					}else {
						System.out.println("지정된 경로를 찾을수 없습니다.");
					}
				}
				break;
			case "dir":
				File[] files = wd.listFiles();
				for (int i = 0; i < files.length; i++) {
					if(files[i].isHidden())
						continue;
					long mt=files[i].lastModified();
					String detail=new Date(mt).toString().toUpperCase()+"\t";
					if(files[i].isDirectory()) { 
						detail+="<DIR>\t\t";
					}else {
						detail+=files[i].length()+"\t";
					}
					detail +=files[i].getName();
					System.out.println(detail);
				}
				break;
			case "mkdir":
				System.out.println();
				File dir=new File(wd,ar[1]);
				if(dir.exists()) {
					System.out.println("하위 디렉토리 또는 파일 "+ar[1]+"이(가) 이미 있습니다.");

				}else {
					dir.mkdir();

				}

				break;
			case "rename": //rename aaa bbb
				File src=new File(wd,ar[1]);
				if(src.exists()) {
					File dst=new File(wd,ar[2]);
					if(dst.exists()) {
						System.out.println("중복되는 파일 이름이 있거나, 파일을 찾을 수 없습니다.");

					}else {
						src.renameTo(dst);
					}
				}else {
					System.out.println("지정된 파일을 찾을 수 없습니다.");
				}
			}
		}

	}
}
/*
 * File 객체를 이용해서 파일시스템에 대해 접근할 수 있다.
 * -정보를 얻어내는 것뿐만 아니라, 삭제, 수정, 생성 작업등이 가능.
 * 
 * String split 기능
 * 
 * if else를 이용한 흐름제어
 * 
 * 
 */

