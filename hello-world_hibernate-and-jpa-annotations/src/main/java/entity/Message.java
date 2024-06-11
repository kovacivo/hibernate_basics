package entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Message {

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private Integer id;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "TEXT", nullable = false, length = 255)
	private String text;
		

	public Message() {}
	public Message(Integer id, String text) {
		this.id = id;
		this.text = text;
	}


}
