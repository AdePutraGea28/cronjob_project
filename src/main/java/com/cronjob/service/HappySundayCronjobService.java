package com.cronjob.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HappySundayCronjobService {

    // @Scheduled(cron = "0 0 17 * * SUN") to set cron always run in specific hours
    @Scheduled(cron = "0 0 * * SUN") // --> this service will run every sunday at (00:00)
    public void sayHappySunday() {
        String yourName = "Ade Putra Gea";
        System.out.println("Happy Sunday" + " " + yourName + " " + "God bless you :)");
    }
}
