package jammazwan;

import java.io.Serializable;

public interface Name  extends Serializable{

	int getRank();

	void setRank(int rank);

	String getMale();

	void setMale(String male);

	String getFemale();

	void setFemale(String female);

}