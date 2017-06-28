package databaseHomework;

public class Person {
	//Properties
	private String name;
	private String email;
	private int age;
	
	//Constructor
		public Person(String name) {
		this.name = name;
	}
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	//Encapsulation
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
}


