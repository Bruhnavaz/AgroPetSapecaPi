package AgropetSapeca;

import java.sql.Date;

public class Compras {
	
	/*
	 * determinando os atributos da classe Compras
	 */

	private int numeroPedido;
	private int requisicao;
	private float precos;
	private String idFornecedor;
	private Date dataCompra;
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public int getRequisicao() {
		return requisicao;
	}
	public void setRequisicao(int requisicao) {
		this.requisicao = requisicao;
	}
	public float getPrecos() {
		return precos;
	}
	public void setPrecos(float precos) {
		this.precos = precos;
	}
	public String getIdFornecedor() {
		return idFornecedor;
	}
	public void setIdFornecedor(String idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	
	
}
