import banco.Cliente;
import banco.tipoDeConta.ContaCorrente;
import banco.tipoDeConta.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
        Cliente anderson = new Cliente();
        anderson.setNome("Anderson");

		ContaCorrente cc = new ContaCorrente(venilton);
		ContaPoupanca poupanca = new ContaPoupanca(anderson);

		cc.depositar(150);
		cc.transferir(100, poupanca);
		
		cc.extrato();
		poupanca.extrato();

        cc.calcularJurosMes();
        poupanca.calcularJurosMes();
        System.out.println("");

        cc.calcularJurosAno();
        poupanca.calcularJurosAno();


    }
}
