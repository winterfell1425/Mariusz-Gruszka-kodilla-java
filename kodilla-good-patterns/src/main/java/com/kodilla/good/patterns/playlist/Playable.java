package com.kodilla.good.patterns.playlist;

public class Playable {
    private String header;

    public Playable(String header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return header + '\'' +
                '}';
    }
}
