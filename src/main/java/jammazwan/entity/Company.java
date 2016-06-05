package jammazwan.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import jammazwan.entity.Company;

@Entity
@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=false)
public class Company implements Serializable {
	private static final long serialVersionUID = -4123506315143918600L;
	@Id
	@DataField(pos = 1)
	private int rank;
	@DataField(pos = 2)
	private String companyName;
	@DataField(pos = 3)
	private int contacts;

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
