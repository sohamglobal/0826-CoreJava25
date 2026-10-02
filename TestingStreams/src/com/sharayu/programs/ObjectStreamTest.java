package com.sharayu.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sharayu.classes.Person;

public class ObjectStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Buttler",34,"London");
		Person p2=new Person("Root",32,"London");
		Person p3=new Person("Cummins",31,"Sydney");
		Person p4=new Person("Salah",29,"Cairo");
		Person p5=new Person("Fernandez",28,"Manchester");
		
		List<Person> lst=new ArrayList<Person>();
		lst.add(p1);
		lst.add(p2);
		lst.add(p3);
		lst.add(p4);
		lst.add(p5);
		
		System.out.println("------------------");
		System.out.println(lst.stream().count());
		System.out.println("------------------");
		lst.stream()
		.forEach(obj->System.out.println(obj.getName()));
		
		System.out.println("------------------");
		lst.stream()
		.filter(obj->obj.getName().length()>5)
		.forEach(obj->System.out.println(obj));
		
		System.out.println("------------------");
		lst.stream()
		.filter(obj->obj.getCity().equals("London"))
		.forEach(obj->System.out.println(obj));
		
		System.out.println("------------------");
		lst.stream()
		.filter(obj->obj.getAge()<30)
		.forEach(obj->System.out.println(obj));
		
		System.out.println("------------------");
		lst.stream()
		.map(obj->obj.getName().toUpperCase())
		.sorted()
		.forEach(nm->System.out.println(nm));
	
		System.out.println("------------------");
		lst.stream()
		.sorted(Comparator.comparing(Person::getAge))
		.forEach(System.out::println);
		
		System.out.println("------------------");
		lst.stream()
		.sorted(Comparator.comparing(Person::getCity))
		.forEach(System.out::println);
		
		System.out.println("------------------");
		
		Optional<Person> p;
		
		p=lst.stream()
		.filter(obj->obj.getAge()>35)
		.findFirst();
		
		System.out.println(p);
		
		System.out.println("------------------");
		
		Map<String, List<Person>> result=lst.stream()
				.collect(
						Collectors.groupingBy(Person::getCity)
						);
		
		System.out.println(result);
				
		
	}

}
