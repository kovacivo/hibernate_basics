package entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Message {

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private Integer id;
	
	@Column(name = "TEXT", nullable = false, length = 255)
	private String text;
		

	public Message() {}
	public Message(Integer id, String text) {
		this.id = id;
		this.text = text;
	}


}
