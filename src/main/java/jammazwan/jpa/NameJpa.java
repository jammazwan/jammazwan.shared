package jammazwan.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

import jammazwan.Name;

@Entity
public class NameJpa implements Name {
    private static final long serialVersionUID = 414637969243627L;
    @Id
	private int rank;
	private String male;
	private String female;

	public NameJpa(Name name) {
		this.rank = name.getRank();
		this.male = name.getMale();
		this.female = name.getFemale();
	}

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
