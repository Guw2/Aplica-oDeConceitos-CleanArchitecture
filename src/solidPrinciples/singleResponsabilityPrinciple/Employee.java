package solidPrinciples.singleResponsabilityPrinciple;

public class Employee {
	private String name;
	private Double hourlyRate;
	private Integer hoursWorked;
	
	public Employee(String name, Double hourlyRate, Integer hoursWorked) {
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(Double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public Integer getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(Integer hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
}
