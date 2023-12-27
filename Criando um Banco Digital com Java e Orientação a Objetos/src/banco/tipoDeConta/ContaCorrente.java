package banco.tipoDeConta;

import java.lang.Math;
import banco.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    static double taxaJuros = 0.01; 
    
    public void extrato() {
        System.out.println(String.format("===Exibindo extrato da conta corrente de %s===%n",super.cliente.getNome()));
        super.imprimirExtrato();
    }
    public void calcularJurosMes() {
        double novoSaldo = saldo * taxaJuros + saldo;
        System.out.println(String.format("Daqui a um mes a conta corrente de %s terá %.2f",super.cliente.getNome(), novoSaldo));
    }

    public void calcularJurosAno() {
        double novoSaldo = saldo * Math.pow(1 + taxaJuros, 12);
        System.out.println(String.format("Daqui a um ano a conta corrente de %s terá %.2f",super.cliente.getNome(), novoSaldo));
    }
}
