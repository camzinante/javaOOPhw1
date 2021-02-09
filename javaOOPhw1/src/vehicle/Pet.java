package vehicle;

public class Pet {

private String fullName;
private Integer age; 
private String breed;
private String location;

//NTS empty constructor (also referred to as a no arg constructor)
public Pet(){}

//NTS args constructor
//all args used in this constructor 
public Pet(String fullName, int age, String breed, String location) {
	this.fullName = fullName;
	this.age = age;
	this.breed = breed;
	this.location = location;
}

public String getfullName() {
	return fullName;
}

public void setfullName(String fullName) {
	this.fullName = fullName;	
}

public Integer getage() {
	return age;
}

public void setage(int age) {
	this.age = age;
}

public String getbreed() {
	return breed;
}

public void setbreed(String breed) {
	this.breed = breed;
}
public String getlocation() {
	return location;
}

public void setlocation(String location) {
	this.location = location;
}

//public Pet(String fullName) {
//	this.fullName = fullName;

public void sayHello(){
	System.out.println("Hello from our kitty cat named " + this.fullName);

	
	}

}
