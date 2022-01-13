import java.util.ArrayList;
public class Chance
	{
		private String output;
		private int changePlace;
		private int money;
		
		public Chance (String o, int c, int m)
		{
			output = o;
			changePlace = c;
			money = m;
		}
		
		public String getOutput()
			{
				return output;
			}
		public void setOutput(String output)
			{
				this.output = output;
			}
		public int getChangePlace()
			{
				return changePlace;
			}
		public void setChangePlace(int changePlace)
			{
				this.changePlace = changePlace;
			}

		public int getMoney()
			{
				return money;
			}

		public void setMoney(int money)
			{
				this.money = money;
			}
		
		
		

	}
