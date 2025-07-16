package solidPrinciples.singleResponsabilityPrinciple;

public class EmployeeRepository {

	public String save(Employee employee) {
		return "Salvando " + employee.getName() + " no banco de dados.";
	}
	
}
