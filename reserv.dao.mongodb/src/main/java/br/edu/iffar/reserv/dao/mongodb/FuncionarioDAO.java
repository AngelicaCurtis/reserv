package br.edu.iffar.reserv.dao.mongodb;

import br.edu.iffar.reserv.modelo.Funcionario;
import br.edu.iffar.reserv.modelo.core.dao.IFuncionarioDAO;

/**
 * <p>
 * Implementacao dos comportamentos específicos do funcionario
 * </p>
 * 
 * @author Angelica Curtis
 */
public class FuncionarioDAO extends MorphiaDAO implements IFuncionarioDAO {

	public FuncionarioDAO() {
		super(Funcionario.class);
	}

}
