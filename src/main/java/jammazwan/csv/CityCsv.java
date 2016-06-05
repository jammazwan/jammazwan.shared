package jammazwan.csv;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import jammazwan.entity.City;

@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=false)
public class CityCsv implements Serializable {
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
    @DataField(pos = 7)
	
	public CityCsv(){
		super();
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
