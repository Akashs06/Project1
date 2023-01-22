package com.new1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice {
	

		/*int k=1;
		
		for(int i =1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");
		}*/
		
		
//		int a [][] = {{5,6,7},{6,7,4},{1,2,3}};	
//		int min = a[0][0];
//		int mincl;
//		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				
//				if(a[i][j]<min){
//					min=a[i][j];
//					mincl=j;
//				}
//			}
//		}
//		System.out.print(min);
		
	public static void main(String[] args) {	
		
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat de = new SimpleDateFormat("M/d/yyyy");
		System.out.println(de.format(d));
		
		
		
		
		
		
		
		
		
		
		
	}

}
