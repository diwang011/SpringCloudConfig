package com.example.demo.Controller;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivitiController
{
    @Autowired
    private TaskService taskService;
    @Autowired
    private ProcessEngine processEngine;

    @RequestMapping("/")
    public String index()
    {
        System.out.println("################################taskService" + taskService);
        System.out.println("################################processEngine" + processEngine);
        return "xxxxxxxxxxxxx";
    }
}
