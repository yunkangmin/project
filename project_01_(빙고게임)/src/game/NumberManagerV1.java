package game;

public class NumberManagerV1 extends NumberManager {

	@Override
	public void add(int n) {
		for(int idx=0;idx<nums.length;idx++) {
			if(nums[idx]==0) {
				nums[idx]=n;
				break;
			}
		}
	}
	@Override
	public boolean contains(int n) {
		boolean find=false;
		for(int idx=0;idx<nums.length;idx++) {
			if(nums[idx]==n) {
				find=true;
				break;
			}
		}
		return find;
	}
	@Override
	public int pick() {
		while(true) {
			int r=1+(int)(Math.random()*25);
			if(contains(r)==false) {
				add(r);
				return r;
			}
		}
	}
}
