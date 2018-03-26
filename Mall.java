import java.util.*;
import java.util.concurrent.TimeUnit;

public class Mall
{
	private Elevator E1;
	private int Time;

	private int nFloors;
	private List[] q;


	public Mall()
	{
		long ts = System.currentTimeMillis();
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
			}
		}, 1000, 1000);
		E1 = new Elevator(600, 9);
		Time = 0;

		nFloors = 6;
		q = new List[nFloors];
		for (int i = 0; i < nFloors; i++)
		{
			q[i] = new LinkedList<Passenger>();
			//q.add(new LinkedList<>());
		}
		
		Log.Add(Time, "Strating...");
	}

	//private void Log(int time, string val)
	//{

	//}

	public final void Simulate(int finalTime)
	{
		while (Time < finalTime)
		{
			/*Soimething Happends...*/
			CheckForWaiting();
			// Elevators moving...
			E1.Move(Time);

			Time++;
		}
	}

	private void CheckForWaiting()
	{
		for (int i = 0; i < nFloors; i++)
		{
			if (!q[i].isEmpty())
			{
				if (E1.Idle())
				{
					if (E1.GetFloor() != i)
					{
						E1.StartMovingToFloor(i);
					}
					else
					{
						// Try to add passenger to E1
					}
				}
			}
		}
	}


	public final void Add(Passenger p1)
	{
		int from = p1.GetStartFloor();
		((LinkedList<Passenger>) q[from]).offer(p1);
	}
}
