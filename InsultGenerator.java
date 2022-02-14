/* 
 * 	Process 
 *  1. Asks user how many insults they want
 *  2. user enters a number
 *  3. Spits out an insult
 *  4. Asks if user wants another insult
 *  5. Enter "0" to quit program
 */

import java.util.Scanner;

public class InsultGenerator
{

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		
		String[] columnA = 
			{"Bawdy", "Brazen", "Churlish", "Distempered", "Fitful", 
				"Gnarling", "Greasy", "Grizzled", "Haughty", "Hideous",
				"Jaded", "Knavish", "Lewd", "Peevish", "Pernicious", 
				"Prating", "Purpled", "Queasy", "Rank", "Reeky",
				"Roynish", "Saucy", "Sottish", "Unmuzzled", "Vacant", 
				"Waggish", "Wanton", "Wenching", "Whoreson", "Yeasty"}; 
		
		String[] columnB =
			{"Bunch-backed", "Clay-brained", "Dog-hearted", "Empty-hearted", "Evil-eyed", 
				"Eye-offending", "Fat-kidneyed", "Heavy-handed", "Horn-mad", "Ill-breeding",
				"Ill-composed", "Ill-nurtured", "Iron-witted", "Lean-witted", "Lily-livered", 
				"Mad-bread", "Motley-minded", "Muddy-mettled", "Onion-eyed", "Pale-hearted",
				"Paper-faced", "Pinch-spotted", "Raw-boned", "Rug-headed", "Rump-fed", 
				"Shag-eared", "Shrill-gorged", "Sour-faced", "Weak-hinged", "White-livered"};
		
		String[] columnC = 
			{"Canker-blossom", "Clotpole", "Crutch", "Cutpurse", "Dogfish", 
				"Egg-shell", "Gull-catcher", "Hedge-pig", "Hempseed", "Jack-a-nape",
				"Malkin", "Malignancy", "Malt-worm", "Manikin", "Minimus", 
				"Miscreant", "Moldwarp", "Nut-hook", "Pantaloon", "Rabbit-sucker", 
				"Rampallion", "Remnant", "Rudesby", "Ruffian", "Scantling", 
				"Scullion", "Snipe", "Waterfly", "Whipster", "Younker"};
		
		
		
		System.out.println("How many insults would you like? Enter 0 to quit.");
		
		int numInsults = input.nextInt();
		
		// Exit if user entered 0
		if (numInsults == 0)
		{
			System.exit(0);
		}
		else
		{
			// Generate x number of insults reflecting number user entered
			int i = -1; 
			
			for(i = numInsults; i > 0; i--)
			{
				// random number generator for array columnA
				int randomA = (int) (Math.random() * 29) ;

				// random number generator for array columnB
				int randomB = (int) (Math.random() * 29) ;
				
				// random number generator for array columnC
				int randomC = (int) (Math.random() * 29) ;
				
				
				System.out.println("Thou " + columnA[randomA] + " " + columnB[randomB] + 
						" " + columnC[randomC] + "!\n");
			}
		}				
	}
}
