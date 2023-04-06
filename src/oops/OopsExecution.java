package oops;

public class OopsExecution {

	public static void main(String[] args) {
		Encap e = new Encap();
		int add = e.add(5, 10);
		System.out.println(add);
		e.interfaceMethod();
		e.classOneMethod();
		e.classTwoMethod();
		e.setUsername("alanmm");
		e.setPassword("password");
		String username = e.getUsername();
		String password = e.getPassword();
		System.out.println(username + password);
	}
}
