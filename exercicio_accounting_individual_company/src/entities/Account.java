package entities;

public abstract class Account {
	
	private String name;
	private Double iYear;
	
	public Account() {
	}

	public Account(String name, Double iYear) {
		this.name = name;
		this.iYear = iYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getiYear() {
		return iYear;
	}

	public void setiYear(Double iYear) {
		this.iYear = iYear;
	}
	
	public abstract double tax();
	
	

}
