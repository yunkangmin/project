package cmd;

import java.io.Console;
import java.io.File;
import java.util.Date;

public class CMDShellMain {
 public static void main(String[] args) {
  System.out.println();
  Date d = new Date(System.currentTimeMillis());

  System.out.println("Connected to CMD : " + d.toString());// Ŀ����cmd
  Console con = System.console();
  File wd = new File("c:\\Users");// ���������̶�� ������̺갡�ִ�.
  // ����Ʈ ���
  ss: while (true) {
   String cmd = con.readLine(wd.getAbsolutePath() + ">");
   // cmd�� ���α׷��̴� ���Ͻý����� �����ϴ�
   String[] ar = cmd.split("\\s+");
   switch (ar[0]) {
   case "cd":
    if (ar.length == 1) {
     String path = wd.getAbsolutePath();
     System.out.println(path);
     continue ss;
    }
    if (ar.length == 2) {
     if (ar[1].equals("..")) {
      File tmp = wd.getParentFile();
      if(tmp==null){
       System.out.println("�ö󰥰��� �����ϴ�.");
       continue ss;
      }
      boolean a = tmp.exists();
      if (a) {
       wd = tmp;
       continue ss;
      } else {
       System.out.println("�θ���丮�� �����ϴ�.");
       continue ss;
      }

     } else {
      File tmp = new File(wd, ar[1]);
      boolean a = tmp.exists();
      if (a) {
       wd = tmp;
       continue ss;
      } else {
       System.out.println("�׷������� �����ϴ�. �ٽ��Է��ϼ���.");
       continue ss;
      }
     }
    }
    if (ar.length > 2) {
     File tmp = new File(wd, ar[1] + " " + ar[2]);
     boolean a = tmp.exists();
     if (a) {
      wd = tmp;
      continue ss;
     } else {
      System.out.println("�׷� ���丮�� �����ϴ�.");
      continue ss;
     }
    }
    // lengthó�� //lastmodified
    // File tmp=new File(wd,ar[1]);
    // ��ȿ���˻�
    // ========================
    // ..�̸� �ٸ��� ó��
    // ===========================
    // ������ �ٲ�ġ��
    // ..�� �θ�ɷ� ����ġ���
    // null�̸� ������
    // cd�� absoultoath
    // ���ϸ��� ����� �ִ°ܿ� split ��������
   case "dir":
    File[] files = wd.listFiles();
    if(files==null){
     System.out.println("������ �ڽ��� �����ϴ�.");
     continue ss;
    }
    if(files.length==0){
     System.out.println("0");
     continue ss;
    }
    for (int i = 0; i < files.length; i++) {
     
     long t2 = files[i].lastModified();
     boolean b = files[i].isDirectory();
     boolean b1=files[i].isHidden();
     if(b1){
      continue;
     }
     
     if (b) {
      String s = "<dir>";
      System.out.println(new Date(t2) + "\t\t" + s + "\t\t" + files[i].getName());
     } else {
      System.out.println(new Date(t2) + "\t\t" + files[i].length() +"KB"+ "\t\t" + files[i].getName());
     }
    }
    break;
   case "mkdir":
    if (ar.length == 1) {
     System.out.println("�߸��Է��ϼ̽��ϴ�.");
     continue ss;
    }
    if (ar.length == 2) {
     // ���丮�� ����
     File tmp = new File(wd, ar[1]);// �θ���͸��� temp���丮 ����
             // �θ���͸��� ������ false
     boolean b = tmp.mkdir();// ���丮�� ������.temp���丮����
     if (b) {
      continue ss;
     } else {
      System.out.println("�θ� ���丮�� ���ų� �̹� �ִ� �̸��Դϴ�.");
      continue ss;
     }
    } else {
     for (int i = 0; i < ar.length-1; i++) {
      File tmp = new File(wd, ar[i+1]);// �θ���͸��� temp���丮 ����
              // �θ���͸��� ������ false
      boolean b = tmp.mkdir();// ���丮�� ������.temp���丮����
      if (b) {
       System.out.println(ar[i+1]+" �����Ϸ�!");
      }else{
       System.out.println(ar[i+1]+"��/�� �̹� �ִ� �̸��̰ų� �θ� ���丮�� �����ϴ�.");
      }
     }
  
     continue ss;
    }
    /*
     * //���� boolean bbb=m.delete();//Ÿ���� ���ų� , ���͸��� ���, �Ҽӵ� �ֵ��� �ִٸ�
     * false System.out.println(bbb);
     * 
     * File t=new File("c:\\Windows");//�������ϸ� ����� �ִ�.
     * System.out.println(t+"is exist "+t.exists());
     * System.out.println(t+"is directory "+t.isDirectory());
     * boolean f=t.delete(); System.out.println(f);//�������� ������ ����������.
     */
   case "rename":
    if (ar.length == 3) {
     // �̸�����
     File nw = new File(wd, ar[1]);
     File tmp = new File(wd, ar[2]);// �����̳� ���丮�� �ٲܼ� �ִ�.
     boolean bb = nw.renameTo(tmp);// ��������� ���ų� ,�ٲٰ��� �ϴ� �̸��� �ְų�
             // �̸��� �ٲ�� ������ �������� �ִ� �͵���
             // �׷��� �ִ�.
     if (bb) {
      System.out.println(ar[1]+"�� "+ar[2]+"�� �ٲ���ϴ�.");
      continue ss;
     } else {
      System.out.println("��������� ���ų� ,�ٲٰ��� �ϴ� �̸��� �̹��ֽ��ϴ�.");
      continue ss;
     }
    } else {
     System.out.println("����� �߸��Ǿ����ϴ�.");
     continue ss;
    }
    default:
     System.out.println("����� �߸��Ǿ����ϴ�.");
   }
  }
 }
}

