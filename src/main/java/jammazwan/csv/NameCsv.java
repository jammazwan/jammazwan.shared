package jammazwan.csv;

import jammazwan.Name;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=false)
public class NameCsv implements Name {
    @DataField(pos = 1)
	private int rank;
    @DataField(pos = 2)
	private String male;
    @DataField(pos = 3)
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
