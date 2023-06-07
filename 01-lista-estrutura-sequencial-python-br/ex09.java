/*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).
*/
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex09 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float fahrenheit,celsius;
        
        //entrada de dados
        System.out.println("Insira a temperatura em Fahrenheit: ");
        fahrenheit = teclado.nextFloat();
        
        //processamento
        celsius = 5 * ((fahrenheit - 32) / 9);
        
        //saida de dados
        System.out.printf("O valor de %.2f°C fahrenheint em celsius é de %.2f°C \n",fahrenheit ,celsius);
    }
}