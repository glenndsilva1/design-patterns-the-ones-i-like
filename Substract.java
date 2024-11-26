package designpattern.strategy;

public class Substract implements Operation {
	@Override
	public void oper(int a, int b){
		System.out.println("Substraction is "+ (a-b));
	}
}
