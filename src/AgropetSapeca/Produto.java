package AgropetSapeca;

public class Produto {
	
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
	}
	public float getEstoqueSeguranca() {
		return estoqueSeguranca;
	}
	public void setEstoqueSeguranca(float estoqueSeguranca) {
		this.estoqueSeguranca = estoqueSeguranca;
	}
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", fabricante=" + fabricante + ", custo=" + custo
				+ ", lotes=" + lotes + ", categoria=" + categoria + ", tipoDePublico=" + tipoDePublico
				+ ", quantidadeTotal=" + quantidadeTotal + ", quantidadeMin=" + quantidadeMin + ", estoqueSeguranca="
				+ estoqueSeguranca + "]";
	}
	
	

}
