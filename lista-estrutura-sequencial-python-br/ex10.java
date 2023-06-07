//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex10 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        double celsius, fahrenheit;
        
        //entrada de dados
        System.out.println("Insira o valor da temperatura em graus Celsius: ");
        celsius = teclado.nextDouble();
        
        //processamento
        fahrenheit = (celsius * 1.8) + 32;
        
        //saida de dados
        System.out.printf("O valor de %.2f°C Celsius em Fahrenheit é de %.2f°C \n",celsius ,fahrenheit);
    }
}