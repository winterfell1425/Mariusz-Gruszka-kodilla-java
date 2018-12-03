package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("DairyShopping", "' 1-liter bottles of milk'", 2.0);
            case PAINTINGTASK:
                return new PaintingTask("HousePainting", "white", "kitchen");
            case DRIVINGTASK:
                return new DrivingTask("CabDriving", "an airport", "a cab");
                default:
                    return null;
        }
    }
}
