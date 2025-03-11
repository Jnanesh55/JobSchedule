package com.jnanesh.Crons;

import java.time.LocalTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronScheduler {
      
	@Scheduled( cron = "*/30 * * * * *")
	public void time() {
		System.out.println("the time is:"+LocalTime.now());
	}
	
	
	@Scheduled( cron = "* * 9 * * MON")
	public void greet() {
		System.out.println("GOOD MORNING");
	}
	
	@Scheduled( cron = "0 */5 9 *  JAN  THU")
	public void reminder() {
		System.out.println("ATTEND MEETING");
	}
	
}
