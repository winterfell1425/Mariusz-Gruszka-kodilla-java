package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(toDoListCreator(), inProgressListCreator(), doneListCreator());
    }

    @Bean(name = "toDoList")
    public TaskList toDoListCreator() {
        return new TaskList();
    }
    @Bean(name = "inProgressList")
    public TaskList inProgressListCreator() {
        return new TaskList();
    }
    @Bean(name = "doneList")
    public TaskList doneListCreator() {
        return new TaskList();
    }
}
