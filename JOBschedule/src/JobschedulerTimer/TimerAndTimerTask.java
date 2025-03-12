package JobschedulerTimer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerAndTimerTask {
	public static void main(String args[]) {
		
		Timer timer= new Timer();
		
		TimerTask task = new TimerTask()
		{

			@Override
			public void run() {
				System.out.println("Executed :"+ new java.util.Date());
				timer.cancel();   // Stops the timer after the task
			}

		};
		
		//timer.schedule(task, 6000);   //after 6 sec value is displayed
         // timer.schedule(task, 2000, 4000); // run after 2 sec and reapeat after 4 sec
          
       // Schedule task using calender
          
          Calendar calendar = Calendar.getInstance();
          calendar.set(Calendar.HOUR_OF_DAY, 17);  // 24 format
          calendar.set(Calendar.MINUTE, 48);
          calendar.set(Calendar.SECOND, 0);

          timer.schedule(task, calendar.getTime()); //scheduled the output at 5 48 gives op
	}

}
