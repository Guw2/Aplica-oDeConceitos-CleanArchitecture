package solidPrinciples.singleResponsabilityPrinciple;

public class PayCalculator {

	public Double calculatePay(Employee employee) {
		return employee.getHourlyRate() * employee.getHoursWorked();
	}
	
}
