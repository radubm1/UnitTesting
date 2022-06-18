
public class Calculator {
	double a;
	double b;
	
	public Calculator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double sum() {
		return a+b;
	}
	public double dif() {
		return a-b;
	}
	public double other(Operation op) {
		return op.apply();
	}

}
