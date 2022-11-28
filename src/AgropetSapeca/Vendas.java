package AgropetSapeca;

import java.sql.Date;

public class Vendas {
	
	private String cupomFiscal;
	private Date dataVenda;
	private float preco;
	private float impostos;
	private float margem;
	
	
	public String getCupomFiscal() {
		return cupomFiscal;
	}
	public void setCupomFiscal(String cupomFiscal) {
		this.cupomFiscal = cupomFiscal;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getImpostos() {
		return impostos;
	}
	public void setImpostos(float impostos) {
		this.impostos = impostos;
	}
	public float getMargem() {
		return margem;
	}
	public void setMargem(float margem) {
		this.margem = margem;
	}
	
	

}
