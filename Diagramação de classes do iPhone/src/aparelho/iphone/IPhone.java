package aparelho.iphone;

import aparelho.funcionalidades.AparelhoTelefonico;
import aparelho.funcionalidades.Navegador;
import aparelho.funcionalidades.ReprodutorMusical;

public class IPhone implements Navegador, AparelhoTelefonico, ReprodutorMusical{

    // Metodos da interface Navegador
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    
    // Metodos da interface AparelhoTelefonico
    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Reproduzindo correio de voz");
    }

    // Metodos da interface ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
    }

