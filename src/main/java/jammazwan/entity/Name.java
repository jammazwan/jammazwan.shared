package jammazwan.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@Entity
@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=false)
public class Name implements Serializable {
	private static final long serialVersionUID = 331002447784792829L;
	@Id
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
