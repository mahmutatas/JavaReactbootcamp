package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobseeker")
public class Jobseeker extends User
{
	@Id
	@GeneratedValue
	@Column(name = "id")
	private String id;

	@Column(name = "tcno")
	private String tcNo;

	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "birthyear")
	private int birthyear;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;

	public Jobseeker() {}
	
	public Jobseeker(String id, String tcNo, String name, String surname, int birthyear, String password,
			String email) {
		super();
		this.id = id;
		this.tcNo = tcNo;
		this.name = name;
		this.surname = surname;
		this.birthyear = birthyear;
		this.password = password;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
