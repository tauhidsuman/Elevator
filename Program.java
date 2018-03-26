

public class Program
{
	public static void main(String[] args)
	{
		Mall mall = new Mall();
		Passenger p1 = new Passenger(80, 1, 5);
		mall.Add(p1);
		mall.Simulate(1000); // Final Time
	}
}