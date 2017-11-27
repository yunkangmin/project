package hangman;

import java.io.Console;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MainClass2 {
 public static void main(String[] args) {
//1단계, 게임 밑작업========================
  Console c= System.console();
  String ctg="그리스신 ";

  String[] quizs="STARCRAFT,WARCRAFT,LINEAGE,OVERWATCH,BATTLEGROUND".split(",");
  String quiz=quizs[(int)(Math.random()*quizs.length)];
  System.out.println("주제는 .."+ctg+"입니다.");
  
  //문자열 배열중에 하나를 랜덤픽하시고,
  //StringBuilder 하나를 만들어서, 퀴즈 length만큼 "?"혹은 "_"를 append
  StringBuilder show=new StringBuilder();
  while(show.length()<quiz.length()) {
	  show.append("?");
  }
  
  //2단계, 게임유도================
 //큰흐름을 보자.
  
  Set<Character> s=new LinkedHashSet<>();
  int limit= 5;
  while(limit>0){
   String in=c.readLine("%s (남은 기회:%s) :",show.toString(), limit);
   if(in.length()>=2){
    System.out.println("문자하나만 입력하세요.");
    continue;
   }
   char ch=in.toUpperCase().charAt(0);
   boolean f=s.contains(ch);
  // boolean b=s.add(ch);
   /*if(b==false) {
	   System.out.println(ch+"는 이미 입력한 문자입니다.");
	   continue;
   }*/
   if(f==true) {
	   System.out.println("이미 입력했던 문자입니다.");
	   System.out.println(s.toString());
	   continue;
   }
   //문서에서 set하면 해당단어만 남는다.
   else {
	   s.add(Character.valueOf(ch));
	   //s.add(ch);
	   //기본형데이터와 Wrapper 객체간에는  Auto boxing이 일어남.
	   
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
	   System.out.println(ch+"는(은) 없는 문자입니다.");
	   limit--;
   }
   if(show.toString().equals(quiz)) {
	   System.out.println("축하드립니다.");
	   break;
   }
  }
  System.out.println("정답은.["+quiz+"]");
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
 
 //set을 이용해서 문자들을 차례대로 담는다.
 //set계열의 객체 하나를 같이 돌리면서 사용자가 입력한 문자들을 모아두고,
 //같은 문자를 입력하게 됬을때, 이미 입력한 문자다.라고 알림만 유도
 //add->false뜨면 이미 입력한 문자다 라고하고 continue;ture가 떳을때만 작업
}

