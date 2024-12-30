import java.util.Scanner;

class PhaseOne {
	int totalPhaseOnePoints = 0;
	
	
	int researchSpeed(){
		int totalResearchMin;
		int totalResearchPoints;
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
		
		System.out.println("Research Speed-up");
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
			
		}catch(Exception e) {
			print("Error!!");
		}
		System.out.println("|");
		totalResearchMin = numof1m + numof5m + numof15m + numof30m + numof60m + numof4h + numof8h + numof15h + numof1d + numof3d;
		totalResearchPoints = totalResearchMin*250;
		
		//convert them to points and add them to the total of phase one points
		this.totalPhaseOnePoints += totalResearchPoints;
		
		return totalResearchPoints;

	}
	
	
	//Similar aspect as the research
	int constructionSpeed(){
		int totalconstructionMin;
		int totalconstructionPoints;
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
		
		System.out.println("Construction Speed-up");
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
		
		totalconstructionMin = numof1m + numof5m + numof15m + numof30m + numof60m + numof4h + numof8h + numof15h + numof1d + numof3d;
		totalconstructionPoints = totalconstructionMin*250;
		
		//convert them to points and add them to the total of phase one points
		this.totalPhaseOnePoints += totalconstructionPoints;
		
		return totalconstructionPoints;

	}

	int generalSpeed(){
		int totalGeneralMin;
		int totalGeneralPoints;
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

		System.out.println("General Speed-up");
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

		totalGeneralMin = numof1m + numof5m + numof15m + numof30m + numof60m + numof4h + numof8h + numof15h + numof1d + numof3d;
		totalGeneralPoints = totalGeneralMin*250;

		//convert them to points and add them to the total of phase one points
		this.totalPhaseOnePoints += totalGeneralPoints;

		return totalGeneralPoints;

	}

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
		totalTrainingSpeedPoint = totalTrainingSpeedMin*250;

		totalPhaseOnePoints += totalTrainingSpeedPoint;
		return totalTrainingSpeedPoint;
	}

	int eFile() {
		int eFilePoints;
		Scanner scan = new Scanner(System.in);

		System.out.print("How many Exquisite File?: ");
		int eFileAmountInput = scan.nextInt();
		eFilePoints = eFileAmountInput * 10800;
		System.out.println("|");

		this.totalPhaseOnePoints += eFilePoints;

		return eFilePoints;
	}
	
	public static void print(String words) {
		System.out.print(words);
	}

	public int ToString() {
		System.out.println("|Phase ONE|");
		print("Amount of General Speed-up Points: " + generalSpeed() + "\n\n");
		print("Amount of Research Speed-up points: " + researchSpeed() + "\n\n");
		print("Amount of Construction Speed-up points: " + constructionSpeed() + "\n\n");
		print("Amount of Training Speed-up points: " + trainingSpeed() + "\n\n");
		print("Amount of Exquisite File points: " + eFile() + "\n\n");
		
		return this.totalPhaseOnePoints;
	} 

}
