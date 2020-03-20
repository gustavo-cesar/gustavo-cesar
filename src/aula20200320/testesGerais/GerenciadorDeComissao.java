package aula20200320.testesGerais;

public class GerenciadorDeComissao {

	public static double calcularComissaoPadrao(double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda * (percentualDeComissao / 100.00);
	}

	public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda,
			double percentualDeComissao) {
		double ValorMinimoAtingido = valorDaVenda * percentualDeComissao / 100;

		if (ValorMinimoAtingido >= valorMinimo) {
			return ValorMinimoAtingido;
		}

		return valorMinimo;
	}

	public static double calcularComissaoComFaixa(double valorMinimo, double valorMaximo, double valorDaVenda,
			double percentualDeComissao) {
		
		double valorDaComissaoTotal = valorDaVenda * percentualDeComissao / 100;

		if (valorDaComissaoTotal >= valorMinimo && valorDaComissaoTotal <= valorMaximo) {
			return valorDaComissaoTotal;
		}

		if (valorDaComissaoTotal <= valorMinimo) {
			return valorMinimo;
		}
		return valorMaximo;

	}

}
