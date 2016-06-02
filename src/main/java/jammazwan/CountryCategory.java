package jammazwan;

import java.io.Serializable;

public interface CountryCategory extends Serializable {

	public int getNum();

	public void setNum(int num);

	public String getCategory();

	public void setCategory(String category);

	public String getName();

	public void setName(String name);

	public String getTableName();

}