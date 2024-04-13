package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {

	//for Hibernate 4.3.x Users
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	// for Hibernate 5.x Users
	// if you're using Hibernate 5.x, use GenerationType.IDENTITY id generator strategy explicitly
	// for more information on "GenerationType" have a look at https://www.udemy.com/hibernate-and-jpa-fundamentals/learn/v4/questions/937412
	/*
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	*/
	
	@Column(nullable=false)
	private String name;
	
	@Embedded
	private Address address;	
	/*
	@Embedded
	@AttributeOverrides( {
		@AttributeOverride(name="street", column=@Column(name="home_street")),
		@AttributeOverride(name="city", column=@Column(name="home_city")),
		@AttributeOverride(name="zipcode", column=@Column(name="home_zipcode"))
	} )
	private Address homeAddress;

	@Embedded
	@AttributeOverrides( {
		@AttributeOverride(name="street", column=@Column(name="billing_street")),
		@AttributeOverride(name="city", column=@Column(name="billing_city")),
		@AttributeOverride(name="zipcode", column=@Column(name="billing_zipcode"))
	} )
	private Address billingAddress;
	*/
	public Person() {}		
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}	
	/*
	public Person(String name, Address homeAddress, Address billingAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
		this.billingAddress = billingAddress;
	}
	*/
}