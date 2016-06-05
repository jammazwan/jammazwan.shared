package jammazwan.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import jammazwan.entity.Surname;

@Entity
@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=false)
public class Surname implements Serializable {
	private static final long serialVersionUID = -5256476810692377016L;
	@Id
	@DataField(pos = 1)
	String name;

	public Surname() {
		super();
	}

	public Surname(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
