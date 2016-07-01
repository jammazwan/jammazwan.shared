package jammazwan.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@Entity
@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine = false)
public class City implements Serializable {
	private static final long serialVersionUID = -8973905570404682071L;
	@Id
	@DataField(pos = 1)
	private int rank;
	@DataField(pos = 2)
	private String city;
	@DataField(pos = 3)
	private String country;
	@DataField(pos = 4)
	private int population;
	@DataField(pos = 5)
	private int sqkm;
	@DataField(pos = 6)
	private int densitySqKm;

	public City() {
		super();
	}

	public City(int rank, String city, String country, int population, int sqkm, int densitySqKm) {
		super();
		this.rank = rank;
		this.city = city;
		this.country = country;
		this.population = population;
		this.sqkm = sqkm;
		this.densitySqKm = densitySqKm;
	}

	public String toString() {
		return "rank=" + rank + ", city=" + city + ", country=" + country + ", population=" + population + ", sqkm="
				+ sqkm + ", density=" + densitySqKm;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getSqkm() {
		return sqkm;
	}

	public void setSqkm(int sqkm) {
		this.sqkm = sqkm;
	}

	public int getDensitySqKm() {
		return densitySqKm;
	}

	public void setDensitySqKm(int densitySqKm) {
		this.densitySqKm = densitySqKm;
	}

}
