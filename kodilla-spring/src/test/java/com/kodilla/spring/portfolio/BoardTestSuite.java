package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        System.out.println("Board before additions:  " + board);
        //When & Then
        board.getToDoList().getTasks().add("My task 1");
        board.getInProgressList().getTasks().add("My task 2");
        board.getDoneList().getTasks().add("My task 3");
        Board boardAfterAdditions = context.getBean(Board.class);
        System.out.println("Board after additions:  " + boardAfterAdditions);
    }
}
