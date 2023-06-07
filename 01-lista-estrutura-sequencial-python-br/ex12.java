/*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que 
calcule seu peso ideal,usando a seguinte fórmula: 
(72.7*altura) - 58
*/
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        double altura,pesoideal;
       
        //entrada de dados
        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble();
        
        //processamento
        pesoideal = (72.7 * altura) - 58;
        
        //saida de dados
        System.out.printf("O seu peso ideal é de: %.2f \n",pesoideal);
    }
}