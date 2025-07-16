package solidPrinciples.singleResponsabilityPrinciple;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Peter", 25.5, 5);
		EmployeeFacade facade = new EmployeeFacade();
		
		System.out.println(facade.calcularPagamento(employee));
		System.out.println(facade.gerarRelatorio(employee));
		System.out.println(facade.salvar(employee));
		
	}
	
}
