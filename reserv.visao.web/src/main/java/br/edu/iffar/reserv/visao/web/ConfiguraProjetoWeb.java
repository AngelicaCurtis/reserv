package br.edu.iffar.reserv.visao.web;
import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.edu.iffar.reserv.dao.mongodb.MorphiaDAO;
import br.edu.iffar.reserv.modelo.core.dao.FabricaDAO;

import javax.enterprise.event.Observes;

/**
 * <p>
 * Definir as  configurações necessárias ou pertinentes a 
 * um projeto Java web.
 * Essas configurações ocorrem uma única vez ao inicializar a 
 * aplicação
 * </p>
 * @author fernando
 *
 */
public class ConfiguraProjetoWeb {

	public void inicializa(@Observes VRaptorInitialized init) {
		System.out.println("Inicializando app web!");
		// define o modelo de persistencia
		FabricaDAO.defineModelo(new MorphiaDAO());
		System.out.println("Modelo de persistência definido!");
	}
	
}
