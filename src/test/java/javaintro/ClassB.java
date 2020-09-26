package javaintro;

public class ClassB {

	// I want to add 2 number
	// i want to print username and passoword
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// how to call those methods
		// appium class and methods // how to call them
		// we call methods with help of objects
		// we create an object pointing to that class, using this object you can access all the class method
		
		// SYntaxt for creating an object
		
		ClassA obj= new ClassA();
		
		obj.sum();
		obj.login("sonal", "abc@123");
		
		
		// classname.methodname  // statci method
		
		ClassA.sum(10, 20);
		
		
		
		
		
		
		
		
	}


}