package jammazwan.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@Entity
@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine = false)
public class CountryCategory implements Serializable{
	private static final long serialVersionUID = 41463787969243L;
	@DataField(pos = 1)
	@Id
	private int num;
	@DataField(pos = 2)
	private String category;
	@DataField(pos = 3)
	private String name;

	public CountryCategory() {
		super();
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
