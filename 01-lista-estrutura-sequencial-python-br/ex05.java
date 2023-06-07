//Faça um programa que converta metros para centímetros.
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float metros,centimetros;
        
        //entrada de dados
        System.out.println("Insira os metros: ");
        metros = teclado.nextFloat();
        
        //processamento
        centimetros = metros*100;
        
        //saida de dados
        System.out.printf("%.2f metros equivale há %.2f centimetros.\n",metros, centimetros);
    }
}
