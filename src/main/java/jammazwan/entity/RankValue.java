package jammazwan.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@Entity
@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=false)
public class RankValue implements Serializable {
	private static final long serialVersionUID = -9070624211561276490L;
	@Id
	@DataField(pos = 1)
	private int rank;
	@DataField(pos = 2)
	private String name;
	@DataField(pos = 3)
	private String value;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
