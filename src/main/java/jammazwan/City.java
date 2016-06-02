package jammazwan;

import java.io.Serializable;

public interface City extends Serializable{

	int getRank();

	void setRank(int rank);

	String getCity();

	void setCity(String city);

	String getCountry();

	void setCountry(String country);

	int getPopulation();

	void setPopulation(int population);

	int getSqkm();

	void setSqkm(int sqkm);

	int getDensitySqKm();

	void setDensitySqKm(int densitySqKm);

}