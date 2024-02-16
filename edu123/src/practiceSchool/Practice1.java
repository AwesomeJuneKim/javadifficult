package practiceSchool;

public class Practice1 {
	interface Vehicle{
		public abstract void showVehicle();
	}
	class Truck implements Vehicle{
		int weight;//변수
		public Truck(int weight) {
			this.weight=weight;
		}//생성자로 weight를 초기화
		public void showVehicle() {
			System.out.println("Truck: weight="+weight);
		}
	}
	class Car implements Vehicle{
		int vehicleOccupants;
		public Car(int vehicleOccupants) {
			this.vehicleOccupants=vehicleOccupants;
		}
		public void showVehicle() {
			System.out.println("Car: vehicleOccupants="+vehicleOccupants);
		}
	}
	class Taxi extends Car{
		int mileage;
		public Taxi(int vehicleOccupants, int mileage) {
			super(vehicleOccupants);
			this.mileage=mileage;
		}
		@Override
		public void showVehicle() {
			super.showVehicle();	//질문!!!!! 왜 위에거랑 다르게 새로 추가 되었나요?
			System.out.println("Taxi: mileage="+mileage);
		}
	}
	class MotorCycle implements Vehicle{
		int price;
		public MotorCycle(int price)
	}
	

}
