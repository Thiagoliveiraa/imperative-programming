package imperative.programming.array02;

import java.util.Scanner;

/*
 * @author Thiago
 */
public class ImperativeProgrammingArray02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] valorUnitarioDosObjetos = new double[5];
        int[] quantidadeVendidaDeCadaObjeto = new int[5];
        double[] valorTotalDeCadaObjeto = new double[5];
        int quantidadeDeObjetosVendidos = 0;
        double valorGeralDeVendas = 0.0;
        double comissaoDeProdutosVendidos = 0.0;
        double objetoMaisVendido = 0.0;
        int posicaoMaisVendido = 0;
        for (int i = 0; i < valorUnitarioDosObjetos.length; i++) {
            System.out.println("Informe o valor do produto " + (i + 1));
            valorUnitarioDosObjetos[i] = input.nextDouble();
            System.out.println("Informe a quantidade vendida do produto " + (i + 1));
            quantidadeVendidaDeCadaObjeto[i] = input.nextInt();
            quantidadeDeObjetosVendidos += quantidadeVendidaDeCadaObjeto[i];
            valorTotalDeCadaObjeto[i] = valorUnitarioDosObjetos[i] * quantidadeVendidaDeCadaObjeto[i];
            valorGeralDeVendas += valorTotalDeCadaObjeto[i];
            if (i == 0) {
                objetoMaisVendido = valorTotalDeCadaObjeto[i];

            } else {
                if (valorTotalDeCadaObjeto[i] > objetoMaisVendido) {
                    objetoMaisVendido = valorTotalDeCadaObjeto[i];
                    posicaoMaisVendido = i;
                }
            }
        }
        comissaoDeProdutosVendidos = (0.05 * valorGeralDeVendas);
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0; i < valorUnitarioDosObjetos.length; i++) {
            System.out.println("Valor unitario do objeto " + (i + 1) + " é de U$ " + valorUnitarioDosObjetos[i]);
            System.out.println("Valor total do objeto " + (i + 1) + " é de U$ " + valorTotalDeCadaObjeto[i]);

        }
        System.out.println("A quantidade vendida foi de " + quantidadeDeObjetosVendidos + " produtos");
        System.out.println("O valor total de vendas foi de U$ " + valorGeralDeVendas);
        System.out.println("O vendedor recebera de comissao U$ " + comissaoDeProdutosVendidos);
        System.out.println("O valor do objeto mais vendido foi de U$ " + objetoMaisVendido + " e este objeto é o " + (posicaoMaisVendido + 1));
        System.out.println("-------------------------------------------------------------------------");
    }

}
