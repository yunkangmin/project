package game;

import java.util.Arrays;

public abstract class NumberManager {
	int [] nums;
	public NumberManager() {
		nums=new int[25];
	}
	//매개변수로 전달받는 n값이 이미 nums배열에 있는지 확인
	public abstract boolean contains(int n);
	//매개변수로 전달받는 n값을 비어있는 칸을 찾아서 세팅을 시키면 됨.
	public abstract void add(int n);
	//랜덤숫자 뽑아서, 자기의 배열에 안가지고 있는 값이면 add시키고 그값을 리턴
	//컴퓨터용
	public abstract int pick();
	public String toString() {
		return Arrays.toString(nums);
	}
}
