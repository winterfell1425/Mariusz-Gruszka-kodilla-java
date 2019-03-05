package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class HomeworkTasksQueue implements Observable {
    private final List<Observer> mentors;
    private ArrayDeque<String> tasks = new ArrayDeque<>();
    private final String name;

    public HomeworkTasksQueue(String name) {
        mentors = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.name = name;
    }
    public void addTask(String task) {
        tasks.offer(task);
        notifyMentors();
    }
    @Override
    public void registerMentor(Observer mentor) {
        mentors.add(mentor);
    }
    @Override
    public void notifyMentors() {
        for(Observer observer : mentors) {
            observer.update(this);
        }
    }
    @Override
    public void removeMentor(Observer mentor){
        mentors.remove(mentor);
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}

