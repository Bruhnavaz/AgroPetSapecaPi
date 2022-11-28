package AgropetSapeca;

import java.sql.Date;

public class Pet {
	
	/*
	 * determinando os atributoa da classe pet
	 */
	private String nomePet;
	private String id_pet;
	private Date dataNascimentoPet;
	private String tipo;// cachorro, gato, cavalo...
	private String sexo;
	private String porte; // aqui é para indicar o tamnanho do pet, podendo ser pequeno médio ou grande
	
	public String getNomePet() {
		return nomePet;
	}
	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
	public Date getDataNascimentoPet() {
		return dataNascimentoPet;
	}
	public void setDataNascimentoPet(Date dataNascimentoPet) {
		this.dataNascimentoPet = dataNascimentoPet;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getId_pet() {
		return id_pet;
	}
	public void setId_pet(String id_pet) {
		this.id_pet = id_pet;
	}

	
}