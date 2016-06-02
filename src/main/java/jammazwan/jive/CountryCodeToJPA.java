package jammazwan.jive;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import jammazwan.CountryCode;
import jammazwan.jpa.CountryCodeJpa;
/*
 * This class would not be necessary but for a desire to not mix JPA annotations with Bindy/Csv annotations in the same class.
 */
public class CountryCodeToJPA implements Processor{

	public void process(Exchange exchange) throws Exception {
		CountryCode countryCode = exchange.getIn().getBody(CountryCode.class);
		CountryCodeJpa countryCodeJPA = new CountryCodeJpa(countryCode);
		exchange.getIn().setBody(countryCodeJPA);
	}

}
