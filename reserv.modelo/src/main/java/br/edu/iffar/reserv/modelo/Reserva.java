package br.edu.iffar.reserv.modelo;

import java.util.Date;

import br.edu.iffar.reserv.modelo.core.IEntidade;

/**
 * <p>
 * Entidade que representa uma reserva feita pelo cliente
 * </p>
 * 
 * @author Professor
 * @since Aug 19, 2019 8:29:07 PM
 */
public class Reserva implements IEntidade {

	private long idReserva;
	// data da realizacao da reserva
	private Date dataReserva;
	// data prevista para entrada no quarto
	private Date dataEntrada;
	// data prevista para saida do quarto
	private Date dataSaida;
	// quantidade de pessoas que se hospedarão
	private int quantidadeHospede;
	// define o quarto
	private Quarto quarto;
	// define o cliente que esta reservando
	private Cliente cliente;
	// funcionario que verifica a reserva
	private Funcionario funcionario;
	// valor da reserva
	private double valor;

	public long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public int getQuantidadeHospede() {
		return quantidadeHospede;
	}

	public void setQuantidadeHospede(int quantidadeHospede) {
		this.quantidadeHospede = quantidadeHospede;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public long getID() {
		return getIdReserva();
	}

	public void setID(long chave) {
		setIdReserva(chave);
	}

}
