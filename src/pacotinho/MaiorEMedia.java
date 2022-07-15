package pacotinho;

/*Faça um programa que leia 5 números
* e informe o maior número
* e a media desses números.
* */

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int contador = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            contador++;
        }while (contador < 5);

         System.out.println("Maior: "+maior);
         System.out.println("Média: "+(soma/5));
    }
}
