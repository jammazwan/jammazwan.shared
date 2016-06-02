package jammazwan.jive;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import jammazwan.Company;
import jammazwan.jpa.CompanyJpa;
/*
 * This class would not be necessary but for a desire to not mix JPA annotations with Bindy/Csv annotations in the same class.
 */
public class CompanyToJPA implements Processor{

	public void process(Exchange exchange) throws Exception {
		Company company = exchange.getIn().getBody(Company.class);
		CompanyJpa companyJPA = new CompanyJpa(company);
		exchange.getIn().setBody(companyJPA);
	}

}
