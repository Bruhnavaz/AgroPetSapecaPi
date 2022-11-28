package AgropetSapeca;

import java.sql.Date;

public class Compras {
	
	/*
	 * determinando os atributos da classe Compras
	 */

	private String numero_do_pedido;
	private String nota_fiscal;
	private String forma_pagamento;
	private float frete;
	private float preco;
	private String cnpj_fornecdor;
	private Date dataCompra;
	
	public String getNumero_do_pedido() {
		return numero_do_pedido;
	}
	public void setNumero_do_pedido(String numero_do_pedido) {
		this.numero_do_pedido = numero_do_pedido;
	}
	public String getNota_fiscal() {
		return nota_fiscal;
	}
	public void setNota_fiscal(String nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}
	public String getForma_pagamento() {
		return forma_pagamento;
	}
	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	public float getFrete() {
		return frete;
	}
	public void setFrete(float frete) {
		this.frete = frete;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCnpj_fornecdor() {
		return cnpj_fornecdor;
	}
	public void setCnpj_fornecdor(String cnpj_fornecdor) {
		this.cnpj_fornecdor = cnpj_fornecdor;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	
}
	
	