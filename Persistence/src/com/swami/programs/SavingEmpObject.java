package com.swami.programs;

import com.sharayu.classes.Employee;
import java.io.*;

public class SavingEmpObject {
	public static void main(String[] args) throws IOException
	{
		Employee e=new Employee(341, "Jos Buttler", "Manchester", "Marketing", "Executive", 76200.00);
		System.out.println(e);
		
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("emp"));
		o.writeObject(e);
		o.close();
		System.out.println("Employee object saved in file");
	}

}
