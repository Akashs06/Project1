package com.test;

import com.new1.Arraytest1;

public class Arrayceiling {
//	
//	public static int find3(int[] ar, int target) {
//		int start =0;
//		int end = ar.length-1;
//		
//			while(start <= end) {
//				int mid = (start+end)/2;
//				if(target<ar[mid]) {
//					end=mid-1;
//				}else if(target>ar[mid]) {
//					start=mid+1;
//				}else {
//					return mid;
//					
//				}
//				
//		}
//			return -1;
//		
//	}
//	public static void main(String[] args) {
//	int [] ar = {2,3,5,7,11,14,16,20,36,38,40,53};
//	int target=20;
//	int ans= find3(ar,target);
//	System.out.println(ans);
//	
//}	
//}

//public void find3() {
//
//int [] ar = {2,3,5,7,11,14,16,20,36,38,40,53};
//int target=457;
//int start =0;
//int end = ar.length-1;
//

//	while(start <= end) {
//		int mid = (start+end)/2;
//		if(target<ar[mid]) {
//			end=mid-1;
//		}else if(target>ar[mid]) {
//			start=mid+1;
//		}else {
//			System.out.println(mid);
//			break;
//		}
//		
//}
//	System.out.println("try");
//
//}


public void find() {
	int[] a = {'a','c','e','h','k','m','p','w'};
	int target = 'd';
	int start = 0;
	int end = a.length-1;
	
	while(start<=end){
	int mid=(start+end)/2;
	if(target>a[mid]) {
		start=mid+1;	
	}else if(target<a[mid]){
		end=mid-1;
	}else {
		System.out.println(mid+1);
		break;
		
	}
	
	}
	System.out.println(start);
	
}
public static void main(String[] args) {
	Arraytest1 at = new Arraytest1();
	at.find4();
	
}
}
