package pacotinho;

import java.util.Random;

/*
Faça um programa que leia 20 numeros inteiros aleatórios (entre 0  e 100) armazene-os num vetor.
Ao final mostreos numeros sucessores.
* */
public class NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();


        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        for(int numero : numerosAleatorios){
            System.out.println(numero + " ");
        }

        System.out.print("Sucessores dos números Aleatórios: ");
        for(int numero : numerosAleatorios){
            System.out.println((numero+1) + " ");
        }
        System.out.print("Antecessores dos números Aleatórios: ");
        for(int numero : numerosAleatorios){
            System.out.println((numero-1) + " ");
        }

    }
}
