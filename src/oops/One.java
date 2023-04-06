package oops;

public class One implements Abs {

//	Method overloading
	public int add(int a,int b) {
     int c=a+b;
      return c;
	}
	
	public void classOneMethod() {
       System.out.println("class one method");
	}

	@Override
	public void interfaceMethod() {
       System.out.println("interface method.");		
	}
}
