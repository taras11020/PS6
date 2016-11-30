package domain;

import java.util.Date;
import java.util.UUID;

public class PersonDomainModel {

	protected UUID PersonID;
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String street;
	protected Integer postalCode;
	protected String city;
	protected Date birthday;

	public PersonDomainModel() {
		this.PersonID = UUID.randomUUID();
		this.postalCode = 0;
	}
	public UUID getPersonID() {
		return this.PersonID;
	}
	public void setPersonID(UUID personID) {
		PersonID = personID;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


}