package day_2;

public class DecisionMakingWithOperatorsDemo {

	public static void main(String[] args) {
		int a=5,b=10;
		if(a>=5 && b<11) {
			System.out.println("&& is executed");
		}
		if(a==5 || b==20) {
			System.out.println("|| is done");
		}
		if(a>b) {
			System.out.println("a is larger");
		}
		else {
			System.out.println("b is larger");
		}
	}

}
