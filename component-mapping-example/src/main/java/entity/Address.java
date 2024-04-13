package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name="address_street")
	private String street;

	@Column(name="address_city")
	private String city;

	@Column(name="address_zipcode")
	private String zipcode;
	
	public Address() {}
	public Address(String street, String city, String zipcode) {
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}	
	
}







