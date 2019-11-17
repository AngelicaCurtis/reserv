package br.edu.iffar.reserv.dao.mongodb;

import br.edu.iffar.reserv.modelo.Quarto;
import br.edu.iffar.reserv.modelo.core.dao.IQuartoDAO;

/**
 * <p>
 * Implementação concreta dos comportamentos personalizados
 * de persistencia para a entidade Quarto
* </p>
* @author Angelica Curtis
*/
public class QuartoDAO extends MorphiaDAO
                             implements IQuartoDAO {

	public QuartoDAO() {
		super(Quarto.class);
	}
}
