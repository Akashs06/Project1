package com.new1;

public class Day3_02 extends Day3_01 { //hierarchical inheritance 
	
	public void totalYrs() {
		System.out.println("Total Years: 3");
	}
	public void totalSem() {
		System.out.println("Total Sem: 6");
	}
	
	public static void main(String[] args) {
		Day3_02 d = new Day3_02();
		d.totalYrs();
		d.totalSem();
		d.stdId();
		d.stdDept();
		d.clgStart();
		d.clgEnd();
		
	
	}
}
