//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex07 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float area,dobro;
        
        //entrada de dados
        System.out.println("Digite o valor de um lado do quadrado: ");
        area = teclado.nextFloat();
        
        //processamento
        dobro = (area*area)*2;
        
        //saida de dados
        System.out.println("O dobro da área do quadrado é de: "+dobro);
    }
}