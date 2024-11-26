package designpattern.decorator;

public class UpperDeco extends TextDeco {
	public UpperDeco(Text text){
		super(text);
	}

	@Override
	public String toText() {
		return this.text.toText().toUpperCase();
	}
}
