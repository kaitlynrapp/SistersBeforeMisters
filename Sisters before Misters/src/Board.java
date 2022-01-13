public class Board
	{
		private String name;
		private int rent;
		private int placeNum;
		
		public Board(String n, int r, int p)
		{
			name = n;
			rent = r;
			placeNum = p;
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


	}
