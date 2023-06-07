//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex02 {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float numero;
        
        //entrada de dados
        System.out.print("Digite um número: ");
        numero = teclado.nextFloat();
        
        //saida de dados
        System.out.println("O número informado foi: "+numero);
    }
}