package week1.day2;

class DefaultClass {
	void show() {
		System.out.println("Default access modifier");
	}
}

public class AccessModifiersExamples {
	public int publicVar = 1;
	private int privateVar = 2;
	protected int protectedVar = 3;
	int defaultVar = 4; // default access

	public void publicMethod() {
		System.out.println("Public method");
	}

	private void privateMethod() {
		System.out.println("Private method");
	}

	protected void protectedMethod() {
		System.out.println("Protected method");
	}

	void defaultMethod() {
		System.out.println("Default method");
	}

	public static void main(String[] args) {
		AccessModifiersExamples ame = new AccessModifiersExamples();
		ame.publicMethod();
		ame.privateMethod();
		ame.protectedMethod();
		ame.defaultMethod();
		DefaultClass dc = new DefaultClass();
		dc.show();
	}
}
