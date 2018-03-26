import java.util.Date;

public class Passenger
{
	private int Weight;
	private int startFloor;
	private int targetFloor;
	public String name;
	//public int floor;
	public Date arrivalElevatorDate;
	public Date startTravelDate;
	public Date endTravelDate;
	
	public Passenger(int w, int s, int t)
	{
		Weight = w;
		startFloor = s;
		targetFloor = t;
	}

	public final int GetStartFloor()
	{
		return startFloor;
	}
}