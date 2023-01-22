package com.test;

public class String_buildertest {
	
	public static void main(String[] args) {
		String_buildertest s = new String_buildertest();
		s.pal();
	}
		
		public void pal() {
			String sb = "";
			String ans=sb;
			String temp="";
		
		if (sb == null || sb.length()<0) {
			System.out.println("yes");
		}
		for(int i=sb.length()-1;i>=0;i--) {
			temp=temp+sb.charAt(i);
		}
	//	System.out.println(temp);
		
		if(temp.equals(ans)) {
			System.out.println("pal");
		}else
			System.out.println("not pal");
		

}
}