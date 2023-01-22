package com.test;

import java.util.Arrays;

public class Bubble_sort {
	
	public static void main(String[] args) {
		
		int [] a = {3,1,-2,-32,2,69,5,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];	
					a[j-1]=temp;
				}
				
			}
		}System.out.println(Arrays.toString(a));
		
	
	}
	
	
}
