package jammazwan.jpa;

import jammazwan.Surname;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SurnameJpa implements Surname {
	@Id
	String name;

	public SurnameJpa() {
		super();
	}

	public SurnameJpa(String name) {
		super();
		this.name = name;
	}

	public SurnameJpa(Surname surname) {
		this.name = surname.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
