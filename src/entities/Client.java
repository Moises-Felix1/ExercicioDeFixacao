package entities;

import java.time.LocalDate;

public class Client {

	private String name;
	private String email;
	private LocalDate birth;
	
	public Client() {
		
	}

	public Client(String name, String email, LocalDate birth) {
		this.name = name;
		this.email = email;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	
	
	
}
