package enacapsulation;

public class LearnEncapsulation {

	private int creditcardPin;

	private void setpin(int pin) {
		creditcardPin = pin;

	}
	protected int getpin() {
		setpin(1234);
		return creditcardPin;
	}

	public static void main(String[] args) {
		LearnEncapsulation me = new LearnEncapsulation();
		me.setpin(1234);
		me.getpin();
		System.out.println(me.creditcardPin);

	}

}
