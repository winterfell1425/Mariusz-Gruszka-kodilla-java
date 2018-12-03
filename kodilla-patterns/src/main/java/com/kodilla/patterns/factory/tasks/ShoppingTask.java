package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask (final String taskName, final String whatToBuy, final double quantity){
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public boolean executeTask(){
        System.out.println("Executing: " + taskName +". I am going to buy " + quantity + " of " + whatToBuy);
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
