package Lex;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("try in");
			return;
		} finally {
			System.out.println("in finally");
			// TODO: handle exception
		}
	//	System.out.println("outside");
	}

}
