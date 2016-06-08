package jammazwan.entity;

import java.io.Serializable;
import java.util.List;

public class Shop implements Serializable {
	private List<Employee> employees;
	private Manager manager;
	private String address;
	private String name;

	public Shop() {
		super();
	}

	public Shop(List<Employee> employees, Manager manager, String address, String name) {
		super();
		this.employees = employees;
		this.manager = manager;
		this.address = address;
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
