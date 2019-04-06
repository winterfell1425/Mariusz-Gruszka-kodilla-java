package com.kodilla.good.patterns.playlist;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
       SubPlaylist subPlaylist = new SubPlaylist();

        ArrayList<String> nestedPlaylist = new ArrayList<String>();
        nestedPlaylist.add("Muzyka:The Beatles 'Lucy in the Sky With Diamonds'");
        nestedPlaylist.add("Muzyka:Rolling Stones 'Paint It Black' ");
        nestedPlaylist.add("Muzyka: The Beatles 'Imagine'");
        nestedPlaylist.add("Film: 'Pandora's Box'");
        nestedPlaylist.add("Muzyka:The Beatles 'Yesterday'");

        subPlaylist.multiplyNestedPlaylist(nestedPlaylist);
        subPlaylist.shufflePlaylist(nestedPlaylist);

        Playlist playlist = new Playlist();

        ArrayList<String> thePlaylist = new ArrayList<>();
        thePlaylist.add("Muzyka:Rolling Stones 'Brown Sugar' ");
        thePlaylist.addAll(nestedPlaylist);
        thePlaylist.add("Film: 'Casablanca'");

        playlist.playInLoop(thePlaylist);
       // playlist.playRandomly(thePlaylist);
       // playlist.playSequentially(thePlaylist);




    }
}
