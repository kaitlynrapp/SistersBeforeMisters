
public class Player
	{

		private String character;
		private int balance;
		private int place;
		
		public Player(String c, int b, int p)
			{
				character = c;
				balance = b;
				place = p;
			}

		public String getCharacter()
			{
				return character;
			}

		public void setCharacter(String character)
			{
				this.character = character;
			}

		public int getBalance()
			{
				return balance;
			}

		public void setBalance(int balance)
			{
				this.balance = balance;
			}
		public void addToBalance(int b)
			{
			balance =+ b;
			}

		public int getPlace()
			{
				return place;
			}

		public void setPlace(int place)
			{
				this.place = place;
			}
		public void incrementPlace(int il)
			{
				place+= il;
				if(place>40) {
					place-=40;
				}
			}
		public void reverseIncrementPlace(int il)
			{
				place+= il;
				if(place<2
						0) {
					place-=40;
				}
			}
	}

	
