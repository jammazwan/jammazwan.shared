package jammazwan.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import jammazwan.entity.Name;

@Entity
public class NameJpa implements Serializable {
    private static final long serialVersionUID = 414637969243627L;
    @Id
	private int rank;
	private String male;
	private String female;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}

	public String getFemale() {
		return female;
	}

	public void setFemale(String female) {
		this.female = female;
	}

}
