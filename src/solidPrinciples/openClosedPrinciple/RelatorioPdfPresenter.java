package solidPrinciples.openClosedPrinciple;

public class RelatorioPdfPresenter implements RelatorioPresenter{

	@Override
	public void apresentar(Relatorio relatorio) {
		System.out.println("Gerando relatório em PDF: " + relatorio.getConteudo());
	}

}
