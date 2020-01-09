package com.euclid.batch.step.process;

import org.springframework.batch.item.ItemProcessor;

import com.euclid.batch.model.vo.People;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PeopleItemProcessor implements ItemProcessor<People,People> {
    
    @Override
    public People process(People item) throws Exception {
        log.error("### first -> second : item = {}", item.toString());
        return item;
    }

}
