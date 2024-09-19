import java.util.concurrent.ThreadLocalRandom;

public class candidatura {
    public static void main(String[] args) {
        selecaoDeCanditatos();
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Alex", "Adriano", "Alessandra", "Marcia"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento ");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + indice + "é " + candidatos[indice]);
        }
    
    }

    static void selecaoDeCanditatos() {
        String[] candidatos = {"Felipe", "Alex", "Adriano", "Alessandra", "Marcia", "Julia", "Fernando", "Marcos", "Joao", "Gustavo"};
    
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];

            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    
        if (candidatosSelecionados < 5) {
            System.out.println("Menos de 5 candidatos selecionados.");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Entrar em contato para contraproposta.");
        } else {
            System.out.println("Aguardando demais Candidatos.");
        }
    }
}
