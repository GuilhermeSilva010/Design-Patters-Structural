package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class SemDesconto extends Descontos{

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
	 return BigDecimal.ZERO;	
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

}