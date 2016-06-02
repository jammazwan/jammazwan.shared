package jammazwan;

import java.io.Serializable;

public interface Company extends Serializable{

	int getRank();

	void setRank(int rank);

	String getCompanyName();

	void setCompanyName(String companyName);

	int getContacts();

	void setContacts(int contacts);

}