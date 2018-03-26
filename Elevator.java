import java.util.*;
import java.util.ArrayList;

public class Elevator
{
	private int maxWieght;
	private int maxPeople;
	private int currentPeople;
	private int movingDirection; // 0-Up, 1-Down

	private ArrayList<Passenger> pList;
	private int floor; // current
	private int targetFloor;
	private boolean isIdle;

	public Elevator(int max1, int max2)
	{
		maxWieght = max1;
		maxPeople = max2;
		currentPeople = 0;
		pList = new ArrayList<Passenger>();
		movingDirection = 0; // up
		floor = 0; // ground
		isIdle = true;
		targetFloor = 0;
	}

	public final void Move(int time)
	{
		if (floor != targetFloor)
		{
			if (movingDirection == 0)
			{
				floor++;
			}
			else
			{
				floor--;
			}
			Log.Add(time, "Elevator is Moving to Floor " + floor);
		}
		else
		{
			if (!isIdle)
			{
				Log.Add(time, "Elevator is Coming to target Floor");
			}
			isIdle = true; // Coming...
		}
	}

	public final int GetFloor()
	{
		return floor;
	}

	public final boolean Idle()
	{
		return isIdle;
	}

	public final void StartMovingToFloor(int t)
	{
		targetFloor = t;
		isIdle = false; // Start moving...
	}

}