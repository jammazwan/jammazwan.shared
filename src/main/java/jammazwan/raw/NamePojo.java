package jammazwan.raw;

import jammazwan.Name;

public class NamePojo implements Name {
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
