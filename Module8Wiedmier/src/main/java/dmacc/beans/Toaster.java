/**
 * @author Mandy Wiedmier - mwiedmier2
 * CIS175 - Spring 2024
 * Mar 4, 2024
 */
package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * A class for a Toaster object
 */
@Entity
public class Toaster {
	//Instance Variables
	@Id 
	@GeneratedValue
	private int id;
	private String name;
	private String model;
	private int year;
	private int slots;
	
	//Constructors
	/**
	 * No arg Constructor
	 */
	public Toaster() {
		super();
		this.slots = 2;
	}
	/**
	 * @param name
	 */
	public Toaster(String name) {
		super();
		this.name = name;
	}
	/**
	 * @param name
	 * @param model
	 * @param year
	 * @param slots
	 */
	public Toaster(String name, String model, int year, int slots) {
		super();
		this.name = name;
		this.model = model;
		this.year = year;
		this.slots = slots;
	}
	/**
	 * @param id
	 * @param name
	 * @param model
	 * @param year
	 * @param slots
	 */
	public Toaster(int id, String name, String model, int year, int slots) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.year = year;
		this.slots = slots;
	}
	//Getters Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the slots
	 */
	public int getSlots() {
		return slots;
	}
	/**
	 * @param slots the slots to set
	 */
	public void setSlots(int slots) {
		this.slots = slots;
	}
	
	//Helper Methods
	@Override
	public String toString() {
		return "Toaster [id=" + id + ", name=" + name + ", model=" + model + ", year=" + year + ", slots=" + slots
				+ "]";
	}
}
