package AgropetSapeca;

import java.sql.SQLException;
import java.util.List;

public class ProdutoDAo {
	private String sql, men;
	private Bd bd;
	public ProdutoDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(Produto p) {
		sql = "insert into PRODUTO values (?,?,?,?,?,?,?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, p.getIdProduto());
			bd.st.setString(2, p.getNome());
			bd.st.setString(3, p.getFabricante());
			bd.st.setFloat(4, p.getCusto());
			bd.st.setString(5, p.getLotes());
			bd.st.setString(6, p.getCategoria());
			bd.st.setString(7, p.getTipoDePublico());
			bd.st.setFloat(8, p.getQuantidadeTotal());
			bd.st.setFloat(9, p.getQuantidadeMin());
			bd.st.setFloat(10, p.getEstoqueSeguranca());
			
			bd.st.executeUpdate();
			men = "produto inserido com sucesso";
		}
		catch(SQLException e) {
			men = "falha na inclusao do produto";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}
;
		return men;
	}
	public String alterar(Produto p) {

		sql = "update produtos set nome=?,preco=?,estoque=? where codigo=?";
		bd.getConnection();
		try {
			//bd.st = bd.con.prepareStatement(sql);
			//bd.st.setInt(4, p.getCodigo());
			//bd.st.setString(1, p.getNome());
			//bd.st.setDouble(2, p.getPreco());
			//bd.st.setInt(3, p.getEstoque());
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "produto alterado com sucesso";
		}else {
			men ="produto nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao do produto";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(int codigo) {

		sql = "delete from produtos where codigo=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "produto excluido com sucesso";
		}else {
			men ="produto nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao do produto";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	}
	public Produto get(int codigo) {
		return null;
	}
	public List<Produto> get() {
		return null;
	}

}
