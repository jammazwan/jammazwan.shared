package jammazwan.jive;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import jammazwan.City;
import jammazwan.Surname;
import jammazwan.jpa.CityJpa;
import jammazwan.jpa.SurnameJpa;

/**
 * This class would not be necessary but for a desire to not mix JPA annotations
 * with Bindy/Csv annotations in the same class. Mixing them is fine except when
 * one is trying to provide clean examples of JPA or clean examples of Bindy
 */
public class SurnameToJPA implements Processor {

	public void process(Exchange exchange) throws Exception {
		Surname surname = exchange.getIn().getBody(Surname.class);
		SurnameJpa surnameJPA = new SurnameJpa(surname);
		exchange.getIn().setBody(surnameJPA);
	}

}
