package com.test;

public class Pattern_test {
	
	public static void main(String[] args) {
		
//		for(int row=1;row<=5;row++) {
//			for(int col=5;col>=row;col--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=2*5;i++) {
//			int c= i>5 ? 2*5-i:i;
//			for(int j=1;j<c;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		int size =5;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size-i;j++) {
				System.out.print(" ");
			}
				for(int k=0;k<i;k++) {	
					System.out.print("*");
			}
			
				System.out.println();
		}
	}

}
