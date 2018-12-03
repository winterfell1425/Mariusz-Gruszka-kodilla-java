package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask(){
        System.out.println("Executing: " + taskName +". I am going to drive to " + where + " with " + using);
        return true;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }
    @Override
    public boolean isTaskExecuted() {
        if (executeTask()) {
            return true;
        } else {
            return false;
        }
    }
}