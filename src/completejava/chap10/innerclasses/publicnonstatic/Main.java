package completejava.chap10.innerclasses.publicnonstatic;

public class Main {
	public static void main(String[] args) {
		GearBox mcLaren = new GearBox(6);

		// 올바른 nested member class 인스턴스 생성 방법
		GearBox.Gear first = mcLaren.new Gear(1, 12.3);
		// GearBox.Gear second = new Gearbox.Gear(2, 15.4);
		// GearBox.Gear third = new mcLaren.Gear(3, 17.8);
		System.out.println(first.driveSpeed(1000));
	}
}
