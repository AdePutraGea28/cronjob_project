package com.cronjob.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CurrentDateCronjobService {

    @Scheduled(cron = "* * * * * ?")
    public void showCurrentDate() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
    }
}
