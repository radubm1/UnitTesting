
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc= new Calculator(2,3);
		/*
		 * System.out.println(calc.other(new Operation() {
		 * 
		 * @Override public double apply() { // TODO Auto-generated method stub return
		 * calc.a/calc.b; }
		 * 
		 * }));
		 */
		System.out.println(calc.other(() -> {return calc.a/calc.b;}));
	}

}
