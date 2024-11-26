package designpattern.decorator;

public class ConText implements Text{
	String name;
	
	ConText(String name){
		this.name = name;
	}

	@Override
	public String toText() {
		return this.name;
	}

}
