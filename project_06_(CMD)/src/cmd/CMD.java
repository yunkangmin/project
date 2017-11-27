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
			case "cd":	// cd ���͸��� ��) cd 3dp
				if(ar.length==1) {
					System.out.println(wd.getAbsolutePath());

				}
				else if(ar[1].equals("..")) {
					File tmp = wd.getParentFile();
					if(tmp != null)
						wd = tmp;
				}else {
					String[]arr=cmd.split("\\s+",2); //cd All Users
					File tmp = new File(wd, arr[1]);  // ������͸��� �θ��, 3dp�� �̸����� �� ����
					// ========================================
					if(tmp.exists()&&tmp.isDirectory()) {
						// =============================================
						wd = tmp; // ������͸��� �� ���Ϸ� �ٲ�ġ��
					}else if(tmp.exists()&&tmp.isFile()){
						System.out.println("���丮 �̸��� �ùٸ��� �ʽ��ϴ�.");
					}else {
						System.out.println("������ ��θ� ã���� �����ϴ�.");
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
					System.out.println("���� ���丮 �Ǵ� ���� "+ar[1]+"��(��) �̹� �ֽ��ϴ�.");

				}else {
					dir.mkdir();

				}

				break;
			case "rename": //rename aaa bbb
				File src=new File(wd,ar[1]);
				if(src.exists()) {
					File dst=new File(wd,ar[2]);
					if(dst.exists()) {
						System.out.println("�ߺ��Ǵ� ���� �̸��� �ְų�, ������ ã�� �� �����ϴ�.");

					}else {
						src.renameTo(dst);
					}
				}else {
					System.out.println("������ ������ ã�� �� �����ϴ�.");
				}
			}
		}

	}
}
/*
 * File ��ü�� �̿��ؼ� ���Ͻý��ۿ� ���� ������ �� �ִ�.
 * -������ ���� �ͻӸ� �ƴ϶�, ����, ����, ���� �۾����� ����.
 * 
 * String split ���
 * 
 * if else�� �̿��� �帧����
 * 
 * 
 */

