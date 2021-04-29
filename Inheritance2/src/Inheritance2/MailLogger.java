package Inheritance2;

public class MailLogger extends Logger {
	
	@Override
	public void log() {
		System.out.println("Mail log");
	}
}