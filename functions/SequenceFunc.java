package functions;

public class SequenceFunc {
		int val;
		
		public SequenceFunc (int value) {
			this.val = value;
		}
		
		public SequenceFunc add(int num) {
			this.val = val+num;
			return this;
		}
		
		public SequenceFunc sub(int num) {
			this.val = val-num;
			return this;
		}
		public SequenceFunc mul(int num) {
			this.val = val*num;
			return this;
		}
		public SequenceFunc div(int num) {
			this.val = val/num;
			return this;
		}
		public void view() {
			System.out.println("Present value: "+this.val);
		}
		public static void main(String[] args) {
			ChainedFunc cf = new ChainedFunc(10);
			cf.add(4).view();
			cf.sub(4).view();
			cf.mul(5).view();
			cf.div(2).view();
		}
	}

