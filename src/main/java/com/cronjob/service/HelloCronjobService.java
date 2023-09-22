package com.cronjob.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HelloCronjobService {

    @Scheduled(cron = "0 * * * * ?") // --> every minute will run crojob method
    public void sayHello() {
        System.out.println("Hello every 60 second i will greeting you");
    }

}
