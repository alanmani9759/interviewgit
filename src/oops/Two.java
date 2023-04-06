package oops;

public class Two extends One {

//	override method
	@Override 
	public void classOneMethod() {
		System.out.println("ClassoneMethod overrided");
		super.classOneMethod();
	}
	
	public void classTwoMethod() {
      System.out.println("class two method");
	}
}
