package designpattern.adaptor;

public class NameAdaptor implements NameInterface {
	OldSystem oldsystem;
	
	public NameAdaptor(OldSystem oldsystem) {
		this.oldsystem = oldsystem;
	}
	
	@Override
	public String firstname() {
		String fname = this.oldsystem.getFullName().split(" ")[0];
		return fname;
	}

	@Override
	public String lastname() {
		String sname = this.oldsystem.getFullName().split(" ")[1];
		return sname;
	}
	
	public static void main(String args[]) {
		OldSystem osystem = new OldSystem("Glenn Dsilva");
		System.out.println(osystem.getFullName());
		NameAdaptor nm = new NameAdaptor(osystem);
		System.out.println(nm.firstname());
		System.out.println(nm.lastname());
	}
}
