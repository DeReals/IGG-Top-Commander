import java.util.Scanner;
// Train Squad
public class PhaseThree {
    int totalPhaseThreePoints;

    int trainSquad(){
        int trainSquadPoints;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many T6 Squad Train?: ");
        int trainSquadAmountInput = scan.nextInt();
        trainSquadPoints = trainSquadAmountInput * 150;
        System.out.print("How many T5 Squad Train?: ");
        int trainSquadAmountInput2 = scan.nextInt();
        trainSquadPoints += trainSquadAmountInput2 * 80;
        System.out.print("How many T4 Squad Train?: ");
        int trainSquadAmountInput3 = scan.nextInt();
        trainSquadPoints += trainSquadAmountInput3 * 40;
        System.out.println("|");

        this.totalPhaseThreePoints += trainSquadPoints;
        return trainSquadPoints;
    }

    public static void print(String word){
        System.out.print(word);
    }
    public int ToString(){
        System.out.println("|Phase THREE|");
        print("Amount of Squad Train points: " + trainSquad() +"\n\n");
        return this.totalPhaseThreePoints;
    }
}
