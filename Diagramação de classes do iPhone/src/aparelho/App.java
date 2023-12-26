package aparelho;

import aparelho.iphone.IPhone;

public class App {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        // Exemplos dos metodos da interface 
        iphone.ligar();
        iphone.tocar();
        iphone.exibirPagina();
    }
}
