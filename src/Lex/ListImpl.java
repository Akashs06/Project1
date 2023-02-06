package Lex;

import java.util.ArrayList;

import java.util.List;

public class ListImpl {
	
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Infosys");
		al.add("google");
		al.add("imb");
		al.add("Amazon");
		for (int i = 0; i < al.size(); i++) {
			al.remove(i);
			if(al.get(i++).equals("google")){
				al.add("Oracle");
			}
		}
		System.out.println(al);
	}

}
