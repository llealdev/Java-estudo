package entities;

public class AccountCompany extends Account{
	
	private int employee;
	
	public AccountCompany() {
		super();
	}
	
	public AccountCompany(String name, Double iYear, int employee) {
		super(name, iYear);
		this.employee = employee;
	}

	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	@Override
	public double tax() {
		Double sum = 0.0; 
		if(employee > 10) {
			sum = super.getiYear() * 0.14;
			return sum;
		}
		else {
			sum = super.getiYear() * 0.16;
		}
		return 0;
	}
	
	

}
