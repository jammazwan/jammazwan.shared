package jammazwan.entity;

import java.util.List;

public class TextData {
	private List<String> lineData;

	public TextData() {
		super();
	}

	public TextData(List<String> lineData) {
		super();
		this.lineData = lineData;
	}

	public List<String> getLineData() {
		return lineData;
	}

	public void setLineData(List<String> lineData) {
		this.lineData = lineData;
	}

}
