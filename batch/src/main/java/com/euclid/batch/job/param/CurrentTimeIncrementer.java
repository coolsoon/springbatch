package com.euclid.batch.job.param;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersIncrementer;

import com.euclid.batch.util.DateUtils;

public class CurrentTimeIncrementer implements JobParametersIncrementer {

    @Override
    public JobParameters getNext(JobParameters parameters) {
    	String today = DateUtils.getCurrentDateTime("yyyy-MM-dd");   
    
        return new JobParametersBuilder()
        		.addString("run.date", today)
        		.addLong("run.id", System.currentTimeMillis())
        		.toJobParameters();
    }

}
