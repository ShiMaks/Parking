package by.htp.parking.domain;

public class Car extends Entity {

	private static final long serialVersionUID = 5884958707690014620L;
	
	private String brandName;
	private String model;
	private double fuelConsumption;
	private int volueOfTank;

	public Car() {
	}

	public Car(int id, String brandName, String model, double fuelConsumption, int volueOfTank) {
		super(id);
		this.brandName = brandName;
		this.model = model;
		this.fuelConsumption = fuelConsumption;
		this.volueOfTank = volueOfTank;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getVolueOfTank() {
		return volueOfTank;
	}

	public void setVolueOfTank(int volueOfTank) {
		this.volueOfTank = volueOfTank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fuelConsumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + volueOfTank;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (Double.doubleToLongBits(fuelConsumption) != Double.doubleToLongBits(other.fuelConsumption))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (volueOfTank != other.volueOfTank)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [brandName=" + brandName + ", model=" + model + ", fuelConsumption=" + fuelConsumption
				+ ", volueOfTank=" + volueOfTank + ", getId()=" + getId() + "]";
	}
}
