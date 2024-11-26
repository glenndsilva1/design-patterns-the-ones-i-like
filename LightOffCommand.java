package designpattern.command;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.off();
	}
	
	public static void main(String args[]) {
		Command lightoff = new LightOffCommand(new Light());
		lightoff.execute();
		Command lighton = new LightOnCommand(new Light());
		lighton.execute();
	}
}
