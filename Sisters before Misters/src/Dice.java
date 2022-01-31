
public class Dice
	{
		public static int dice1;
		public static int dice2;
		public static int diceRoll;
		
	public static void rollDice()
		{
		dice1 = (int) (Math.random()* 6)  + 1;
		dice2 = (int) (Math.random()* 6)  + 1;
		diceRoll = dice1 + dice2;
		
		if(MoveAround.clockwise)
			{
		
		if(MonopolyRunner.player1.getPlace() + Dice.diceRoll <= 39)
			{
				System.out.println("You rolled a " + Dice.diceRoll);
				MoveAround.newPlace =  MonopolyRunner.player1.getPlace() + Dice.diceRoll;
				//MonopolyRunner.player1.setPlace(MonopolyRunner.player1.getPlace() + Dice.diceRoll);
			}
	else if(MonopolyRunner.player1.getPlace() + Dice.diceRoll > 39)
		{
			System.out.println("You rolled a " + Dice.diceRoll);
			PassGo.PassGo();
			MoveAround.newPlace = (MonopolyRunner.player1.getPlace() + Dice.diceRoll) - 40; 
			//MonopolyRunner.player1.setPlace((MonopolyRunner.player1.getPlace() + Dice.diceRoll) - 40);
		}
			}
		else if(MoveAround.clockwise == false)
			{
				if(MonopolyRunner.player1.getPlace() - Dice.diceRoll < 0)
					{
						System.out.println("You rolled a " + Dice.diceRoll);
						PassGo.PassGo();
						MoveAround.newPlace = (MonopolyRunner.player1.getPlace() - Dice.diceRoll) + 40;
					}
						else if(MonopolyRunner.player1.getPlace() + Dice.diceRoll <= 39)
					{
						System.out.println("You rolled a " + Dice.diceRoll);
						MoveAround.newPlace =  MonopolyRunner.player1.getPlace() - Dice.diceRoll;
						//MonopolyRunner.player1.setPlace(MonopolyRunner.player1.getPlace() + Dice.diceRoll);
					}
			
			}
	}
	}
