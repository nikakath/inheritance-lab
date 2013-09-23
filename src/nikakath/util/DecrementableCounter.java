package nikakath.util;

public class DecrementableCounter extends Counter {

	public static void main(String[] args) {

	}

	public DecrementableCounter(int start) {
		super(start);
	} // DecrementableCounter(int)
	
	public void decrement() {
		this.count--;
	}
	
} // class DecrementableCounter
