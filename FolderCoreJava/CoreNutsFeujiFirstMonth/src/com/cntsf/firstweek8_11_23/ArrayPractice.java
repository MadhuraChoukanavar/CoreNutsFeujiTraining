package com.cntsf.firstweek8_11_23;

public class ArrayPractice {

	public static void main(String[] args) {
		Person[] persons = new Person[2];
		ArrayPractice practice = new ArrayPractice();
		Person[] details = practice.assigningDetails(persons);
		practice.displayPerson(details);

	}

	public Person[] assigningDetails(Person[] persons) {

		Person person1 = new Person();
		person1.personId = 101;
		person1.personAge = 22;
		person1.personName = "rakshita";
		person1.personNumber = "465132";
		Person person2 = new Person();
		person2.setPersonId(102);
		person2.setPersonName("maitra");
		person2.setPersonAge(22);
		person2.setPersonNumber("84123648");
		persons[0] = person1;
		persons[1] = person2;
		return persons;

	}

	public void displayPerson(Person[] Persondetails) {
		Person[] person = Persondetails;

		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i].personId);
			System.out.println(person[i].personAge);
			System.out.println(person[i].personName);
			System.out.println(person[i].personNumber);
		}

	}

}
