package functions;

public class ChainedFunc {
	int val;
	
	public ChainedFunc (int value) {
		this.val = value;
	}
	
	public ChainedFunc add(int num) {
		this.val = val+num;
		return this;
	}
	
	public ChainedFunc sub(int num) {
		this.val = val-num;
		return this;
	}
	public ChainedFunc mul(int num) {
		this.val = val*num;
		return this;
	}
	public ChainedFunc div(int num) {
		this.val = val/num;
		return this;
	}
	public void view() {
		System.out.println("Present value: "+this.val);
	}
	public static void main(String[] args) {
		ChainedFunc cf = new ChainedFunc(10);
		cf.add(4).sub(2).mul(10).div(2).view();
	}

}
