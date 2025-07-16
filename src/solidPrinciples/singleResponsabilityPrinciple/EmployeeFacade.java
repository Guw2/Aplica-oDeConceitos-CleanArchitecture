package solidPrinciples.singleResponsabilityPrinciple;

public class EmployeeFacade {

	private final PayCalculator payCalculator = new PayCalculator();
	private final HourReporter hourReporter = new HourReporter();	 
	private final EmployeeRepository employeeRepository = new EmployeeRepository();

	public Double calcularPagamento(Employee employee) {
		return payCalculator.calculatePay(employee);
	}
	
	public String gerarRelatorio(Employee employee) {
		return hourReporter.reportHours(employee);
	}
	
	public String salvar(Employee employee) {
		return employeeRepository.save(employee);
	}
	
}
