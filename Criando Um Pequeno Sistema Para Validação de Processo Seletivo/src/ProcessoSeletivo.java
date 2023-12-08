import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {

    static int contagemCandidatos = 0;
    static double salarioBase = 2000.0;
    static int candidatosSelecionados = 0;
    static String[] nomeSelecionados = new String[5];
    static double[] salarioSelecionados = new double[5];

    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo \n \n");
        selecaoCandidatos();

    }



    static void selecaoCandidatos(){

    String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
    //String[] nomeSelecionados = new String[5];
    //double[] salarioSelecionados = new double[5];

    for (int i = 0; i < candidatos.length; i++) {
        double salarioPretendido = valorPretendido();
        System.out.println(String.format("O canditato " + candidatos[i] + " pretende ter um salario de %.2f", salarioPretendido));
    
        if (salarioPretendido <= salarioBase) {
            nomeSelecionados[candidatosSelecionados] = candidatos[i];
            salarioSelecionados[candidatosSelecionados] = salarioPretendido;
            candidatosSelecionados++;
        if (candidatosSelecionados == 5)
            break;
        }
    }

    System.out.println("\n Candidatos Selecionados: \n");
    for (int n = 0; n < nomeSelecionados.length; n++) {
        if (nomeSelecionados[n] != null) {
            System.out.println(String.format("%s - %.2f", nomeSelecionados[n], salarioSelecionados[n]));
        }else break;
    }

    System.out.println("\n Resultado do contato com os candidatos \n");
    for (int n = 0; n < nomeSelecionados.length; n++) {
        if (nomeSelecionados[n] != null) {
            tentarContato(nomeSelecionados[n]);
        }else break;

    }
}

    static void tentarContato(String contato){
        for (int i = 1; i < 4; i++){
            boolean verificarAtendeu = verificarAtendeu();
            if (verificarAtendeu){
            System.out.println(String.format("O canditato %s atendeu na %dº tentativa.", contato, i));
                break;
            }else if (i == 3) {
                System.out.println("O candidato " + contato + " não retornou as ligações");
            }
            
            }

        }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }


    static void analisarCandidato (double salarioPretendido){
        contagemCandidatos++;
        if (salarioBase > salarioPretendido){
            System.out.println(String.format("Candidato número %d: Ligar para o candidato!",contagemCandidatos));
        }
        else if (salarioBase == salarioPretendido){
            System.out.println(String.format("Candidato número %d: Ligar para o candidato, com contraproposta!",contagemCandidatos));
        }
        else {
            System.out.println(String.format("Candidato número %d: Esperar mais candidatos",contagemCandidatos));
        }
        }
    
    static boolean verificarAtendeu (){
        return new Random().nextInt(3) == 1;
    }

}