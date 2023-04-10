import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino 
* RA: 12723134472 
* Data: 07/04/2023 */

public class lista01_EstruSequen_exerc05 {
    //5. Faça um Programa que pergunte ao usuário um valor em metros e
    //converta o valor digitado para centímetros.

    public static void main(String args[]){
       
        Scanner val = new Scanner(System.in);
      
        System.out.print("Quantos metros? ");
        float metros = val.nextFloat();
      
        float centimetros = metros * 100;
      
        System.out.printf("Isso equivale a: %.1f cm",centimetros);
      
        val.close();
      }
}
