package com.example.scheduledDemo;

import java.util.Date;

import org.assertj.core.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTest
{
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTest.class);
    
    public final static long ONE_Minute =  60 * 1000;

    @Scheduled(fixedDelay=ONE_Minute)
    public void fixedDelayJob(){
        logger.info(DateUtil.formatAsDatetime(new Date())+" >>fixedDelay执行....");
    }

    @Scheduled(fixedRate=ONE_Minute)
    public void fixedRateJob(){
        logger.info(DateUtil.formatAsDatetime(new Date())+" >>fixedRate执行....");
    }

    @Scheduled(cron="0 15 3 * * ?")
    public void cronJob(){
        logger.info(DateUtil.formatAsDatetime(new Date())+" >>cron执行....");
    }

}
