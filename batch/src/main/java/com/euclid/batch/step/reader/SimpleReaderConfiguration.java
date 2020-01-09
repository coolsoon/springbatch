package com.euclid.batch.step.reader;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.batch.MyBatisPagingItemReader;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.euclid.batch.model.vo.People;

//@Slf4j
@Configuration
public class SimpleReaderConfiguration {
    @Bean(name ="peoplePagingItemReader")
    @StepScope
    public MyBatisPagingItemReader<People> readPeople(@Qualifier("firstSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
    	MyBatisPagingItemReader<People> peoplePagingItemReader = new MyBatisPagingItemReader<People>();
        peoplePagingItemReader.setQueryId("getListPeople");
        peoplePagingItemReader.setSqlSessionFactory(sqlSessionFactory);
        peoplePagingItemReader.setPageSize(10);
        return peoplePagingItemReader;
    }
}
