package br.edu.iffar.reserv.dao.mongodb;

import br.edu.iffar.reserv.modelo.core.IEntidade;
import br.edu.iffar.reserv.modelo.core.dao.DAOException;
import br.edu.iffar.reserv.modelo.core.dao.IDAO;
import dev.morphia.Datastore;

import java.util.List;

/**
 * <p>
 * Implementacao do padrao DAO com base no framework hibernate
 * </p>
 *
 * @author Angelica Curtis
 */
public class MorphiaDAO implements IDAO {
    private Datastore sessao;
    // referencia para a classe da entidade
    private Class<? extends IEntidade> classeEntidade;

    /**
     * <p>
     * Construtor padrão para definição de modelo de persistencia
     * </p>
     */
    public MorphiaDAO() {
        // chama o construtor que recebe como parametro
        // uma classe de entidade
        this(null);
    }

    /**
     * <p> Somente cria-se instancias de dao para entidades
     * do sistema. Deve-se passar sempre como parametro
     * a classe (.class) da entidade
     */
    public MorphiaDAO(Class<? extends IEntidade> entidade) {
        this.classeEntidade = entidade;
        this.sessao = MorphiaHelper.getDatastore();
    }

    public void gravar(IEntidade entidade) throws DAOException {
        this.sessao.save(entidade);
    }

    public void excluir(IEntidade entidade) throws DAOException {
        this.sessao.delete(entidade);
    }

    public IEntidade buscaPorChave(long chave) throws DAOException {
        return this.sessao.createQuery(this.classeEntidade)
                .field("id")
                .equal(chave)
                .first();
    }

    public List<IEntidade> getList(String ordem) throws DAOException {
        return (List<IEntidade>) sessao.createQuery(this.classeEntidade)
                .find()
                .toList();
    }

    public <Futuro extends IDAO> Futuro criaNovoDAO(Class<? extends IEntidade> classeEntidade) throws DAOException {
        // monta o pacote da classe a ser instanciada
        StringBuffer pacote = new StringBuffer();
        pacote.append("br.edu.iffar.reserv.dao.mongodb.");
        pacote.append(classeEntidade.getSimpleName());
        pacote.append("DAO");
        try {
            Class classeDAO = Class.forName(pacote.toString());
            return (Futuro) classeDAO.newInstance();
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage());
        }
    }

}
