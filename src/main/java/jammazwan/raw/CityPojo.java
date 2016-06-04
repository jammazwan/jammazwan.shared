package jammazwan.raw;

import jammazwan.City;

public class CityPojo implements City {
	private int rank;
	private String city;
	private String country;
	private int population;
	private int sqkm;
	private int densitySqKm;

	public CityPojo() {
		super();
	}

	public CityPojo(City city) {
		super();
		this.city = city.getCity();
		this.rank = city.getRank();
		this.country = city.getCountry();
		this.population = city.getPopulation();
		this.sqkm = city.getSqkm();
		this.densitySqKm = city.getDensitySqKm();
	}

	public CityPojo(int rank, String city, String country, int population, int sqkm, int densitySqKm) {
		super();
		this.rank = rank;
		this.city = city;
		this.country = country;
		this.population = population;
		this.sqkm = sqkm;
		this.densitySqKm = densitySqKm;
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
