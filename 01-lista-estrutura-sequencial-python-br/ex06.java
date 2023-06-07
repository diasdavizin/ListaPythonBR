//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex06 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        double raio,area;
        
        //entrada de dados
        System.out.println("Digite o raio do círculo: ");
        raio = teclado.nextDouble();
        
        //processamento
        area = Math.PI* (raio*raio);
        
        //saida de dados
        System.out.printf("O valor da area é de: %.2f \n", area);
    }
}