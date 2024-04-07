import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            double primoNumero;
            double secondoNumero;
            String sceltaOperatore;
            double risultato;

            System.out.print("Primo numero da calcolare: ");
            primoNumero = s.nextDouble();
            System.out.print("Seleziona l'operatore: ");
            sceltaOperatore = s.next();

            switch (sceltaOperatore) {
                case "+" -> {

                    System.out.print("Secondo numero da calcolare: ");
                    secondoNumero = s.nextDouble();
                    risultato = primoNumero + secondoNumero;
                    System.out.println("Risultato: " + risultato);
                    main(args);
                }
                case "-" -> {

                    System.out.print("Secondo numero da calcolare: ");
                    secondoNumero = s.nextDouble();
                    risultato = primoNumero - secondoNumero;
                    System.out.println("Risultato: " + risultato);
                    main(args);
                }
                case "*" -> {

                    System.out.print("Secondo numero da calcolare: ");
                    secondoNumero = s.nextDouble();
                    risultato = primoNumero * secondoNumero;
                    System.out.println("Risultato: " + risultato);
                    main(args);
                }
                case "/" -> {

                    System.out.print("Secondo numero da calcolare: ");
                    secondoNumero = s.nextDouble();
                    if (primoNumero == 0 || secondoNumero == 0) {
                        System.out.println("Numero non divisibbile per zero");
                    } else {
                        risultato = primoNumero / secondoNumero;
                        System.out.println("Risultato: " + risultato);
                    }
                    main(args);
                }
                default -> {

                    System.out.println("Attenzione operatore invalido");
                    main(args);
                }
            }

        } catch (NoSuchElementException w) {
            System.out.println("Attenzione inserire solo numeri!!");
            s.nextLine();
            main(args);

        }
    }
}
