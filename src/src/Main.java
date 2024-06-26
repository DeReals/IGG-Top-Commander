//David Ogunbanjo
//Project description: this project is to compute points depending on the total item the individual have

public class Main {
    public static void main(String[] args){
    	int TopCommanderPoints = 0;
       PhaseOne p1 = new PhaseOne();
       PhaseTwo p2 = new PhaseTwo();
       PhaseThree p3 = new PhaseThree();
      
       int phaseOne = p1.ToString();
       int phaseTwo = p2.ToString();
       int phaseThree = p3.ToString();


       System.out.println("------------------------------");
       System.out.print("|Phase 1 total points: "+phaseOne+"\n");
       System.out.println("------------------------------");
       System.out.println("------------------------------");
       System.out.print("|Phase 2 total points: "+phaseTwo+"\n");
       System.out.println("------------------------------");
       System.out.println("------------------------------");
       System.out.print("|Phase 3 total points: "+phaseThree+"\n");
       System.out.println("------------------------------");
       TopCommanderPoints = phaseOne + phaseTwo + phaseThree;
       
       
       System.out.println("Top Commander Total Points: " + TopCommanderPoints);
    }
}
//Plan
// prompts the user for all the item that are currently available
// Return the points that can be earned from those items.
//Break it down to the amount of points earned every Phase
// Give the estimated total points

//Extra
// give option to earn more points (ex: kill this amount of zombies to earn additional points)