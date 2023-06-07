//Faça um Programa que peça dois números e imprima a soma.
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex03 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float n1,n2,soma;
        
        //entrada de dados
        System.out.print("Digite um número: ");
        n1 = teclado.nextFloat();
        
        System.out.print("Digite outro número: ");
        n2 = teclado.nextFloat();
        
        //processamento
        soma = n1+n2;
        
        //saida de dados
        System.out.println("A soma dos dois números é de: "+soma);
    }
}