package hangman;

import java.io.Console;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MainClass2 {
 public static void main(String[] args) {
//1�ܰ�, ���� ���۾�========================
  Console c= System.console();
  String ctg="�׸����� ";

  String[] quizs="STARCRAFT,WARCRAFT,LINEAGE,OVERWATCH,BATTLEGROUND".split(",");
  String quiz=quizs[(int)(Math.random()*quizs.length)];
  System.out.println("������ .."+ctg+"�Դϴ�.");
  
  //���ڿ� �迭�߿� �ϳ��� �������Ͻð�,
  //StringBuilder �ϳ��� ����, ���� length��ŭ "?"Ȥ�� "_"�� append
  StringBuilder show=new StringBuilder();
  while(show.length()<quiz.length()) {
	  show.append("?");
  }
  
  //2�ܰ�, ��������================
 //ū�帧�� ����.
  
  Set<Character> s=new LinkedHashSet<>();
  int limit= 5;
  while(limit>0){
   String in=c.readLine("%s (���� ��ȸ:%s) :",show.toString(), limit);
   if(in.length()>=2){
    System.out.println("�����ϳ��� �Է��ϼ���.");
    continue;
   }
   char ch=in.toUpperCase().charAt(0);
   boolean f=s.contains(ch);
  // boolean b=s.add(ch);
   /*if(b==false) {
	   System.out.println(ch+"�� �̹� �Է��� �����Դϴ�.");
	   continue;
   }*/
   if(f==true) {
	   System.out.println("�̹� �Է��ߴ� �����Դϴ�.");
	   System.out.println(s.toString());
	   continue;
   }
   //�������� set�ϸ� �ش�ܾ ���´�.
   else {
	   s.add(Character.valueOf(ch));
	   //s.add(ch);
	   //�⺻�������Ϳ� Wrapper ��ü������  Auto boxing�� �Ͼ.
	   
   }
   boolean found=false;//int cnt=0;
   //int from=0;
   /*
    * while(true){
    * int idx=quiz.indexOf(ch);
    * if(idx==-1)
    * break;
    * else{
    * show.setChatAt(idx,ch);
    * cnt++;
    * from=idx+1;
    * }
    * }
    * 
    */
   for(int i=0;i<quiz.length();i++) {
	   if(quiz.charAt(i)==ch) {
		   show.setCharAt(i, ch);
		   found=true;//cnt++;
	   }
   }
   if(found==false) {//if(cnt==0)
	   System.out.println(ch+"��(��) ���� �����Դϴ�.");
	   limit--;
   }
   if(show.toString().equals(quiz)) {
	   System.out.println("���ϵ帳�ϴ�.");
	   break;
   }
  }
  System.out.println("������.["+quiz+"]");
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
 
 //set�� �̿��ؼ� ���ڵ��� ���ʴ�� ��´�.
 //set�迭�� ��ü �ϳ��� ���� �����鼭 ����ڰ� �Է��� ���ڵ��� ��Ƶΰ�,
 //���� ���ڸ� �Է��ϰ� ������, �̹� �Է��� ���ڴ�.��� �˸��� ����
 //add->false�߸� �̹� �Է��� ���ڴ� ����ϰ� continue;ture�� �������� �۾�
}

