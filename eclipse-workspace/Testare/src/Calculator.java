
public class Calculator {
	int a;
	int b;
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int sum() {
		return a+b;
	}
	public int dif() {
		return a-b;
	}
	
	public int other(Operation op) {
		return op.apply();
	}
}
