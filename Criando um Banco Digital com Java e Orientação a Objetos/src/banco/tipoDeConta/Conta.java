package banco.tipoDeConta;

import banco.Cliente;

public abstract class Conta {

	private static final String AGENCIA_PADRAO = "0001";
	private static int SEQUENCIAL = 1;

	protected String agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
    protected double taxaJuros;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaObjeto){
        sacar(valor);
        contaObjeto.depositar(valor);
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirExtrato(){
        System.out.println(String.format("cliente = %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia = %s",agencia));
        System.out.println(String.format("numero = %d",numero));
        System.out.println(String.format("saldo = %.2f%n",saldo));
    }
}
