import java.util.Scanner;

public class PhaseFour {
    int totalPhaseFourPoints;

    int trainingSpeed(){
        int totalTrainingSpeedPoint;
        int totalTrainingSpeedMin;

        // Get the total number of resource speed-up transfer them all to minutes
        Scanner scan = new Scanner(System.in);

        int numof1m = 0;
        int numof5m = 0;
        int numof15m = 0;
        int numof30m = 0;
        int numof60m = 0;
        int numof4h = 0;
        int numof8h = 0;
        int numof15h = 0;
        int numof1d = 0;
        int numof3d = 0;

        System.out.println("Training Speed-up");
        System.out.println("|");


        try {
            print("How many 1 min speed-up?: ");
            int numof1mInput = scan.nextInt();
            //turn to minutes
            numof1m = 1*numof1mInput;

            print("How many 5 min speed-up?: ");
            int numof5mInput = scan.nextInt();
            //turn to minutes
            numof5m = 5*numof5mInput;

            print("How many 15 min speed-up?: ");
            int numof15mInput = scan.nextInt();
            //turn to minutes
            numof15m = 15*numof15mInput;

            print("How many 30 min speed-up?: ");
            int numof30mInput = scan.nextInt();
            //turn to minutes
            numof30m = 30*numof30mInput;

            print("How many 60 min speed-up?: ");
            int numof60mInput = scan.nextInt();
            //turn to minutes
            numof60m = 60*numof60mInput;

            print("How many 4 hour speed-up?: ");
            int numof4hInput = scan.nextInt();
            //turn to minutes
            numof4h = 4*60*numof4hInput;

            print("How many 8 hour speed-up?: ");
            int numof8hInput = scan.nextInt();
            //turn to minutes
            numof8h = 8*60*numof8hInput;

            print("How many 15 hour speed-up?: ");
            int numof15hInput = scan.nextInt();
            //turn to minutes
            numof15h = 15*60*numof15hInput;

            print("How many 1 day speed-up?: ");
            int numof1dInput = scan.nextInt();
            //turn to minutes
            numof1d = 24*60*numof1dInput;

            print("How many 3 day speed-up?: ");
            int numof3dInput = scan.nextInt();
            //turn to minutes
            numof3d = 72*60*numof3dInput;

        }catch(Exception ex) {
            print("Error!!");
        }
        System.out.println("|");

        totalTrainingSpeedMin = numof1m + numof5m + numof15m + numof30m + numof60m + numof4h + numof8h + numof15h + numof1d + numof3d;
        totalTrainingSpeedPoint = totalTrainingSpeedMin*200;

        totalPhaseFourPoints += totalTrainingSpeedPoint;
        return totalTrainingSpeedPoint;
    }


    public static void print(String word){
        System.out.print(word);
    }

    public int ToString(){
        System.out.println("|Phase FOUR|");
        print("Amount of Training points: "+trainingSpeed() +"\n\n");
        return this.totalPhaseFourPoints;
    }

}
