package com.new1;

import java.util.ArrayList;

//public class Unique {
//	
//	public static void main(String[] args) {
//		
//	
//	
//	int a[] = {2,4,2,3,5,4,4,3,2,6,8,6,9,2};
//	
//	ArrayList<Integer> ar = new ArrayList<Integer>();
//	
//	for(int i =0;i<a.length;i++) {
//		int k =0;
//		if(!ar.contains(a[i])) {
//			ar.add(a[i]);
//			k++;
//			for(int j = i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					k++;
//				}
//			}
//			
////			System.out.println(a[i]);
////			System.out.println(k);
//			if(k==1) {
//				System.out.println(a[i] +"is unique number");
//		}
//		
//		}
//		
//		
//	}
//	
//	}

import java.util.HashSet;

public class Unique {
//	int[] a = {2, 4, 2, 3, 5, 4, 4, 3, 2, 6, 8, 6, 9, 2};
	int[] a = {2, 4, 3, 5, 1};
	int k=0;
    public  void checkUnique() {
        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
        	
            if (set.contains(i)) {
            	k++;
            	break;
            }else
            set.add(i);
            
        
        }
        if (k==1) {
        	System.out.println("Not all elements in the array are unique.");
        }else
        System.out.println("all elements in the array are unique.");
    
        }
    
    public static void main(String[] args) {
    	Unique ch = new Unique();
    	ch.checkUnique();
        
    }
}

