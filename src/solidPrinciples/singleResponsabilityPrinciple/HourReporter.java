package solidPrinciples.singleResponsabilityPrinciple;

public class HourReporter {

	public String reportHours(Employee employee) {
		return "Horas Trabalhadas: " + employee.getHoursWorked();
	}
	
}
