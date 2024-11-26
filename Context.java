package designpattern.strategy;

public class Context {
	Operation operation;
	
	Context(Operation operation){
		this.operation = operation;
	}
	
	public void execute(int a, int b) {
		this.operation.oper(a, b);
	}
	
	public static void main(String args[]) {
		Context context = new Context(new Add());
		context.execute(1, 2);
		Context context1 = new Context(new Substract());
		context1.execute(2, 2);
	}
}
