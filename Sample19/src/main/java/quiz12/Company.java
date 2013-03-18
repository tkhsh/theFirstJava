package quiz12;

public class Company {
	private String name;
	private String address;

	public void setName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return this.name;
	}

	public void setAddress(String newAddress) {
		this.address = newAddress;
	}

	public String getAddress() {
		return this.address;
	}

	public Company(String name) {
		this.name = name;
	}
}
