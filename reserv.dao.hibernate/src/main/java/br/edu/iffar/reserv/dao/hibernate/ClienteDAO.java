package br.edu.iffar.reserv.dao.hibernate;

import br.edu.iffar.reserv.modelo.Cliente;
import br.edu.iffar.reserv.modelo.core.dao.IClienteDAO;

/**
 * <p>
 * Implementacao dos comportamentos específicos do cliente
 * </p>
 * 
 * @author Professor
 * @since Sep 23, 2019 8:07:54 PM
 */
public class ClienteDAO extends HibernateDAO implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
