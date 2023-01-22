package com.test;

public class Find_first_and_last {
	
	int[] a = {1,2,7,7,7,7,8,8,9};
	
	int target = 7;
	int start = 0;
	int end = a.length-1;
	int[] ans = {-1,-1};
	
	public void find() {
		
		while(start<end) {
			int mid=(start+end)/2;
			if(target < a[mid]) {
				end=mid-1;
			}else if (target> a[mid]) {
				start=mid+1;
			}else {
				System.out.println(mid);
				break;
			}
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		Find_first_and_last f = new Find_first_and_last();
		f.find();
	}

}
