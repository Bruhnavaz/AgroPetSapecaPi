package AgropetSapeca;

import java.sql.SQLException;
import java.util.List;

import AgropetSapeca.Lote;
import AgropetSapeca.Pet;
import AgropetSapeca.Produto;


public class LoteDAo {
	private String sql, men;
	private Bd bd;
	public LoteDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(Lote p) {
		sql = "insert into lote values (?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, p.getLote());
			bd.st.setDate(2, p.getDataAquisicao());
			bd.st.setDate(3, p.getDataValidade());
			bd.st.setFloat(4, p.getQuantidade());
			
			
			bd.st.executeUpdate();
			men = "lote inserido com sucesso";
		}
		catch(SQLException e) {
			men = "lote na inclusao do produto";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}
;
		return men;
	}
	public String alterar(Lote p) {

		sql = "update lote set data_aquisicao=?,data_de_validade=? where id_lote=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(4, p.getLote());
			bd.st.setDate(1, p.getDataAquisicao());
			bd.st.setDate(2, p.getDataValidade());
			bd.st.setFloat(3, p.getQuantidade());
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "lote alterado com sucesso";
		}else {
			men ="lote nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao do lote";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(String codigo) {

		sql = "delete from lotewhere codigo=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "lote excluido com sucesso";
		}else {
			men ="lote nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao do pet";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	
		


}
}
