package designpattern.decorator;

public class Test {
    public static void main(String args[]) {
    	
    	Text t = new LowerDeco(
    				new UpperDeco(
    					new ConText("gLenn")));
    	System.out.println(t.toText());
    }
}
