package jammazwan.jpa;

import jammazwan.Company;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyJpa implements Company {
	private static final long serialVersionUID = 414637879692437L;
	@Id
	private int rank;
	private String companyName;
	private int contacts;

	public CompanyJpa(Company company) {
		this.rank = company.getRank();
		this.companyName = company.getCompanyName();
		this.contacts = company.getContacts();
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getContacts() {
		return contacts;
	}

	public void setContacts(int contacts) {
		this.contacts = contacts;
	}

}
