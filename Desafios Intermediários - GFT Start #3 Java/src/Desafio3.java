/*


Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12].
Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da diagonal principal da matriz.


Entrada

A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz.
Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída

Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

 */

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        float soma = 0;
        int contador = 0;

        DecimalFormat df = new DecimalFormat("##0.0");
        Float[][] matrix = new Float[12][12];

        String acao = leitor.next();

        for(int linha = 0 ; linha <= 11; ++linha){
            for (int coluna = 0 ; coluna <=11; ++coluna){
                matrix[linha][coluna] = leitor.nextFloat();
            }
        }

        for(int linha = 0; linha <= 10 ; ++linha){
            for(int coluna = linha+1; coluna <= 11; ++coluna){
                soma += matrix[linha][coluna];
                contador++;
            }
        }

        if(Objects.equals(acao, "S")) System.out.println(df.format(soma));
        else System.out.println(df.format(soma/contador));
    }

}
