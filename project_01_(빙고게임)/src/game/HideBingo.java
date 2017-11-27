package game;

public class HideBingo extends Bingo{
public HideBingo(int num) {
	this.num=num;
	this.flag=false;
}
public String toString() {
	if(flag)
		return "XX";
	else
		return "??";
}
}
