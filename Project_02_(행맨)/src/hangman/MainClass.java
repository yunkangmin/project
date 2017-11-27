package hangman;

import java.io.Console;
import java.util.Scanner;

public class MainClass {
 public static void main(String[] args) {

  Console c= System.console();
  String ctg="게임제목";

  String[] quiz="STARCRAFT,WARCRAFT,LINEAGE,OVERWATCH,BATTLEGROUND".split(",");
  System.out.println("주제는 .."+ctg+"입니다.");
  String pick=c.readLine("0~4까지 고르시오", null);
  //문자열 배열중에 하나를 랜덤픽하시고,
  //StringBuilder 하나를 만들어서, 퀴즈 length만큼 "?"혹은 "_"를 append
  StringBuilder show=new StringBuilder();
  for(int cnt=1;cnt<=quiz[Integer.parseInt(pick)].length();cnt++) {
   show.append("?");
  }
  System.out.println("선택하신 단어 : "+show);
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
   String pick1=c.readLine("알파벳하나를 선택하세요 (남은 기회:%s) :", limit);
   //limit--;
   if(pick1.length()>=2){
    System.out.println("문자하나만 입력하세요.");
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
     System.out.println("성공!!!");
     System.out.println(show);
     break;
    }
    if(limit==0){
     if(show.indexOf("?")!=-1){
      System.out.println("실패!!!");
     System.out.println(show);
     break;
     }
    }
    System.out.println(show);
   }
  }

 }


 //1.StringBuilder 상태를 출력
 //2.사용자로부터 문자를 입력받으시고 readline scanner 무조건 문자열로 입력받는다
 //(String charAt(0)해서 문자뽑아서 처리 두개입력하면 하나입력하라고 유도)
 //3.해당문자의 위치를 픽한 String에서 찾아야되고..
 //4.StringBuilder에서 그 위치에 해당하는 문자를 사용자가 입력한걸로 변경
 //1~4까지의 과정을 반복처리하시면 됨.
 //언제까지?StringBuilder의 문자열과 pick한 문자열이 같아지거나
 //혹은 카운트가 소진될때까지

 //요구사항!
 //1.사용자는 무조건 한문자씩 입력해야함. -(2문자 이상입력시 룰위배 라고 처리)
 //2.사용자는 대문자난 소문자를 입력해야함.

 //생각해볼것..?컴과의 대전으로 된다면.. 클래스를 만들어서 처리하는게 좋음
}

