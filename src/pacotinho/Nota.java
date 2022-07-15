package pacotinho;
/*
* Faça um programa que peça uma nota, entre zero e dez.
* mostre uma mensagem caso o valor seja inválido
* e continue pedidno
* até que o usuário informe um valor válido.*/

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite novamnete. ");
            nota = scan.nextInt();

        }
    }
}
