package jammazwan.jive;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import jammazwan.City;
import jammazwan.jpa.CityJpa;
/*
 * This class would not be necessary but for a desire to not mix JPA annotations with Bindy/Csv annotations in the same class.
 */
public class CityToJPA implements Processor{

	public void process(Exchange exchange) throws Exception {
		City city = exchange.getIn().getBody(City.class);
		CityJpa cityJPA = new CityJpa(city);
		exchange.getIn().setBody(cityJPA);
	}

}
