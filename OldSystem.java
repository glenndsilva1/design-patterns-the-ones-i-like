package designpattern.adaptor;

// is an old system 
public class OldSystem {
	private String fullname;
	
	public OldSystem(String fullname) {
		this.fullname = fullname;
	}
	
	public String getFullName() {
		return fullname;
	}
}
