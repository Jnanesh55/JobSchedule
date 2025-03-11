package com.jnanesh.QuartZ;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration     // it defines the configuration class and tells the spring that this bean is to connected to application context
public class QuartzConfig {

    @Bean   // indicates that whole this method is mananged by spring
     public JobDetail simpleJobDetail() {           //this method defines the job logic 
        return JobBuilder.newJob(SimpleJob.class)
                .withIdentity("simpleJob")          //simpleJob is the key
                .storeDurably()                    // Keeps job details even without triggers
                .build();
    }

    @Bean
    public Trigger simpleJobTrigger(JobDetail simpleJobDetail) {            //this method defines the time when job is executed
        return TriggerBuilder.newTrigger()
                .forJob(simpleJobDetail)
                .withIdentity("simpleTrigger")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(30)                      // main logic od scheduler
                        .repeatForever())                               // Repeat indefinitely
                .build();
    }
}

