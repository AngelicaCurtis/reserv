package br.edu.iffar.reserv.dao.mongodb;

import com.mongodb.MongoClient;
import dev.morphia.Datastore;
import dev.morphia.Morphia;


/**
 * <p>
 * Classe utilitária para criar novas sessões de conexão com banco de dados
 * </p>
 *
 * @author Angelica Curtis
 */
public class MorphiaHelper {

    private static Morphia fabrica;

    /**
     * <p>
     * Abre uma nova sessão de conexão de conexao com banco de dados
     * </p>
     */
    public static Datastore getDatastore() {
        if (fabrica == null) {
            // inicializar a fabrica
            configurarFabrica();
        }
        return fabrica.createDatastore(new MongoClient(), "reserv");
    }

    /**
     * <p>
     * CRia uma fábrica de sessões, na prática neste método se realiza a conexão
     * efetiva com banco de dados, com base no arquivo de configuracao
     * hibernate.properties
     * </p>
     */
    private static void configurarFabrica() {
        fabrica = new Morphia();
        fabrica.mapPackage("br.edu.iffar.reserv.modelo");
    }

}
