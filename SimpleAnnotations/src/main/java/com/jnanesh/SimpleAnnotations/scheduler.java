package com.jnanesh.SimpleAnnotations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class scheduler {

//	@Scheduled(fixedDelay = 3000)         //with delay of 10 sec
//	public void RunwithDelay() {
//		
//		System.out.println("the curent date is:"+LocalDate.now());
//	}
	
//	@Scheduled(initialDelay = 10000 ,fixedRate = 5000)         //start with 10 sec and repeated after 5sec
//	public void RunwithDelay1() {
//		
//		System.out.println("the curent time is:"+LocalTime.now());
//	}
//	
	
      @Scheduled(initialDelayString = "PT05S",fixedRate = 2000)         //start with 30 sec(if H then hour ,If M then min) and repeated after 5sec
	  public void RunwithDelay2() {
		
		System.out.println("the curent time is:"+LocalTime.now());
	}
}

