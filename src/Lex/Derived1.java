package Lex;

public class Derived1 extends Base1{
	
	public static  void method() {
		System.out.println("Deriver class");
	}
	
	public static void main(String[] args) {
		Base1 bs = new Derived1();
		bs.method();
		method();
	}


}
