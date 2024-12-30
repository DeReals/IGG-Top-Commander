import java.util.Scanner;

public class PhaseTwo {
	int totalPhaseTwoPoints;

	int heroSearch(){
		int advanceSearchPoints=0;
		int normalSearchPoints=0;
		int totalHeroSearchPoints = 0;

		System.out.println("Hero Search");
		System.out.println("|");

		Scanner scan = new Scanner(System.in);

		try{
			print("How many Advance Search?: ");
			int numofAdvanceSearchInput = scan.nextInt();
			advanceSearchPoints = numofAdvanceSearchInput * 8000;

			print("How many Normal Search?: ");
			int numofNormalSearchInput = scan.nextInt();
			normalSearchPoints = numofNormalSearchInput * 1000;

		}catch(Exception e){
			print("Error!");
		}
		totalHeroSearchPoints = advanceSearchPoints + normalSearchPoints;
		System.out.println("|");
		totalPhaseTwoPoints += totalHeroSearchPoints;
		return totalHeroSearchPoints;
	}


	int heroBadges(){
		Scanner scan = new Scanner(System.in);
		int totalHeroBadgePoints;
		int totalLegendaryHeroBadgesL = 0;
		int totalLegendaryHeroBadgesM = 0;
		int totalLegendaryHeroBadgesS = 0;
		int totalEliteHeroBadgesL = 0;
		int totalEliteHeroBadgesM = 0;
		int totalEliteHeroBadgesS = 0;

		try{
			//Add the Uncommon Badges when the situation calls for it
			//Legendary Badges
			print("How many Legendary Hero Badges Large?: ");
			int numOfLegendaryHeroBadgesLInput = scan.nextInt();
			totalLegendaryHeroBadgesL = numOfLegendaryHeroBadgesLInput * 20000;

			print("How many Legendary Hero Badges Medium?: ");
			int numOfLegendaryHeroBadgesMInput = scan.nextInt();
			totalLegendaryHeroBadgesM = numOfLegendaryHeroBadgesMInput * 8000;

			print("How many Legendary Hero Badges Small?: ");
			int numOfLegendaryHeroBadgesSInput = scan.nextInt();
			totalLegendaryHeroBadgesS = numOfLegendaryHeroBadgesSInput * 2000;

			//Elite badges
			print("How many Elite Hero Badges Large?: ");
			int numOfEliteHeroBadgesLInput = scan.nextInt();
			totalEliteHeroBadgesL = numOfEliteHeroBadgesLInput * 3000;

			print("How many Elite Hero Badges Medium?: ");
			int numOfEliteHeroBadgesMInput = scan.nextInt();
			totalEliteHeroBadgesM = numOfEliteHeroBadgesMInput * 1200;

			print("How many Elite Hero Badges Small?: ");
			int numOfEliteHeroBadgesSInput = scan.nextInt();
			totalEliteHeroBadgesS = numOfEliteHeroBadgesSInput * 300;

		}catch(Exception e){
			print("Error!");
		}
		System.out.println("|");
		totalHeroBadgePoints = totalLegendaryHeroBadgesL + totalLegendaryHeroBadgesM + totalLegendaryHeroBadgesS + totalEliteHeroBadgesL + totalEliteHeroBadgesM + totalEliteHeroBadgesS;
		totalPhaseTwoPoints += totalHeroBadgePoints;
		return totalHeroBadgePoints;
	}

	int heroFragments(){
		Scanner scan = new Scanner(System.in);
		int totalHeroFragment = 0;
		int totalLegendaryHeroFragment = 0;
		int totalEliteHeroFragment = 0;
		try{
			print("How many Legendary Hero Fragments?: ");
			int numOfLegendaryHeroFragmentInput = scan.nextInt();
			totalLegendaryHeroFragment = numOfLegendaryHeroFragmentInput * 10000;

			print("How many Elite Hero Fragments?: ");
			int numOfEliteHeroFragmentInput = scan.nextInt();
			totalEliteHeroFragment = numOfEliteHeroFragmentInput * 2000;
		}catch(Exception ex){
			print("Error!");
		}
		totalHeroFragment = totalLegendaryHeroFragment + totalEliteHeroFragment;
		totalPhaseTwoPoints += totalHeroFragment; // updates the total Phase Three Point
		return totalHeroFragment;

	}

	int eCore() {
		int eCorePoints;
		Scanner scan = new Scanner(System.in);

		System.out.print("How many Energy Core?: ");
		int eCoreAmountInput = scan.nextInt();
		eCorePoints = eCoreAmountInput * 15000;
		System.out.println("|");

		this.totalPhaseTwoPoints += eCorePoints;

		return eCorePoints;
	}
	
	
	public int ToString() {
		System.out.println("|Phase TWO|");
		print("Amount of Hero Search points: " + heroSearch() +"\n\n");
		print("Amount of Legendary Hero Badges points: " + heroBadges() +"\n\n");
		print("Amount of Legendary Hero Fragments points: " + heroFragments() +"\n\n");
		print("Amount of Energy Cores points: " + eCore() +"\n\n");
		return this.totalPhaseTwoPoints;
	}
	public static void print(String word){
		System.out.print(word);
	}
}
