package jammazwan.load;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Header;

public class LoadFromFile {
	public <T> List<T>  load(@Header("name") String name, Class<T> type){
		List<T> returnList = new ArrayList<T>();
		//populate list
		return returnList;
	}

}
