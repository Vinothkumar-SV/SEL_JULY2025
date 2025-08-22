package week3.day4;

public class Encapsulation {
	protected int atmPin = 1223;

	public void setAtmPin( int atmPin) {
		this.atmPin = atmPin;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setAtmPin(0567);
		System.out.println(obj.getAtmPin());
		System.out.println(obj.atmPin);
	
	}
	
	

}
