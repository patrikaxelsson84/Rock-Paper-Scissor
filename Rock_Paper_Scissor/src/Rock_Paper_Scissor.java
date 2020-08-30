import java.util.Scanner;

public class Rock_Paper_Scissor {

	static int Userpoint = 0;
	static int Computerpoint = 0;
	static int player2point = 0;
	static int Games = 0; // Static to get in all methods
	static int User = 0;
	static int player2 = 0;
	static Scanner Reader = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to the game, Rock Paper Scissor.\n ");
		System.out.println("Play against player:P or computer:C other char quit the game.");
		String input = Reader.nextLine();
		if (input.equalsIgnoreCase("p")) { // ignore big letter
			Player2(); // If P get method Player2
		} else if (input.equalsIgnoreCase("c")) {

			while (Games <= 3) { // loop to games = 3 wins

				System.out.println("Rock: 1. Paper: 2. Scissor: 3.\nshot:---------------------------- ");

				try {
					
					User = Reader.nextInt();

					// User = Integer.parseInt(Reader.nextLine());
					// System.out.println("Testar "+ User);
				} catch (Exception e) {
					System.out.println("Error try again with 1,2 or 3.");
				}

				int Rand = (int) (Math.random() * 3);		//random input = Rand

				if (User == 3 && Rand == 2) {
					Userpoint++;
					Games++;
					System.out.println("You win, Scissor wins agains paper. " + Userpoint + ":" + Computerpoint
							+ " game:" + Games);

					User = Reader.nextInt();
				} else if (User == 2 && Rand == 1) {
					Userpoint++;
					Games++;
					System.out.println(
							"You win, Paper wins agains Rock. " + Userpoint + ":" + Computerpoint + " game:" + Games);
					
				} else if (User == 1 && Rand == 3) {
					Userpoint++;
					Games++;
					System.out.println(
							"You win, Rock wins agains Scissor. " + Userpoint + ":" + Computerpoint + " game:" + Games);
					
				} else if (Rand == 3 && User == 2) {
					Computerpoint++;
					Games++;
					System.out.println("You loose, Scissor wins agains paper. " + Userpoint + ":" + Computerpoint
							+ " game:" + Games);
					
				} else if (Rand == 2 && User == 1) {
					Computerpoint++;
					Games++;
					System.out.println(
							"You loose, Paper wins agains Rock. " + Userpoint + ":" + Computerpoint + " game:" + Games);
					
				} else if (Rand == 1 && User == 3) {
					Computerpoint++;
					Games++;
					System.out.println("You loose, Rock wins agains Scissor. " + Userpoint + ":" + Computerpoint
							+ " game:" + Games);
					
				} else
					System.out.println("Tie");
			}
		}
	}
	// Lite vad jag har lärt mig under tiden. Räkne sättet att games++ o användarnas poäng måste vara före outputen
	// jag måste köra en sak i taget. göra en användare i taget tex. sen methoden som hämtar dom.
	// hade kunnat göra en if win med 3 förslag, else if loose med 3 förslag, else tie med med 1. hade varit mindre text. 
	
	public static void Player2() {

		while (Games < 3) {
			System.out.println(
					"Rock: 1. Paper: 2. Scissor: 3.\nshot:-------------------------------------------------- ");
			try {
				User = Reader.nextInt();
				System.out.println("player2s Turn");
				player2 = Reader.nextInt();
				System.out.println("User picked:" + User + " and Player2 picked:" + player2);

				// User = Integer.parseInt(Reader.nextLine());
				// User = Reader.nextInt();
				// System.out.println("you toke "+ User);
			} catch (Exception e) {
				System.out.println("Error try again with 1,2 or 3.");
			}

			if (User == 3 && player2 == 2) {
				Userpoint++;
				Games++;
				System.out.println(
						"You win, Scissor wins agains paper. " + Userpoint + ":" + player2point + " game:" + Games);

				User = Reader.nextInt();
			} else if (User == 2 && player2 == 1) {
				Userpoint++;
				Games++;
				System.out.println(
						"You win, Paper wins agains Rock. " + Userpoint + ":" + player2point + " game:" + Games);
				
			} else if (User == 1 && player2 == 3) {
				Userpoint++;
				Games++;
				System.out.println(
						"You win, Rock wins agains Scissor. " + Userpoint + ":" + player2point + " game:" + Games);
				
			} else if (player2 == 3 && User == 2) {
				player2point++;
				Games++;
				System.out.println(
						"You loose, Scissor wins agains paper. " + Userpoint + ":" + player2point + " game:" + Games);
				
			} else if (player2 == 2 && User == 1) {
				player2point++;
				Games++;
				System.out.println(
						"You loose, Paper wins agains Rock. " + Userpoint + ":" + player2point + " game:" + Games);
				
			} else if (player2 == 1 && User == 3) {
				player2point++;
				Games++;
				System.out.println(
						"You loose, Rock wins agains Scissor. " + Userpoint + ":" + player2point + " game:" + Games);
				
			} else
				System.out.println("Tie");
		}
	}
}
