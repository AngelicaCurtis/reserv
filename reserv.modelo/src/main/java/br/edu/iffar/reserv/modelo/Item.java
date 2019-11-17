package br.edu.iffar.reserv.modelo;

import br.edu.iffar.reserv.modelo.core.IEntidade;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

/**
 * <p>
 * Entidade que representa um item presente no quarto, como por exemplo,
 * frigobar, cama de casal, secador de cabelo entre outros
 * </p>
 * 
 * @author Professor
 * @since 19/08/2019 20:04
 */
@Entity
public class Item implements IEntidade {
	// chave pri maria
	@Id
	private long id;
	// descreve o item do quarto
	private String descricao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getID() {
		return getId();
	}

	public void setID(long chave) {
		setId(chave);
	}

}
