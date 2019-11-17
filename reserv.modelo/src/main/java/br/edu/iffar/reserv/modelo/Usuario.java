package br.edu.iffar.reserv.modelo;



import br.edu.iffar.reserv.modelo.core.IEntidade;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

/**
 * <p>
 * Entidade genérica que representa um usuário 
 * do sistema. Não existirá usuário sem 
 * especialização, sendo sempre um cliente ou 
 * usuário.
* </p> 
* @author Professor
* @since Aug 19, 2019 8:22:31 PM
*/
@Entity
public abstract class Usuario implements IEntidade {
	@Id
	private long id;
	private String nome;
	private String telefone;
	private String email;
	private String senha;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public long getID() {
		return getId();
	}
	public void setID(long chave) {
		setId(chave);
	}
}
