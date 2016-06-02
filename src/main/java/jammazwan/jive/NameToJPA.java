package jammazwan.jive;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import jammazwan.Name;
import jammazwan.jpa.NameJpa;
/*
 * This class would not be necessary but for a desire to not mix JPA annotations with Bindy/Csv annotations in the same class.
 */
public class NameToJPA implements Processor{

	public void process(Exchange exchange) throws Exception {
		Name name = exchange.getIn().getBody(Name.class);
		NameJpa nameJPA = new NameJpa(name);
		exchange.getIn().setBody(nameJPA);
	}

}
