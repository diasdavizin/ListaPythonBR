/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
*/
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex17 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a área a ser pintada em m²: ");
        
        double area = teclado.nextDouble();
        
        double qntTinta = area / 6;
        
        double galoes = Math.ceil(qntTinta / 3.6);
        
        double latas = Math.ceil(qntTinta / 18);
        
        System.out.println("Comprando apenas galões: R$ "+ galoes * 25);
        System.out.println("Comprando apenas latas: R$ "+ latas * 80);
        
        if (qntTinta * 1.1 > 18){
            int qntlatas = (int)Math.floor(qntTinta * 1.1/18);
            double a = qntTinta * 1.1-(qntlatas * 18);
            int qntgaloes = (int) Math.ceil(a / 3.6);
            System.out.println("Misturando latas e galões: R$ "+ qntlatas * 80+" em latas e R$ "+ qntgaloes * 25+" em galões");
        }
    }
}