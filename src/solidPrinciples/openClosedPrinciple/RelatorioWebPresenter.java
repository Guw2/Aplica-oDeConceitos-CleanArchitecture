package solidPrinciples.openClosedPrinciple;

public class RelatorioWebPresenter implements RelatorioPresenter{

	@Override
	public void apresentar(Relatorio relatorio) {
		System.out.println("Gerando relatório Web: " + relatorio.getConteudo());		
	}

}
