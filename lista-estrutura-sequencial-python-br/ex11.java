/* Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
 a) o produto do dobro do primeiro com metade do segundo .
 b) a soma do triplo do primeiro com o terceiro.
 c) o terceiro elevado ao cubo.
*/
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex11 {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        int n1,n2;
        double n3,soma1,soma2,soma3;
        
        //entrada de dados
        System.out.println("Insira o primeiro número inteiro: ");
        n1 = teclado.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        n2 = teclado.nextInt();
        
        System.out.println("Digite um número real: ");
        n3 = teclado.nextDouble();
        
        //processamento
        soma1 = ((n1*2) * (n2/2));
        soma2 = ((n1*3) + n3);
        soma3 = Math.pow(n3,3);
        
        //saida de dados
        System.out.println("O produto do dobro do primeiro com a metade do segundo é de: "+soma1);
        System.out.println("A soma do triplo do primeiro com o terceiro é de: "+soma2);
        System.out.printf("A soma do terceiro elevado ao cubo é de: %.2f \n",soma3);
    } 
}