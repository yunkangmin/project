package cmd;

import java.io.Console;
import java.io.File;
import java.util.Date;

public class CMDShellMain {
 public static void main(String[] args) {
  System.out.println();
  Date d = new Date(System.currentTimeMillis());

  System.out.println("Connected to CMD : " + d.toString());// 커스텀cmd
  Console con = System.console();
  File wd = new File("c:\\Users");// 윈도우기반이라면 씨드라이브가있다.
  // 디폴트 경로
  ss: while (true) {
   String cmd = con.readLine(wd.getAbsolutePath() + ">");
   // cmd도 프로그램이다 파일시스템을 진행하는
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
       System.out.println("올라갈곳이 없습니다.");
       continue ss;
      }
      boolean a = tmp.exists();
      if (a) {
       wd = tmp;
       continue ss;
      } else {
       System.out.println("부모디렉토리가 없습니다.");
       continue ss;
      }

     } else {
      File tmp = new File(wd, ar[1]);
      boolean a = tmp.exists();
      if (a) {
       wd = tmp;
       continue ss;
      } else {
       System.out.println("그런파일이 없습니다. 다시입력하세요.");
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
      System.out.println("그런 디렉토리가 없습니다.");
      continue ss;
     }
    }
    // length처리 //lastmodified
    // File tmp=new File(wd,ar[1]);
    // 유효성검사
    // ========================
    // ..이면 다르게 처리
    // ===========================
    // 맞을때 바꿔치기
    // ..은 부모걸로 갈아치우기
    // null이면 못간다
    // cd면 absoultoath
    // 파일명이 띄워져 있는겨우 split 개수제한
   case "dir":
    File[] files = wd.listFiles();
    if(files==null){
     System.out.println("파일은 자식이 없습니다.");
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
     System.out.println("잘못입력하셨습니다.");
     continue ss;
    }
    if (ar.length == 2) {
     // 디렉토리로 생성
     File tmp = new File(wd, ar[1]);// 부모디렉터리에 temp디렉토리 생성
             // 부모디렉터리가 없으면 false
     boolean b = tmp.mkdir();// 디렉토리로 생성함.temp디렉토리생성
     if (b) {
      continue ss;
     } else {
      System.out.println("부모 디렉토리가 없거나 이미 있는 이름입니다.");
      continue ss;
     }
    } else {
     for (int i = 0; i < ar.length-1; i++) {
      File tmp = new File(wd, ar[i+1]);// 부모디렉터리에 temp디렉토리 생성
              // 부모디렉터리가 없으면 false
      boolean b = tmp.mkdir();// 디렉토리로 생성함.temp디렉토리생성
      if (b) {
       System.out.println(ar[i+1]+" 생성완료!");
      }else{
       System.out.println(ar[i+1]+"은/는 이미 있는 이름이거나 부모 디렉토리가 없습니다.");
      }
     }
  
     continue ss;
    }
    /*
     * //삭제 boolean bbb=m.delete();//타겟이 없거나 , 디렉터리인 경우, 소속된 애들이 있다면
     * false System.out.println(bbb);
     * 
     * File t=new File("c:\\Windows");//말단파일만 지울수 있다.
     * System.out.println(t+"is exist "+t.exists());
     * System.out.println(t+"is directory "+t.isDirectory());
     * boolean f=t.delete(); System.out.println(f);//하위것이 있으면 안지워진다.
     */
   case "rename":
    if (ar.length == 3) {
     // 이름변경
     File nw = new File(wd, ar[1]);
     File tmp = new File(wd, ar[2]);// 파일이나 디렉토리를 바꿀수 있다.
     boolean bb = nw.renameTo(tmp);// 원본대상이 없거나 ,바꾸고자 하는 이름이 있거나
             // 이름만 바뀌기 때문에 그하위에 있는 것들은
             // 그래도 있다.
     if (bb) {
      System.out.println(ar[1]+"을 "+ar[2]+"로 바꿨습니다.");
      continue ss;
     } else {
      System.out.println("원본대상이 없거나 ,바꾸고자 하는 이름이 이미있습니다.");
      continue ss;
     }
    } else {
     System.out.println("명령이 잘못되었습니다.");
     continue ss;
    }
    default:
     System.out.println("명령이 잘못되었습니다.");
   }
  }
 }
}

