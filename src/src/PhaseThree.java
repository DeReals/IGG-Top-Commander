import java.util.Scanner;

public class PhaseThree {
    int totalPhaseThreePoints;


    int heroSearch(){
        int advanceSearchPoints=0;
        int normalSearchPoints=0;

        System.out.println("Hero Search");
        System.out.println("|");

        Scanner scan = new Scanner(System.in);

        try{
            print("How many Advance Search?: ");
            int numofAdvanceSearchInput = scan.nextInt();
            advanceSearchPoints = numofAdvanceSearchInput * 10000;

            print("How many Normal Search?: ");
            int numofNormalSearchInput = scan.nextInt();
            normalSearchPoints = numofNormalSearchInput * 2000;

        }catch(Exception e){
            print("Error!");
        }
        int totalHeroSearchPoints = advanceSearchPoints + normalSearchPoints;
        System.out.println("|");
        totalPhaseThreePoints += totalHeroSearchPoints;
        return totalHeroSearchPoints;
    }

    /*
    int heroBadges(){
        int totalHeroBadgePoints;

        return totalHeroBadgePoints;
    }

     */

    public static void print(String word){
        System.out.print(word);
    }
    public int ToString(){
        System.out.println("|Phase THREE|");
        print("Amount of Hero Search points: " + heroSearch() +"\n\n");

        return totalPhaseThreePoints;
    }
}
