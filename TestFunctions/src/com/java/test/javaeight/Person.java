package com.java.test.javaeight;

public class Person {

	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString()
	{
		return "Person ["+this.name+", "+this.age+"]";
	}
	
	private String name;
	
	private int age;


}
