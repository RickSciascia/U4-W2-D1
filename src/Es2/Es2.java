package Es2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci quanti KM ha percorso l auto:");
//        int km = Integer.parseInt(s.nextLine());
        double km = Double.parseDouble(s.nextLine());
        System.out.println("Inserisci quanti litri ha consumato l auto:");
//        int lt = Integer.parseInt(s.nextLine());
        double lt = Double.parseDouble(s.nextLine());
        try {
//            int result = km / lt;
            double result = km / lt;
            if (Double.isInfinite(result)) throw new RuntimeException();
            System.out.println("La tua auto percorre: " + result + " Km/L!");
        } catch (Exception e) {
            System.out.println("Ciao purtoppo hai diviso i km percorsi per 0 è impossibile");
        }
        System.out.println("Ciao, vengo visualizzato se tutto è stato fatto correttamente");

    }
}
