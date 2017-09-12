package com.example.config;

import java.io.IOException;
import java.util.Properties;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class QuartzConfig
{
    @Autowired
    private SpringJobFactory springJobFactory;

    // 获取工厂bean
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean()
    {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        try
        {
            schedulerFactoryBean.setQuartzProperties(quartzProperties());
            schedulerFactoryBean.setJobFactory(springJobFactory);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return schedulerFactoryBean;
    }

    // 指定quartz.properties
    @Bean
    public Properties quartzProperties() throws IOException
    {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        ClassPathResource classPathResource=new ClassPathResource("/quartz.properties");
        propertiesFactoryBean.setLocation(classPathResource);
        propertiesFactoryBean.afterPropertiesSet();
        return propertiesFactoryBean.getObject();
    }

    // 创建schedule
    @Bean
    public Scheduler scheduler()
    {
        return schedulerFactoryBean().getScheduler();
    }
}