package com.test;

public class Infinite_search {
	
	public void find() {
	
	int [] ar = {2,3,5,7,11,14,16,20,36,38,40,53};
	int target=16;
	int start =0;
	int end = 5;
	

		while(start <= end) {
			int mid = (start+end)/2;
			if(target<ar[mid]) {
				end=mid-1;
			}else if(target>ar[mid]) {
				start=mid+1;
			}else {
				System.out.println(mid);
			}
//			if()
			
	}
//		System.out.println("try");
	
	}
	
	public static void main(String[] args) {
		Infinite_search is = new Infinite_search();
		is.find();
	}

}
