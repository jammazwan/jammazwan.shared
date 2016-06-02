package jammazwan.raw;

import jammazwan.CountryCode;

public class CountryCodePojo implements CountryCode {
	private String name;
	private String GEC;
	private String A3;
	private String A2;
	private String num;
	private String STANAG;
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
