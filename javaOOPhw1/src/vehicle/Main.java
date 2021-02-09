package vehicle;

public class Main {

	public static void main(String[] args) {
//		Car camsCar = new Car ();		
//		camsCar.setColor("Black");
//		camsCar.getColor();
//		camsCar.setnumberOfDoors(4);
//		camsCar.setCarType(Car.TYPE_SPORTS);
//	System.out.println(camsCar.getColor());
//	System.out.println(camsCar.getnumberOfDoors());
//		camsCar.start();
//		
//		Car blairsCar = new Car ();
//		blairsCar.setColor("Silver");
//		blairsCar.setnumberOfDoors(2);
//		blairsCar.setCarType(Car.TYPE_HYBRID);
//	System.out.println(blairsCar.getColor());
//	System.out.println(blairsCar.getnumberOfDoors());
//		blairsCar.start();
		
//		Car fam = new Car("White", 4);
//		fam.setCarType(Car.TYPE_FAMILY);
//	System.out.println(fam);
//	System.out.println(fam.getColor());
//	System.out.println(fam.getnumberOfDoors());
//		fam.start();
		
		Pet myPet = new Pet ("Eevee", 7, "Bengal", "1812 Maple Ave");
		Pet myOtherPet = new Pet ("Tiger", 3, "Tabby", "1812 Maple Ave");
		Pet blairsPet = new Pet("Beck", 5, "Russian blue", "Probably at our neighbors house lol");
		
//		Pet blairsPet = new Pet ();
		blairsPet.setfullName("Beck");
		blairsPet.setage(5);
		blairsPet.setbreed("Russian Blue");
		blairsPet.setlocation("Probably at our neighbors house lol");
	System.out.println(blairsPet.getfullName());
	System.out.println(blairsPet.getage());
	System.out.println(blairsPet.getbreed());
	System.out.println(blairsPet.getlocation());
	
	myPet.setfullName("Eevee");
	myPet.setage(5);
	myPet.setbreed("Bengal");
	myPet.setlocation("Home safe at 1812 Maple");
System.out.println(myPet.getfullName());
System.out.println(myPet.getlocation());
		
		blairsPet.sayHello();
		myPet.sayHello();
		myOtherPet.sayHello();
			
		
		

	}

}
