//package vehicle;
//
//
//public class Car {
//		private static final int MAX_DOORS = 5;
//		private static final int MIN_DOORS = 1; 
//		public static final String TYPE_SPORTS = "Sports";
//		public static final String TYPE_HYBRID = "Hybrid";
//	
//		private String carType;
//		private String color;
//		private Integer numberOfDoors;
//		public String setColor;
//		private Integer speed;
//		private Integer currentRPM;
//		
//		public Car(){}
//		
//		public Car (String color, Integer numberOfDoors){
//			this.color = color;
//			this.numberOfDoors = numberOfDoors;
//		}
//		public String getCarType() {
//			return carType;
//		}
//		
//		public void setCarType(String carType ) {
//			this.carType = carType;
//		}
//		
//		public String getColor() {
//			return color;
//		}
//		
//		public void setColor(String color) {
//			this.color = color;
//		}
//		
//		public Integer getnumberOfDoors() {
//			return numberOfDoors;
//		}
//		
//		public void setnumberOfDoors(Integer numberOfDoors) {
//		  if(numberOfDoors >= MIN_DOORS && numberOfDoors <= MAX_DOORS) {
//			  this.numberOfDoors = numberOfDoors;  
//		  } else {
//			this.numberOfDoors = -1;
//		  }	
//		}
//		
//		public Integer getCurrentRPM() {
//			return currentRPM;
//		}
//		
//		private void setCurrentRPM(int rpm) {
//			this.currentRPM = rpm;
//		}
//		
//		public Integer getSpeed() {
//			return speed;
//		}
//		
//		public void setSpeed(int speed) {
//			this.speed = speed;
//			setCurrentRPM(calculateRPM(speed));
//		}
//		private int calculateRPM(int speed) {
//			int rpm = 0;
//		//calculations 
//			return rpm;
//		}
//		
//		public void start() {
//			System.out.println("Car is starting, vroom vroom!");
//		}
//		
//		public void stop () {
//			System.out.println("Car is stopping, screech screech!");
//		}
//		
//		public void drive () {
//			System.out.println("Car is driving, vroom vroom!");
//		}
//		
//		@Override
//		public String toString()
//		{
//			return String.format("This %s car has %d doors and is %s",
//									this.getCarType(),
//									this.getnumberOfDoors(),
//									this.getColor());
//		}
//
//	}
//
