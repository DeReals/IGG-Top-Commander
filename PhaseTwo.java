package IGGSystemPoints;

import java.util.Scanner;

public class PhaseTwo {
	int totalPhaseTwoPoints;
	
	int arrow() {
		int arrowPoints;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many arrows?: ");
		int arrowAmountInput = scan.nextInt();
		arrowPoints = arrowAmountInput * 10800;
		System.out.println("|");
		
		this.totalPhaseTwoPoints += arrowPoints;
		
		return arrowPoints;
	}
	
	
	public int ToString() {
		System.out.println("|Phase TWO|");
		System.out.print("Amount of arrow points: " + arrow() + "\n\n");
		return this.totalPhaseTwoPoints;
	}
}
