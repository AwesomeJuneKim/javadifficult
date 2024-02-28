package chapter11;

public class Test05 {

	int battery = 0;

	public void charge(int time) throws Exception {

		if (time < 0) {
			time = 0;//음수값을 0으로 보정한다.
			//일반적으로 음수 값은 함수나 메소드에 전달되면 안 되는 잘못된 입력값이기 때문

			throw new NagativeNumberException("마이너스는 안돼.");

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
			System.out.println(e.getMessage());
		}
	}

}
