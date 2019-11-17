package br.edu.iffar.reserv.dao.mongodb;

import br.edu.iffar.reserv.modelo.Cliente;
import br.edu.iffar.reserv.modelo.core.dao.IClienteDAO;

/**
 * <p>
 * Implementacao dos comportamentos específicos do cliente
 * </p>
 * 
 * @author Angelica Curtis
 */
public class ClienteDAO extends MorphiaDAO implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
