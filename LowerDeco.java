package designpattern.decorator;

public class LowerDeco  extends TextDeco {
	public LowerDeco(Text text){
		super(text);
	}

	@Override
	public String toText() {
		return this.text.toText().toLowerCase();
	}
}
