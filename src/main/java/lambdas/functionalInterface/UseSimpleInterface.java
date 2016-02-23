package lambdas.functionalInterface;

import lambdas.functionalInterface.interfaces.SimpleInterface;

public class UseSimpleInterface {

	public static void main(String[] args) {

		SimpleInterface obj = () -> System.out.println("Say something");
		obj.doSomething();
		
	}

}
