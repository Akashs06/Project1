package Lex;

public class VarargsTest {
	public static void main(String[] args) {
		new VarargsTest().display(5, "infosys");
		new VarargsTest().display(4, "infosys","Limited");
		
	}
	public void display(int b , String...strings ) {
		System.out.print(strings[strings.length-1]+" ");
	}

}
