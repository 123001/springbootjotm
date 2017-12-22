package com.example.demo.service.impl;

import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author NieQiqun
 * @date 2017/12/21.
 */
@Service
public class MyServiceImpl implements MyService{
    @Autowired
    @Qualifier("first")
    JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("second")
    JdbcTemplate jdbcTemplate1;

    @Transactional
    public void myTest(Integer a1, Integer a2) {
        jdbcTemplate.execute("INSERT INTO person(id, name, age) VALUES (" + a1 + ",'aaa1', 18)");
        jdbcTemplate1.execute("INSERT INTO person(id, name, age) VALUES (" + a2 + ",'aaa2', 18)");
    }
}
