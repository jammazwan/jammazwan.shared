package jammazwan;

import java.io.Serializable;

public interface RankValue  extends Serializable{

	int getRank();

	void setRank(int rank);

	String getName();

	void setName(String name);

	String getValue();

	void setValue(String value);

}