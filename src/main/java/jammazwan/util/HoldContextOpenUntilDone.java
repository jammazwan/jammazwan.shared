package jammazwan.util;

import org.apache.camel.model.ModelCamelContext;

/**
 * 
 * @author petecarapetyan This is an experimental class. May or may not be a
 *         good idea.
 */
public class HoldContextOpenUntilDone {
	public static void go(ModelCamelContext context) {
		try {
			for (int i = 0; i < 30; i++) {
				System.err.print(" " + i);
				Thread.sleep(1000);
				if (context.getInflightRepository().size() == 0) {
					System.err.println("\nHoldContextOpenUntilDone is complete\n");
					Thread.sleep(1000);
					if (context.getInflightRepository().size() == 0) {
						break;
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
