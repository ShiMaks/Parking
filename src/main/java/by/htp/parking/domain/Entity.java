package by.htp.parking.domain;

import java.io.Serializable;

public abstract class Entity implements Serializable {
	
	private static final long serialVersionUID = -2499397839961130968L;
	private int id;

	public Entity(int id) {
		super();
		this.id = id;
	}
	
	public Entity() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
