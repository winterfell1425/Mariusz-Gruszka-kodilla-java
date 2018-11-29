package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;
    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;
    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean
    public Board board() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList toDoListCreator() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList inProgressListCreator() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList doneListCreator() {
        return new TaskList();
    }
}
