package io.Abhishek;
	
import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Pokemon {
	@Id
	@Column
	private String name;
	@Column(nullable = false)
	private String type;
	@Column
	private int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) throws Exception {
		if(type != null) {
		this.type = type;
		}
		else {
			throw new Exception("Please enter the type.");
		}
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return this.getName() +"  " + this.getType() + "  "+ this.getPower();
	}
	
}
