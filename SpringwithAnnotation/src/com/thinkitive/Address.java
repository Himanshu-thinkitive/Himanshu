package com.thinkitive;

public class Address {
	private int pin;
	private String city;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + pin;
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (pin != other.pin)
			return false;
		return true;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

}
