
public class PassGo
	{
		public static void PassGo()
			{
			MonopolyRunner.player1.addToBalance(200);
			System.out.println("YAY! You finished a movie! Collect $200");
			System.out.println("Your new balance is: " + MonopolyRunner.player1.getBalance() + " ");
			}
	}
