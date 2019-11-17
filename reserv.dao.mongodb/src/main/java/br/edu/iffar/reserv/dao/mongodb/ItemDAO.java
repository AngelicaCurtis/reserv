package br.edu.iffar.reserv.dao.mongodb;

import br.edu.iffar.reserv.modelo.Item;
import br.edu.iffar.reserv.modelo.core.dao.IItemDAO;

/**
 * <p>
 * Implementação concreta dos comportamentos 
 * personalizados de persistencia para
 * a entidade Item
 * </p>
 * 
 * @author Angelica Curtis
 */
public class ItemDAO extends MorphiaDAO implements IItemDAO {

	public ItemDAO() {
		super(Item.class);
	}
}
