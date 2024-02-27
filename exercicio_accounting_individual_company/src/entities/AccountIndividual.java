package entities;

public class AccountIndividual extends Account {

	private Double healthExpenditures;
	
	public AccountIndividual() {
		super();
	}
	
	public AccountIndividual(String name, Double iYear, Double healthExpenditures) {
		super(name, iYear);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		Double sum = 0.0;
		if(super.getiYear() < 20000.00) {
			sum = (super.getiYear() * 0.15) - (healthExpenditures * 0.5);
			return sum;
		}
		else {
			sum = (super.getiYear() * 0.25) - (healthExpenditures * 0.5);
			return sum;
		}
	}

}
