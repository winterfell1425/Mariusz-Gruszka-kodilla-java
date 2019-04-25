package com.kodilla.good.patterns.playlist;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {

    public void playSequentially(ArrayList<Playable> listToPlay) {
        for (Playable name : listToPlay)
            System.out.println(name);
    }

    public void playRandomly(ArrayList<Playable> listToPlay) {
        Collections.shuffle(listToPlay);
        for (Playable name : listToPlay)
            System.out.println(name);
    }

    public void playInLoop(ArrayList<Playable> listToPlay) {
        for (int n = 0; n < 3; n++) {
            for (Playable name : listToPlay)
                System.out.println(name);
        }
    }
}