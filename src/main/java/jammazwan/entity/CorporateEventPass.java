package jammazwan.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for corporateEventPass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="corporateEventPass"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "corporateEventPass", propOrder = {
    "color",
    "fee",
    "name",
    "seats"
})
public class CorporateEventPass {
	private String color;
	private String name;
	private int fee;
	private int seats;

	public CorporateEventPass() {
		super();
	}

	public CorporateEventPass(Company company) {
		super();
		calculateFees(company);
	}

	private void calculateFees(Company company) {
		// algorithms don't work well with zeros
		if (company.getRank() <= 0) {
			company.setRank(5000);
		}
		if (company.getContacts() <= 0) {
			company.setContacts(2);
		}
		if (company.getRank() < 10) {
			fee = 10000;
			color = "Green";
		} else if (company.getRank() < 50) {
			fee = 5000 - company.getRank();
			color = "Purple";
		} else {
			fee = 1000 - company.getRank();
			color = "Orange";
		}
		if (company.getContacts() > 500) {
			seats = 500;
		} else if (company.getContacts() > 50) {
			seats = company.getContacts();
		} else {
			seats = company.getContacts() / 2;
		}
		name = company.getCompanyName();

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
