package AgropetSapeca;
/*
 * carregando o BD
 */

public class InserirProduto {

	public static void main(String[] args) {
ProdutoDAo dao = new ProdutoDAo();
		
		Produto p = new Produto();
		p.setIdProduto("1");
		p.setNome("Magnus_adulto");
		p.setFabricante("Magnus");
		p.setCusto(10);
		p.setLotes("A1");
		p.setCategoria("Ração animal");
		p.setTipoDePublico("Cachorro");
		p.setQuantidadeTotal(10);
		p.setQuantidadeMin(5);		
		p.setEstoqueSeguranca(7);
		
		System.out.println(dao.inserir(p));

	}

}
