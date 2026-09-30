package com.praffull.programs;

import java.util.function.Consumer;

public class OneMoreConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> obj=nm->System.out.println("Length : "+nm.length());
		
		obj.accept("praffull");
	}

}
