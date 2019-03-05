package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }
    @Override
    public void update(HomeworkTasksQueue homeworkTasksQueue) {
        int size = homeworkTasksQueue.getTasks().size();
        System.out.println(username + ": New tasks in " + homeworkTasksQueue.getName() + "\n" +
                " (total: " + size + (size !=1 ? " tasks)" : " task)"));
        updateCount++;
    }
    public String getUsername() {
        return username;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}

