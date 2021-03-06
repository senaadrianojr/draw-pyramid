import java.util.Scanner;

public class Piramide {

// Escreva uma função/método que aceite um número inteiro positivo N.
// A função/método deve imprimir no console o formato de uma pirâmide
// de N níveis com o carácter #. Tanto do lado esquerdo quanto direito
// da pirâmide imprima um traço (-).

// --- Exemplo
// piramide(1)
// #

// piramide(2)
// -#-
// ###

// piramide(3)
// --#--
// -###-
// #####

//piramide(4)
// ---#---
// --###--
// -#####-
// #######

//piramide(5)
// ----#----
// ---###---
// --#####--
// -#######-
// #########

    public static void main(String[] args) {

        // recuperar valor inteiro positivo inserido pelo usuário 
        int niveis;
        System.out.println("Número digite o número de andares da pirâmide desejada: ");
        Scanner sc = new Scanner(System.in);
        niveis = sc.nextInt();

        System.out.println("Desenhando a pirâmide... ");
        System.out.println("Resultado: ");

        // percorrer os níveis de 1 à N, onde N é o valor de andares fornecido pelo usuário
        for(int i = 1; i <= niveis; i++) {
            imprimirHashtags(i, niveis);
            System.out.println();
        }

        System.out.println(" ================== FIM ================== ");

    }
    
    //imprime a linha do nível dado em relação ao nível da base da pirâmide
    public static void imprimirHashtags(int nivelAtual, int ultimoNivel) {
        int qtdEspacos = ultimoNivel - nivelAtual; // a quantidade de espaços para cada nível é sempre o último nível subtraído pelo nível atual (para cada lado)
        int qtdHashtagNoNivel = 1; // primeiro nível sempre possuirá um hashtag
        // para níveis os demais níveis, a quantidade de hashtags sempre será o valor do nível atual somado ao nível anterior
        if(nivelAtual != 1) {
            qtdHashtagNoNivel = nivelAtual + (nivelAtual - 1);
        }

        // imprimir os espaços do lado esquerdo da cadeia de hashtagas do nível atual
        imprimirCadeiaDeCaracteres(qtdEspacos, '-');

        // imprimir os hashtags do nível atual
        imprimirCadeiaDeCaracteres(qtdHashtagNoNivel, '#');

        // imprimir os espaços do lado direito da cadeia de hashtags do nível atual
        imprimirCadeiaDeCaracteres(qtdEspacos, '-');
    }

    //imprime N repetições de um dado caracter
    public static void imprimirCadeiaDeCaracteres(int repeticoes, char caracter) {
        for(int i = 1; i <= repeticoes; i++) {
            System.out.print(caracter);    
        }
    }
    
}
