package banco.tipoDeConta;

import banco.Cliente;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    static double taxaJuros = 0.02;

    public void extrato() {
        System.out.println(String.format("===Exibindo extrato da conta corrente de %s===%n",super.cliente.getNome()));
        super.imprimirExtrato();
    }
    public void calcularJurosMes() {
        double novoSaldo = saldo * taxaJuros + saldo;
        System.out.println(String.format("Daqui a um mes a conta poupanca de %s terá %.2f",super.cliente.getNome(), novoSaldo));
    }

    public void calcularJurosAno() {
        double novoSaldo = saldo * Math.pow(1 + taxaJuros, 12);
        System.out.println(String.format("Daqui a um ano a conta poupanca de %s terá %.2f",super.cliente.getNome(), novoSaldo));
    }
}