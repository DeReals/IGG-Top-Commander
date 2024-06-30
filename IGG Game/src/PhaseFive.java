import java.util.Scanner;

public class PhaseFive {
    int totalPhaseFivePoint;

    public int carbonSteel(){
        int totalCarbonSteelPoint;
        Scanner scan = new Scanner(System.in);

        print("How many Carbon Steel?: ");
        int totalCarbonSteelInput = scan.nextInt();
        totalCarbonSteelPoint = totalCarbonSteelInput * 2000;
        System.out.println("|");
        totalPhaseFivePoint += totalCarbonSteelPoint;
        return totalCarbonSteelPoint;
    }

    public int fabric(){
        int totalFabricPoint;
        Scanner scan = new Scanner(System.in);

        print("How many Fabric?: ");
        int totalFabricInput = scan.nextInt();
        totalFabricPoint = totalFabricInput * 200;
        System.out.println("|");
        totalPhaseFivePoint += totalFabricPoint;
        return totalFabricPoint;
    }

    public static void print(String word){
        System.out.print(word);
    }

    public int ToString(){
        System.out.println("Phase FIVE");
        print("Amount of Carbon Steel Points: "+ carbonSteel()+"\n\n");
        print("Amount of Fabric: "+fabric()+"\n\n");

        return totalPhaseFivePoint;
    }

}
