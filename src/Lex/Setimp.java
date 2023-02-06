package Lex;

import java.util.Set;
import java.util.TreeSet;

public class Setimp {
	
	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>() ;
		s.add("Infosys");
		s.add("Google");
		s.add("IBM");
		
		for(String s1:s) {
			System.out.println(" "+ s1);
		s.clear();
		}
		
	}

}
