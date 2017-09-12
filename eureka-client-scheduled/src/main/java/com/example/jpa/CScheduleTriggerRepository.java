package com.example.jpa;


import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.example.entity.CScheduleTrigger;

@Repository
public interface CScheduleTriggerRepository extends PagingAndSortingRepository<CScheduleTrigger, Integer>,
        QueryDslPredicateExecutor<CScheduleTrigger>, QueryByExampleExecutor<CScheduleTrigger>
{

}