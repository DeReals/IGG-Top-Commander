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
		totalResearchPoints = totalResearchMin*150;
		
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
		totalconstructionPoints = totalconstructionMin*150;
		
		//convert them to points and add them to the total of phase one points
		this.totalPhaseOnePoints += totalconstructionPoints;
		
		return totalconstructionPoints;

	}
	
	int uncommonHoning() {
		int uncommonHoningPoints;
		Scanner scan = new Scanner(System.in);
		
		print("How many uncommon Honing?: ");
		int uncommonHoningAmountInput = scan.nextInt();
		uncommonHoningPoints = uncommonHoningAmountInput * 3000;
		System.out.println("|");
		
		this.totalPhaseOnePoints += uncommonHoningPoints;
		return uncommonHoningPoints;
	}
	
	int eliteHoning() {
		int eliteHoningPoints;
		Scanner scan = new Scanner(System.in);
		
		print("How many elite Honing?: ");
		int eliteHoningAmountInput = scan.nextInt();
		eliteHoningPoints = eliteHoningAmountInput * 44800;
		System.out.println("|");
		
		this.totalPhaseOnePoints += eliteHoningPoints;
		return eliteHoningPoints;
	}
	
	int armamentTracker() {
		int armamentTrackerPoints;
		Scanner scan = new Scanner(System.in);
		
		print("How many armament Tracking?: ");
		int armamentTrackerAmountInput = scan.nextInt();
		armamentTrackerPoints = armamentTrackerAmountInput * 53400;
		System.out.println("|");
		
		this.totalPhaseOnePoints += armamentTrackerPoints;
		
		return armamentTrackerPoints;
	}
	
	public static void print(String words) {
		System.out.print(words);
	}
	
	
	public int ToString() {
		System.out.println("|Phase ONE|");
		print("Amount of Research points: " + researchSpeed() + "\n\n");
		print("Amount of Construction points: " + constructionSpeed() + "\n\n");
		print("Amount of Uncommon Honing points: " + uncommonHoning() + "\n\n");
		print("Amount of Elite Honing points: " + eliteHoning() + "\n\n");
		print("Amount of Armamant Tracker points: " + armamentTracker() + "\n\n");
		
		return this.totalPhaseOnePoints;
	} 

}
