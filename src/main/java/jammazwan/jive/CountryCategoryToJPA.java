package jammazwan.jive;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import jammazwan.CountryCategory;
import jammazwan.jpa.CountryCategoryJpa;
/*
 * This class would not be necessary but for a desire to not mix JPA annotations with Bindy/Csv annotations in the same class.
 */
public class CountryCategoryToJPA implements Processor{

	public void process(Exchange exchange) throws Exception {
		CountryCategory countryCategory = exchange.getIn().getBody(CountryCategory.class);
		CountryCategoryJpa countryCategoryJPA = new CountryCategoryJpa(countryCategory);
		exchange.getIn().setBody(countryCategoryJPA);
	}

}
