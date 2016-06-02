package jammazwan.csv;

import jammazwan.CountryCode;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine = false)
public class CountryCodeCsv implements CountryCode {
	private static final long serialVersionUID = 8314505776981172547L;
	@DataField(pos = 1)
	private String name;
	@DataField(pos = 2)
	private String GEC;
	@DataField(pos = 3)
	private String A3;
	@DataField(pos = 4)
	private String A2;
	@DataField(pos = 5)
	private String num;
	@DataField(pos = 6)
	private String STANAG;
	@DataField(pos = 7)
	private String internet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGEC() {
		return GEC;
	}

	public void setGEC(String gEC) {
		GEC = gEC;
	}

	public String getA3() {
		return A3;
	}

	public void setA3(String a3) {
		A3 = a3;
	}

	public String getA2() {
		return A2;
	}

	public void setA2(String a2) {
		A2 = a2;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getSTANAG() {
		return STANAG;
	}

	public void setSTANAG(String sTANAG) {
		STANAG = sTANAG;
	}

	public String getInternet() {
		return internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
	}

}
