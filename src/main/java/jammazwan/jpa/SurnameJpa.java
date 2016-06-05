package jammazwan.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import jammazwan.entity.Surname;

@Entity
public class SurnameJpa implements Serializable {
	private static final long serialVersionUID = 1L;
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
