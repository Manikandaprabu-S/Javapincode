package org.code;

public class Pin {

	public static void main(String[] args) {
		
		String a="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		
		boolean b = a.contains("pincode");
		if (b==true) {
			System.out.println("Pincode is Present");
		}
		else {
			System.out.println("Not");
		}
		String c = a.replace(",pincode-626101", " ");
		System.out.println(c);
		
		
		
	}
}
