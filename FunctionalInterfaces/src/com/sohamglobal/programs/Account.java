package com.sohamglobal.programs;

import com.sohamglobal.interfaces.Addition;
import com.sohamglobal.interfaces.Banking;
import com.sohamglobal.interfaces.Finance;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banking obj=()->System.out.println("money transferred");
		obj.showNotification();
		
		Finance f=(loanamt)->{
			double interest;
			interest=loanamt*7/100;
			System.out.println("Interest will be "+interest);
		};
		
		f.calcInterest(250000);
		
		Addition obj2=(a,b)->{
			int c;
			c=a+b;
			System.out.println("sum is "+c);
		};
		
		obj2.add(9, 13);
	}

}
