package br.edu.iffar.reserv.dao.mongodb;

import br.edu.iffar.reserv.modelo.Reserva;
import br.edu.iffar.reserv.modelo.core.dao.IReservaDAO;

/**
 * <p>
 * Implementacao dos comportamentos específicos da reserva
 * </p>
 * 
 * @author Angelica Curtis
 */
public class ReservaDAO extends MorphiaDAO implements IReservaDAO {

	public ReservaDAO() {
		super(Reserva.class);
	}

}
