package com.kodilla.good.patterns.playlist;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {

    public void playSequentially(ArrayList<String> listToPlay) {
        for (String name : listToPlay)
            System.out.println(name);
    }

    public void playRandomly(ArrayList<String> listToPlay) {
        Collections.shuffle(listToPlay);
        for (String name : listToPlay)
            System.out.println(name);
    }

    public void playInLoop(ArrayList<String> listToPlay) {
        for (int n = 0; n < 3; n++) {
            for (String name : listToPlay)
                System.out.println(name);
        }
    }
}
