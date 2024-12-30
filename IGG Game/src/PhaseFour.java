import java.util.Scanner;

public class PhaseFour {
    int totalPhaseFourPoints;

    int magicTicket() {
        int magicTicketPoints;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many Magic Ticket?: ");
        int magicTicketAmountInput = scan.nextInt();
        magicTicketPoints = magicTicketAmountInput * 12700;
        System.out.println("|");

        this.totalPhaseFourPoints += magicTicketPoints;

        return magicTicketPoints;
    }

    int arrow() {
        int arrowPoints;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many arrows?: ");
        int arrowAmountInput = scan.nextInt();
        arrowPoints = arrowAmountInput * 10800;
        System.out.println("|");

        this.totalPhaseFourPoints += arrowPoints;

        return arrowPoints;
    }



    public static void print(String word){
        System.out.print(word);
    }

    public int ToString(){
        System.out.println("|Phase FOUR|");
        print("Amount of Magic Ticket points: " + magicTicket() +"\n\n");
        print("Amount of Arrow points: " + arrow() +"\n\n");
        return this.totalPhaseFourPoints;
    }

}
