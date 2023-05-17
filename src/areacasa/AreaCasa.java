package areacasa;

/**
 *
 * @author Vitor de Jesus ❣🚀❣
 *
 */

import java.util.Scanner;

public class AreaCasa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String resposta, nome;
        double largura, comprimento, areaComodo, areaTotal;
        areaTotal = 0;

        System.out.println("********************************");
        System.out.println("  DESCUBRA A ÁREA DA SUA CASA!");
        System.out.println("********************************");
        System.out.println("");

        System.out.println("Deseja adionar um cômodo? (S/N)");
        resposta = teclado.nextLine();
        System.out.println("");

        if (resposta.equals("S")) {

            for (; resposta.equals("S");) {

                System.out.println("Qual o nome do cômodo?");
                nome = teclado.nextLine();
                System.out.println("");

                System.out.println("Qual a largura de " + nome + "?");
                largura = teclado.nextDouble();
                System.out.println("");

                System.out.println("E o comprimento?");
                comprimento = teclado.nextDouble();
                System.out.println("");

                areaComodo = comprimento * largura;

                System.out.println("A área de " + nome + " é: " + areaComodo + "m²");
                System.out.println("");

                areaTotal += areaComodo;

                teclado.nextLine();

                System.out.println("Deseja adionar outro cômodo? (S/N)");
                resposta = teclado.nextLine();

                System.out.println("");

            }

            System.out.println("A área total da sua residência é: " + areaTotal + "m²");

        } else {

            System.out.println("Não foi possível encontrar a área de sua casa");

        }

    }

}
