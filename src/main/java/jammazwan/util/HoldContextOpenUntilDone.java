package jammazwan.util;

import org.apache.camel.model.ModelCamelContext;

public class HoldContextOpenUntilDone {
	public static void go(ModelCamelContext context) {
		try {
			System.err.println("Starting\n");
			for (int i = 0; i < 30; i++) {
				System.err.print(" " + i);
				Thread.sleep(1000);
				if (context.getInflightRepository().size() == 0) {
					System.err.print(" Looks like we're done");
					Thread.sleep(2000);
					break;
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
