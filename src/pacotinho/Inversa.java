package pacotinho;

public class Inversa {
    public static void main(String[] args) {
        int[] vetor = {-5, -6, -34, -82};

        //System.out.println(vetor.length);
        System.out.println("Invertendo a array.");
        System.out.print("vetor: ");
        int count = 0;
        while (count < (vetor.length)){
            System.out.print(vetor[count]+ " ");
            count++;
        }

        System.out.print("\nvetor: ");
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i]+ " ");

        }
    }
}
