package com.hungvk.functional;

public class FunctionAsData {
	protected static class Person{
		private String name;
		private Integer age;
		public Person() {
			// TODO Auto-generated constructor stub
		}
		public Person(String name, Integer age) {
			this.name = name;
			this.age = age;
		}
		
	}
	
	protected static class DataLoader{
		public final NoArgsFunction<Person> loadPerson;
		
		public DataLoader(Boolean isDeveloped) {
			this.loadPerson = isDeveloped ? this::loadPersonFake : this::loadPersonReal;
		}
		
		private Person loadPersonReal() {
			System.out.println("Loading person..");
			return new Person("Real ", 18);
		}
		private Person loadPersonFake() {
			System.out.println("Loading fake person");
			return new Person("Fake", 0);
		}
	}
	public static void main(String[] args) {
		final Boolean IS_DEVELOPED = false;
		DataLoader loader = new DataLoader(IS_DEVELOPED);
		System.out.println(loader.loadPerson.apply());
	}
}
