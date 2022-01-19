public class Board
	{
		private String name;
		private int rent;
		private int placeNum;
		private boolean isTaken;
		
		public Board(String n, int r, int p, boolean t)
		{
			name = n;
			rent = r;
			placeNum = p;
			isTaken = t;
		}


		public String getName()
			{
				return name;
			}


		public void setName(String name)
			{
				this.name = name;
			}


		public int getRent()
			{
				return rent;
			}


		public void setRent(int rent)
			{
				this.rent = rent;
			}


		public int getPlaceNum()
			{
				return placeNum;
			}


		public void setPlaceNum(int placeNum)
			{
				this.placeNum = placeNum;
			}


		public boolean getisTaken()
			{
				return isTaken;
			}


		public void setTaken(boolean isTaken)
			{
				this.isTaken = isTaken;
			}
		


	}
