/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

a) salário bruto.
b) quanto pagou ao INSS.
c) quanto pagou ao sindicato.
d) o salário líquido.
e) calcule os descontos e o salário líquido, conforme a tabela abaixo:
    + Salário Bruto : R$
    - IR (11%) : R$
    - INSS (8%) : R$
    - Sindicato ( 5%) : R$
    = Salário Liquido : R$

Obs.: Salário Bruto - Descontos = Salário Líquido.
*/
package sequencialpythonbrasil;
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float hr,sb,ir,inss,sd,sl,dcs,nh;
        
        //entrada de dados
        System.out.println("Digite quanto você ganha por hora: ");
        hr = teclado.nextFloat();
        
        System.out.println("Digite quantas horas você trabalha no mês: ");
        nh = teclado.nextFloat();
        
        //processamento
        sb = ( hr * nh );
        ir = ( sb * 11 ) / 100;
        inss = ( sb * 8 ) / 100;
        sd = ( sb * 5 ) / 100;
        dcs = ( ir + inss + sd );
        sl = sb - dcs;
        
        //saida de dados
        System.out.println("Tabela de dados: ");
        System.out.println("+ Salário Bruto : R$ "+sb);
        System.out.println("- IR (11%) : R$ "+ir);
        System.out.println("- INSS (8%) : R$ "+inss);
        System.out.println("- Sindicato ( 5%) : R$ "+sd);
        System.out.println("= Salário Liquido : R$ "+sl);
    }
}