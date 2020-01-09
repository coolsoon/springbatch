package com.euclid.batch.job.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleStepExecutionListener extends StepExecutionListenerSupport {

    @Override
    public void beforeStep(StepExecution stepExecution) {
        log.info("[STEP]=============================================[STARTED]");
        super.beforeStep(stepExecution);
    }
    
    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        log.info("[STEP]=============================================[FINISHED]");
        return super.afterStep(stepExecution);
    }    

}