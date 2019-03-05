package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerMentor(Observer mentor);
    void notifyMentors();
    void removeMentor(Observer mentor);
}
