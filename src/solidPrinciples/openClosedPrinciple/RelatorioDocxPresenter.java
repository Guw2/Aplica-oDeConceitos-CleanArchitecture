package solidPrinciples.openClosedPrinciple;

public class RelatorioDocxPresenter implements RelatorioPresenter {

	@Override
	public void apresentar(Relatorio relatorio) {
		System.out.println("Gerando relatório Docx: " + relatorio.getConteudo());
	}

}
