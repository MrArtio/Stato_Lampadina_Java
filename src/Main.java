import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il numero di click massimo per la lampadina: ");
        int nClick = in.nextInt();
        Lampadina nomeLampadina = new Lampadina(nClick);

        String scelta;
        do {
            System.out.print("\nVuoi cliccare (c) oppure visualizzare (v)? ");
            String clickVisual = in.next();
            if (Objects.equals(clickVisual, "c")) {
                nomeLampadina.click();
            } else if (Objects.equals(clickVisual, "v")) {
                System.out.print(nomeLampadina.toString());
            } else {
                System.out.print("\nError, inserisci un valore valido\n");
            }

            System.out.print("\nVuoi continuare? y/n: ");
            scelta = in.next();
        } while (Objects.equals(scelta, "y"));
    }
}