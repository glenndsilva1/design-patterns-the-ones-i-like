package designpattern.strategy;

public class Add implements Operation{
	@Override
	public void oper(int a, int b) {
		System.out.println("Addition is "+ (a+b));
	}
}
