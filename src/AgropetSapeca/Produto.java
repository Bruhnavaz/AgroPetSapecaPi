package AgropetSapeca;

public class Produto {
	
<<<<<<< HEAD
	private String idProduto;
	private String nome;
	private String fabricante;
	private float custo;
	private String lotes;
	private String categoria;
	private String tipoDePublico;//cachorro, gato, coelho
	private float quantidadeTotal;//valores totais acumulado
	private float quantidadeMin;//quantidade minima para rodar a operação
	private float estoqueSeguranca;// gatilho para o pedido de compra
	
	public Produto() {
		
	}
	
	public String getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
=======
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
>>>>>>> f33ab214892e05464db6a59347bf96479c82e699
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
<<<<<<< HEAD
	public String getTipoDePublico() {
		return tipoDePublico;
	}
	public void setTipoDePublico(String tipoDePublico) {
		this.tipoDePublico = tipoDePublico;
	}
	public float getQuantidadeTotal() {
		return quantidadeTotal;
	}
	public void setQuantidadeTotal(float quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}
	public float getQuantidadeMin() {
		return quantidadeMin;
	}
	public void setQuantidadeMin(float quantidadeMin) {
		this.quantidadeMin = quantidadeMin;
=======
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
>>>>>>> f33ab214892e05464db6a59347bf96479c82e699
	}
	public float getEstoqueSeguranca() {
		return estoqueSeguranca;
	}
	public void setEstoqueSeguranca(float estoqueSeguranca) {
		this.estoqueSeguranca = estoqueSeguranca;
	}
<<<<<<< HEAD
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", fabricante=" + fabricante + ", custo=" + custo
				+ ", lotes=" + lotes + ", categoria=" + categoria + ", tipoDePublico=" + tipoDePublico
				+ ", quantidadeTotal=" + quantidadeTotal + ", quantidadeMin=" + quantidadeMin + ", estoqueSeguranca="
				+ estoqueSeguranca + "]";
	}
=======
>>>>>>> f33ab214892e05464db6a59347bf96479c82e699
	
	

}
