package com.test;

import java.util.ArrayList;

public class Count_digit {
	
public static void main(String[] args) {
	

	int[] a = {1,2,3,4,4,5,6,7,4,6};
	ArrayList <Integer> ar = new ArrayList<Integer>();
	
	int count=0;
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]==4) {
			ar.add(a[i]);
			count++;
		}
		
}
	
	System.out.println(ar);
	System.out.println(count);

}
}
