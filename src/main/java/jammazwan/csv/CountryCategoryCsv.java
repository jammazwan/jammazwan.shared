package jammazwan.csv;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine = false)
public class CountryCategoryCsv {
	private static final long serialVersionUID = -8230155630979941896L;
	@DataField(pos = 1)
	private int num;
	@DataField(pos = 2)
	private String category;
	@DataField(pos = 3)
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

//	public String getTableName() {
//		String tableName = Utils.getMethodNameLikeFromDelimited(name, ' ');
//		tableName = Utils.getMethodNameLikeFromDelimited(tableName, '-');
//		tableName = Utils.getMethodNameLikeFromDelimited(tableName, ',');
//		tableName = Utils.getMethodNameLikeFromDelimited(tableName, '/');
//		tableName = Utils.lowFirst(category) + tableName;
//		System.out.println(tableName);
//		return tableName;
//	}

}
