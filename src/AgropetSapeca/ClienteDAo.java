package AgropetSapeca;

import java.sql.SQLException;
import java.util.List;

import AgropetSapeca.Cliente;
import AgropetSapeca.Produto;


public class ClienteDAo {
	private String sql, men;
	private Bd bd;
	public ClienteDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(Cliente p) {
		sql = "insert into cliente values (?,?,?,?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, p.getCpf());
			bd.st.setString(2, p.getNome());
			bd.st.setString(3, p.getEndereco());
			bd.st.setString(4, p.getEstado());
			bd.st.setString(5, p.getCidade());
			bd.st.setInt(6, p.getTelefone());
            bd.st.setString(7, p.getEmail());
			
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
	public String alterar(Cliente p) {

		sql = "update cliente set cpf=?,nome=?,endereco=?,estado=?,cidade=?,telefone=?,email=? where cpf=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(7, p.getCpf());
			bd.st.setString(1, p.getNome());
			bd.st.setString(2, p.getEndereco());
			bd.st.setString(3, p.getEstado());
			bd.st.setString(4, p.getCidade());
			bd.st.setInt(5, p.getTelefone());
            bd.st.setString(5, p.getEmail());
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "cliente alterado com sucesso";
		}else {
			men ="cliente nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao do cliente";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(String codigo) {

		sql = "delete from cliente where cpf=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "cliente excluido com sucesso";
		}else {
			men ="cliente nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao do cliente";
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
