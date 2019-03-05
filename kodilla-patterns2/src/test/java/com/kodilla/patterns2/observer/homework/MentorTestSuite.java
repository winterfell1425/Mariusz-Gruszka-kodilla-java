package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkTasksQueue mariuszHomeworkTasksQueue = new MariuszHomeworkTasksQueue();
        HomeworkTasksQueue annaHomeworkTasksQueue = new AnnaHomeworkTasksQueue();
        HomeworkTasksQueue mikeHomeworkTasksQueue = new MikeHomeworkTasksQueue();
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");
        mariuszHomeworkTasksQueue.registerMentor(johnSmith);
        mikeHomeworkTasksQueue.registerMentor(ivoneEscobar);
        annaHomeworkTasksQueue.registerMentor(johnSmith);

        //When
        mariuszHomeworkTasksQueue.addTask("Hibernate");
        mariuszHomeworkTasksQueue.addTask("Primitive data types");
        mariuszHomeworkTasksQueue.addTask("Strings");
        mikeHomeworkTasksQueue.addTask("Variables");
        mikeHomeworkTasksQueue.addTask("Hello World");
        annaHomeworkTasksQueue.addTask("Arrays");
        annaHomeworkTasksQueue.addTask("Exceptions");
        annaHomeworkTasksQueue.addTask("Constructors");
        annaHomeworkTasksQueue.addTask("Decision Making Statements");
            //Then
        assertEquals(7, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
    }
}
