package com.praffull.programs;

import com.praffull.interfaces.Shopping;

public class BillingInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping obj=(amount)->{
			double discount,netbill;
			discount=amount*10/100;
			netbill=amount-discount;
			System.out.println("Discount : "+discount);
			System.out.println("NetBill : "+netbill);
		};
		
		obj.calcNetBill(7340);
	}

}
