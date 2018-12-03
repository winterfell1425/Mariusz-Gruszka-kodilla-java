package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTaskSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("DairyShopping", shoppingTask.getTaskName());
    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("HousePainting", paintingTask.getTaskName());
    }
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("CabDriving", drivingTask.getTaskName());
    }
}
