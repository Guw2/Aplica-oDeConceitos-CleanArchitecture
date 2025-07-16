package solidPrinciples.openClosedPrinciple;

public class Main {
	public static void main(String[] args) {
		
		Relatorio relatorio = new Relatorio("Exemplo");
		
		RelatorioWebPresenter web = new RelatorioWebPresenter();
		RelatorioPdfPresenter pdf = new RelatorioPdfPresenter();
		RelatorioDocxPresenter docx = new RelatorioDocxPresenter(); 
		
		RelatorioController controller1 = new RelatorioController(web);
		RelatorioController controller2 = new RelatorioController(pdf);
		RelatorioController controller3 = new RelatorioController(docx);
		
		controller1.gerarRelatório(relatorio);
		controller2.gerarRelatório(relatorio);
		controller3.gerarRelatório(relatorio);
	}
}
