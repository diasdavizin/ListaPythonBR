/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar 
o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior
que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça 
um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar
na variável excesso a quantidade de quilos além do limite e na variável multa o 
valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens
adequadas.
*/
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex14 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        double peso;
        double multa = 0;
        double excesso = 0;
        
        System.out.println("Digite o peso do peixe: ");
        peso = teclado.nextDouble();
        
        if(peso > 50){
            excesso = ( peso - 50 );
       
            multa = ( excesso * 4 );
            
            System.out.printf("Você excedeu em %.2f kgs sobre o regulamento de pesca do estado de São Paulo.\n",excesso);
            
            System.out.printf("Você pagara R$ %.2f de multa por kgs excedentes\n",multa);
            
        }else{
           System.out.printf("O total de kgs dos peixes foi de: %.2f kgs\n",peso); 
        }
    }
}