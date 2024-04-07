import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try  {
            float primoNumero;
            float secondoNumero;
            String sceltaOperatore;

            System.out.print("Primo numero da calcolare: ");
            primoNumero = s.nextFloat();
            System.out.print("Seleziona l'operatore: ");
            sceltaOperatore = s.next();

            switch (sceltaOperatore) {
                case "+" -> {

                    System.out.print("Secondo numero da calcolare: ");
                    secondoNumero = s.nextFloat();
                    System.out.println(primoNumero + secondoNumero);
                    main(args);
                }
                case "-" -> {

                    System.out.print("Secondo numero da calcolare: ");
                    secondoNumero = s.nextFloat();
                    System.out.println(primoNumero - secondoNumero);
                    main(args);
                }
                case "*" -> {

                    System.out.print("Secondo numero da calcolare: ");
                    secondoNumero = s.nextFloat();
                    System.out.println(primoNumero * secondoNumero);
                    main(args);
                }
                case "/" -> {

                    System.out.print("Secondo numero da calcolare: ");
                    secondoNumero = s.nextFloat();
                    if (primoNumero == 0 || secondoNumero == 0) {
                        System.out.println("numero non divisibbile per zero");
                    } else {
                        System.out.println(primoNumero / secondoNumero);
                    }
                    main(args);
                }
                default -> {

                    System.out.println("operatore invalido");
                    main(args);
                }
            }

        } catch (NoSuchElementException w){
            System.out.println("inserire solo numeri!!");
            s.nextLine();
            main(args);

        }
    }
}
