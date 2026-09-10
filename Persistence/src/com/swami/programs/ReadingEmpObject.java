package com.swami.programs;

import java.io.*;
import com.sharayu.classes.*;

public class ReadingEmpObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream i=new ObjectInputStream(new FileInputStream("emp"));
		Employee obj=(Employee) i.readObject();
		System.out.println(obj);
		i.close();
		
		
	}

}
