package Package;

import Package.Class1.classA;

public class Class2 extends classA {
	int speed;

	public int getSpeed(int speed) {
		this.speed = speed;
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public static void main(String[] args) {

		Class2 obj = new Class2();
		obj.OUTPUT();
		System.out.println(new Class2().OUTPUT());
		System.out.println(obj.getSpeed(12));
	}

}
