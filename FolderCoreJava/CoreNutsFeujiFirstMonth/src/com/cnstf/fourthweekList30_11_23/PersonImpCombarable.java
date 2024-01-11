package com.cnstf.fourthweekList30_11_23;



public class PersonImpCombarable implements Comparable<PersonImpCombarable>{
	int personId;
	String personName;
	
	public PersonImpCombarable() {
		super();	 
	}
	@Override
	public String toString() {
		return "PersonImpCombarable [personId=" + personId + ", personName=" + personName + "]";
	}
	public PersonImpCombarable(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public int compareTo(PersonImpCombarable person) {
		if(this.personId>person.personId)
		{
			return 1;
		}
		else if(this.personId<person.personId)
		{
			return 1;
		}
		else 
		{
		return this.personName.compareTo(person.getPersonName());
		}
		
	}

}
