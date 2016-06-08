package jammazwan.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Manager implements Serializable {
	@XmlAttribute
	private String city;
	@XmlAttribute
	private String company;
	@XmlAttribute
	private String firstName;
	@XmlAttribute
	private String surname;

	public Manager() {
		super();
	}

	public Manager(String city, String company, String firstName, String surname) {
		super();
		this.city = city;
		this.company = company;
		this.firstName = firstName;
		this.surname = surname;
	}

	public String toString() {
		return "City: " + city + " Company: " + company + " Name " + firstName + " " + surname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
