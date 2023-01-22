package com.new1;

public class Arraytest1 {
	
	
//	public int find() {
//		int [] arr = {1,5,86,52,65,4,5,4};
//		
//		int target = 5;
//		int count=0;
//		for (int i=0;i<arr.length;i++) {
//			int element = arr[i];
//			if(element==target) {
//				System.out.println("the index is " + i);
//				break;
//			}	
//		}return -1;
//		
		
//	public int find1() {
//		
//		int [] arr = {1,5,4,86,52,58,4,65,78,2};
//		int start = 1;
//		int end = 5;
//		int target = 4;
//		
//		for(int i=start;i<end;i++) {
//			int element= arr[i];
//			if(element==target) {
//				System.out.println("the Index is " + i);
//				
//			}
//			
//		}
//		return -1;
//	}
	
//	public int find2(){
//		int [] arr = {1,45,86,520,5858,5,978,97,98};
//		
//		if(arr.length<0) {
//			return -1;
//		}
//		for(int i=0;i<arr.length;i++) {
//			int count=0;
//			int n = arr[i];
//			while(n>0) {
//				count++;
//			//	int n =arr[i];
//				n=n/10;		
//				
//			}
//			if(count % 2 == 0){
//				System.out.println(arr[i]);
//				
//			}
//			
//			
//		}
////		System.out.println("try");
//		return -1;
//		
//	}
	
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
//	
//	
//	public static void main(String[] args) {
//		int [] ar = {2,3,5,7,11,14,16,20,36,38,40,53};
//		int target=20;
//		int ans= find3(ar,target);
//		System.out.println(ans);
//		
//		
//	}	



//public void find3() {
//	
//	int [] ar = {2,3,5,7,11,14,16,20,36,38,40,53};
//	int target=457;
//	int start =0;
//	int end = ar.length-1;
//

//		while(start <= end) {
//			int mid = (start+end)/2;
//			if(target<ar[mid]) {
//				end=mid-1;
//			}else if(target>ar[mid]) {
//				start=mid+1;
//			}else {
//				System.out.println(mid);
//				break;
//			}
//			
//	}
//		System.out.println("try");
//	
//}

//	public void find4() {
//		int[] a = {2,5,6,8,9,25,60,65,85,92,99};
//		int target = 62;
//		int start = 0;
//		int end = a.length-1;
//		
//		while(start<=end){
//		int mid=(start+end)/2;
//		if(target>a[mid]) {
//			start=mid+1;	
//		}else if(target<a[mid]){
//			end=mid-1;
//		}else {
//			System.out.println(mid);
//			
//			
//		}
//		
//		}
//		System.out.println(start);
//		
//	}
	
	public void find4() {
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
