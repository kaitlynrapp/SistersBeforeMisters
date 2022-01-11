
public class Board
	{
		private String name;
		private int rent;
		private String color;
		
		
		public Board(String n, int r, String c)
		{
			name = n;
			rent = r;
			color = c;
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


		public String getColor()
			{
				return color;
			}


		public void setColor(String color)
			{
				this.color = color;
			}
	}
