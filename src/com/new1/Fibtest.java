package com.new1;

import java.util.ArrayList;

public class Fibtest {
	
	
	public static void main(String[] args) {
		
//		int a = 0;
//		int b = 1;
//		int count = 1;
//		int n =6;
//		while (count<=n) {
//			int temp =b;
//			b=b+a;
//			a =temp;
//			count++;
//		}
//		System.out.println(a);
		
		
		int[] a = {1,2,3,4,4,5,6,7,4,6};
		ArrayList <Integer> ar = new ArrayList<Integer>();
		
		int count=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==4) {
				ar.add(a[i]);
				count++;
			}
//			
	}
//		
	System.out.println(ar);
	System.out.println(count);
//		
//		int a = 12476;
//	//	int x=a;
//		int value =0;
//		while(a>0) {
//			int b = a%10;
//			a/=10;
//			value = value*10+b;
//			
//		}
//		System.out.println(value);
//	}
	}
}
