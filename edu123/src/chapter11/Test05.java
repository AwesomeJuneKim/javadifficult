package chapter11;

public class Test05 {

	int battery = 0;

	public void charge(int time) throws Exception {

		if (time < 0) {
			time = 0;

			throw new NagativeNumberException();

		}
		battery += time;
		System.out.println("현재배터리: " + battery);
	}

	public static void main(String[] args) {
		try {
			Test05 test = new Test05();
			test.charge(30);
			test.charge(20);
			test.charge(-10);

		} catch (Exception e) {
			System.out.println("음수는 허용하지 않습니다.");
		}
	}

}
