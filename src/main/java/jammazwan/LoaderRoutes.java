package jammazwan;

import org.apache.camel.builder.RouteBuilder;

public class LoaderRoutes extends RouteBuilder {

	public void configure() throws Exception {
		// from("file://src/main/resources/data/?noop=true&fileName=city.csv").unmarshal("cityDataFormat").split(body())
		// .process("cityToJpa").to("jpa:jammazwan.jpa.CityJpa");
		// from("file://src/main/resources/data/?noop=true&fileName=company.csv").unmarshal("companyDataFormat")
		// .split(body()).process("companyToJpa").to("jpa:jammazwan.jpa.CompanyJpa");
		// from("file://src/main/resources/data/?noop=true&fileName=surname.txt").unmarshal("surnameDataFormat")
		// .split(body()).process("surnameToJpa").to("jpa:jammazwan.jpa.SurnameJpa");
		// from("file://src/main/resources/data/?noop=true&fileName=name.csv").unmarshal("nameDataFormat")
		// .split(body()).process("nameToJpa").to("jpa:jammazwan.jpa.NameJpa");
//		from("file://src/main/resources/data/factbook_csv/?noop=true&fileName=category.csv")
//		.unmarshal("countryCategoryDataFormat")
//		.split(body()).process("countryCategoryToJpa");
//		.to("jpa:jammazwan.jpa.CountryCategoryJpa");
//		from("file://src/main/resources/data/factbook_csv/?noop=true&fileName=code.csv")
//		.unmarshal("countryCodeDataFormat").split(body()).process("countryCodeToJpa")
//		.to("jpa:jammazwan.jpa.CountryCodeJpa");
		
	}

}