/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em 
metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro 
para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
*/
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex16 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
      
        System.out.println("Infome a área a ser pintada em m²: ");
        double m2 = teclado.nextDouble();
        
        double qntTn = m2 * 0.3333;
        
        int qntLts = (int) Math.ceil( qntTn / 18 );
        
        System.out.println("A quantidade de latas necessárias é de: " + qntLts);
        System.out.println("O preço total das latas é de: R$ "+ qntLts*80);
    }
}
