package solidPrinciples.openClosedPrinciple;

public class RelatorioController {

	private final RelatorioPresenter presenter;

	public RelatorioController(RelatorioPresenter presenter) {
		this.presenter = presenter;
	}
	
	public void gerarRelatório(Relatorio relatorio) {
		presenter.apresentar(relatorio);
	}
	
}
