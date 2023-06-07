/* Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo
que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
*/
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex13 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        double altura;
        String sexo;
        
        
        //entrada de dados
        System.out.println("Informe sua altura: ");
        altura = teclado.nextDouble();
        
        System.out.println("Informe seu sexo ( Homem ou Mulher ): ");
        sexo = teclado.next();
        
        //processamento
         switch (sexo){
            case "Homem":
            System.out.println("Seu peso ideal é de: "+((72.7F*altura)-58));
        
            break;

            case "Mulher": System.out.printf("Seu peso ideal é: "+((62.1F*altura)-44.7F));
            break;
              
            default: System.out.println("Sexo inválido");
            break;
        }
         teclado.close();
        }
}