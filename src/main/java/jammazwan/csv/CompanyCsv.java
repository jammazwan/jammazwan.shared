package jammazwan.csv;

import jammazwan.Company;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;


@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=false)
public class CompanyCsv implements Company {
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
