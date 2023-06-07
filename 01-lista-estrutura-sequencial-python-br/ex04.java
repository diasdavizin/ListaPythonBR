//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex04 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float n1,n2,n3,n4,media;
        
        //entrada de dados
        System.out.println("Digite o valor da primeira nota: ");
        n1 = teclado.nextFloat();
        
        System.out.println("Digite o valor da segunda nota: ");
        n2 = teclado.nextFloat();
        
        System.out.println("Digite o valor da terceira nota: ");
        n3 = teclado.nextFloat();
        
        System.out.println("Digite o valor da quarta nota: ");
        n4 = teclado.nextFloat();
        
        //processamento
        media = (n1+n2+n3+n4)/4;
        
        //saida de dados
        System.out.println("A média das notas é de: "+media);
    }
}