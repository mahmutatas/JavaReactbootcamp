package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import jdk.jfr.Name;

@Entity
@Table(name = "job_positions")
public class Positions 
{
	@Name(value = "name")
	@GeneratedValue
	@Column(name = "name")
	private String name;

	public Positions() {}
	
	public Positions(String name) {
		super();
		this.name = name;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
