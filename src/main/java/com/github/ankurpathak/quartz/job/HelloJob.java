package com.github.ankurpathak.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import javax.tools.JavaCompiler;

public class HelloJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException{
        System.out.println("Hello, Job!!!");
    }
}
