//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex08 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float hora,nh,salario;
        
        //entrada de dados
        System.out.println("Quanto você ganha por hora?");
        hora = teclado.nextFloat();
        
        System.out.println("Quantas horas você trabalha no mês?");
        nh = teclado.nextFloat();
        
        //processamento
        salario = hora * nh;
        
        //saida de dados
        System.out.printf("O total do seu salário referente a este mês é de: %.2f \n",salario);
    }
}