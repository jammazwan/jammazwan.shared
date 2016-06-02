package jammazwan.raw;

import jammazwan.CountryCategory;
import jammazwan.jive.Utils;

public class CountryCategoryPojo implements CountryCategory {
	private int num;
	private String category;
	private String name;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTableName() {
		String tableName = Utils.getMethodNameLikeFromDelimited(name, ' ');
		tableName = Utils.getMethodNameLikeFromDelimited(tableName, '-');
		tableName = Utils.getMethodNameLikeFromDelimited(tableName, ',');
		tableName = Utils.getMethodNameLikeFromDelimited(tableName, '/');
		tableName = Utils.lowFirst(category) + tableName;
		System.out.println(tableName);
		return tableName;
	}

}
