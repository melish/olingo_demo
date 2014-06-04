package edw.olingo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 */

@Entity(name = "Manufacturer")
public class Manufacturer {

	@Id
	@Column(name = "ID")
	private int id;

	public Manufacturer() {
	}

	@OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL)
	private List<Car> cars = new ArrayList<Car>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

}