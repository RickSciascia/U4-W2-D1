package Es1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arrayInteri = new int[5];
        for (int i=0; i < arrayInteri.length;i++) {
            Random r = new Random();
            int numero = r.nextInt(11);
            arrayInteri[i]=numero;
        }
        int indiceSelezionato;
        do {
            System.out.println("Inserisci un numero da 1 a 5 per visualizzare un elemento dell Array, 0 per uscire");
            indiceSelezionato = Integer.parseInt(s.nextLine());
            if( indiceSelezionato >0 && indiceSelezionato <= arrayInteri.length) {
            int indiceReale = indiceSelezionato-1;
            System.out.println("Questo è l'Array che era stato generato: " + Arrays.toString(arrayInteri));
            System.out.println("quindi il tuo numero è: " + arrayInteri[indiceReale]);
            }
        } while(indiceSelezionato != 0);


    }
}
