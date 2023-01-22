package com.test;

import java.util.ArrayList;
import java.util.List;

public class Binary4digit {

	public List<Integer> find2() {
		int[] arr = {};
		List<Integer> result = new ArrayList();

//		if (arr.length < 0) {
//			result = null;
//			return result;
			
//		}
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int n = arr[i];
			while (n > 0) {
				count++;
				// int n =arr[i];
				n = n / 10;
				
				Object o = null;
				

			}
			if (count % 2 == 0) {
//				System.out.println(arr[i]);
				result.add(arr[i]);

			}

		}
//	System.out.println("try");
		return result;

	}

	public static void main(String[] args) {
		Binary4digit b = new Binary4digit();
		List<Integer> e = b.find2();
		if (e != null && e.size() > 0) {
			System.out.println(e);
		} else {
			System.out.println("List is empty");
		}

	}

}
