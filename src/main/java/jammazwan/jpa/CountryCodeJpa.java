package jammazwan.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import jammazwan.entity.CountryCode;

@Entity
public class CountryCodeJpa implements Serializable {
	private static final long serialVersionUID = -7172973708636640276L;
	@Id
	private String name;
	private String GEC;
	private String A3;
	private String A2;
	private String num;
	private String STANAG;
	private String internet;

	public CountryCodeJpa(CountryCode countryCode) {
		this.name = countryCode.getName();
		this.GEC = countryCode.getGEC();
		this.A3 = countryCode.getA3();
		this.A2 = countryCode.getA2();
		this.num = countryCode.getNum();
		this.STANAG = countryCode.getSTANAG();
		this.internet = countryCode.getInternet();

	}

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
