package hangman;

import java.io.Console;
import java.util.Scanner;

public class MainClass {
 public static void main(String[] args) {

  Console c= System.console();
  String ctg="��������";

  String[] quiz="STARCRAFT,WARCRAFT,LINEAGE,OVERWATCH,BATTLEGROUND".split(",");
  System.out.println("������ .."+ctg+"�Դϴ�.");
  String pick=c.readLine("0~4���� ���ÿ�", null);
  //���ڿ� �迭�߿� �ϳ��� �������Ͻð�,
  //StringBuilder �ϳ��� ����, ���� length��ŭ "?"Ȥ�� "_"�� append
  StringBuilder show=new StringBuilder();
  for(int cnt=1;cnt<=quiz[Integer.parseInt(pick)].length();cnt++) {
   show.append("?");
  }
  System.out.println("�����Ͻ� �ܾ� : "+show);
  char p ;
  /*char[] cha= quiz[Integer.parseInt(pick)].toCharArray();
  int cnt=0;
  for(int i=0;i<cha.length;i++){
  for(char j='A';j<'Z';j++){
    if(cha[i]==(char)j){
     cnt++;
    break;
    }
    if()
   
   }
  }
  System.out.println(cnt);*/
  int limit= quiz[Integer.parseInt(pick)].length();
  while(limit>0){
   String pick1=c.readLine("���ĺ��ϳ��� �����ϼ��� (���� ��ȸ:%s) :", limit);
   //limit--;
   if(pick1.length()>=2){
    System.out.println("�����ϳ��� �Է��ϼ���.");
    //limit++;
    continue;
   }

   else{
    String up=pick1.toUpperCase();
    p=up.charAt(0);
    int search=0;
    boolean find=false;
    while(true){
     int i=quiz[Integer.parseInt(pick)].indexOf(p,search);
     if(i==-1) {
    	// limit--;
      break;
     }
     show.setCharAt(i,p);
     i=search++;
     find=true;
     
    }
    if(find==false)
    	limit--;
    if(show.indexOf("?")==-1){
     System.out.println("����!!!");
     System.out.println(show);
     break;
    }
    if(limit==0){
     if(show.indexOf("?")!=-1){
      System.out.println("����!!!");
     System.out.println(show);
     break;
     }
    }
    System.out.println(show);
   }
  }

 }


 //1.StringBuilder ���¸� ���
 //2.����ڷκ��� ���ڸ� �Է¹����ð� readline scanner ������ ���ڿ��� �Է¹޴´�
 //(String charAt(0)�ؼ� ���ڻ̾Ƽ� ó�� �ΰ��Է��ϸ� �ϳ��Է��϶�� ����)
 //3.�ش繮���� ��ġ�� ���� String���� ã�ƾߵǰ�..
 //4.StringBuilder���� �� ��ġ�� �ش��ϴ� ���ڸ� ����ڰ� �Է��Ѱɷ� ����
 //1~4������ ������ �ݺ�ó���Ͻø� ��.
 //��������?StringBuilder�� ���ڿ��� pick�� ���ڿ��� �������ų�
 //Ȥ�� ī��Ʈ�� �����ɶ�����

 //�䱸����!
 //1.����ڴ� ������ �ѹ��ھ� �Է��ؾ���. -(2���� �̻��Է½� ������ ��� ó��)
 //2.����ڴ� �빮�ڳ� �ҹ��ڸ� �Է��ؾ���.

 //�����غ���..?�İ��� �������� �ȴٸ�.. Ŭ������ ���� ó���ϴ°� ����
}

