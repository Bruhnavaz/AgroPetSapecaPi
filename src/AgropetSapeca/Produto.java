package AgropetSapeca;

public class Produto {
	
	/*
	 * determinando os atributos da classe produto
	 */
	
	private String id_produto;
	private String nome;
	private String fabricante;
	private float custo;//calculado
	private String lotes;
	private String categoria;
	private String tipoPublico;// cachorro, gato, coelho
	private float quantidade_total;
	private float qtdMinima;
	private float estoqueSeguranca;
	public String getId_produto() {
		return id_produto;
	}
	public void setId_produto(String id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public float getCusto() {
		return custo;
	}
	public void setCusto(float custo) {
		this.custo = custo;
	}
	public String getLotes() {
		return lotes;
	}
	public void setLotes(String lotes) {
		this.lotes = lotes;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTipoPublico() {
		return tipoPublico;
	}
	public void setTipoPublico(String tipoPublico) {
		this.tipoPublico = tipoPublico;
	}
	public float getQuantidade_total() {
		return quantidade_total;
	}
	public void setQuantidade_total(float quantidade_total) {
		this.quantidade_total = quantidade_total;
	}
	public float getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(float qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public float getEstoqueSeguranca() {
		return estoqueSeguranca;
	}
	public void setEstoqueSeguranca(float estoqueSeguranca) {
		this.estoqueSeguranca = estoqueSeguranca;
	}
	
	

}
