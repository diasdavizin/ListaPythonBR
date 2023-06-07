//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex18 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float mb,mbps,min;
        
        //entrada de dados
        System.out.println("Digite o tamanho do arquivo em ( MB ): ");
        mb = teclado.nextFloat();
        
        System.out.println("Digite a velocidade do link da internet em ( MBPS ): ");
        mbps = teclado.nextFloat();
        
        //processamento
        min = ((mb / mbps) / 60);
        
        //saida de dados
        System.out.printf("O tempo aproximado de download do arquivo usando este link em minutos é de: %.2f minutos.\n" ,min);
    }
}