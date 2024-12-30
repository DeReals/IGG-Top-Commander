import java.util.Scanner;

public class PhaseFive {
    int totalPhaseFivePoints;

    int armamentTracker() {
        int armamentTrackerPoints;
        Scanner scan = new Scanner(System.in);

        print("How many armament Tracking?: ");
        int armamentTrackerAmountInput = scan.nextInt();
        armamentTrackerPoints = armamentTrackerAmountInput * 55000;
        System.out.println("|");

        this.totalPhaseFivePoints += armamentTrackerPoints;

        return armamentTrackerPoints;
    }

    int eliteHoning() {
        int eliteHoningPoints;
        Scanner scan = new Scanner(System.in);

        print("How many elite Honing?: ");
        int eliteHoningAmountInput = scan.nextInt();
        eliteHoningPoints = eliteHoningAmountInput * 38000;
        System.out.println("|");

        this.totalPhaseFivePoints += eliteHoningPoints;
        return eliteHoningPoints;
    }


    int uncommonHoning() {
        int uncommonHoningPoints;
        Scanner scan = new Scanner(System.in);

        print("How many uncommon Honing?: ");
        int uncommonHoningAmountInput = scan.nextInt();
        uncommonHoningPoints = uncommonHoningAmountInput * 1500;
        System.out.println("|");

        this.totalPhaseFivePoints += uncommonHoningPoints;
        return uncommonHoningPoints;
    }

    public int carbonSteel(){
        int totalCarbonSteelPoint;
        Scanner scan = new Scanner(System.in);

        print("How many Carbon Steel?: ");
        int totalCarbonSteelInput = scan.nextInt();
        totalCarbonSteelPoint = totalCarbonSteelInput * 2000;
        System.out.println("|");
        totalPhaseFivePoints += totalCarbonSteelPoint;
        return totalCarbonSteelPoint;
    }

    public int fabric(){
        int totalFabricPoint;
        Scanner scan = new Scanner(System.in);

        print("How many Fabric?: ");
        int totalFabricInput = scan.nextInt();
        totalFabricPoint = totalFabricInput * 200;
        System.out.println("|");
        totalPhaseFivePoints += totalFabricPoint;
        return totalFabricPoint;
    }

    public static void print(String word){
        System.out.print(word);
    }

    public int ToString(){
        System.out.println("Phase FIVE");
        print("Amount of Armament Tracker Points: "+ armamentTracker()+"\n\n");
        print("Amount of Elite Honing Points: "+ eliteHoning()+"\n\n");
        print("Amount of Uncommon Honing Points: "+ uncommonHoning()+"\n\n");
        print("Amount of Carbon Steel Points: "+ carbonSteel()+"\n\n");
        print("Amount of Fabric Points: "+fabric()+"\n\n");

        return totalPhaseFivePoints;
    }

}
