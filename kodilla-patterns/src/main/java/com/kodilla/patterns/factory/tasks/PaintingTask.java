package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask(){
        System.out.println("Executing: " + taskName +". I am going to paint a " + whatToPaint + " " + color);
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
