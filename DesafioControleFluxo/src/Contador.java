import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0, parametroDois = 0;

        try {
            System.out.print("Digite o primeiro parâmetro: ");
            parametroUm = terminal.nextInt();


            System.out.print("Digite o segundo parâmetro: ");
            parametroDois = terminal.nextInt();

            terminal.close();
        } catch (InputMismatchException e) {
            System.err.println("Só são aceitos valores numericos e inteiros");
        }

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    /**
     *
     * Metodo que ira realizar uma contagem de numeros apartir da subtração de outros dois numeros
     *
     * @param parametroUm (um numero inteiro)
     * @param parametroDois (outro numero inteiro)
     * @throws ParametrosInvalidosException
     */
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int indice = 1; indice <= contagem; indice++) {
            System.out.printf("\nImprimindo o número %d", indice);
        }
    }
}